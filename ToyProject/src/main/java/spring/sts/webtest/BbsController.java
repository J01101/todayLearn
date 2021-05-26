package spring.sts.webtest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.model.bbs.BbsDAO;
import spring.model.bbs.BbsDTO;
import spring.utility.webtest.Utility;

@Controller
public class BbsController {
    @Autowired
    private BbsDAO dao;

    @PostMapping("/bbs/delete")
    public String delete(int bbsno, String passwd, String oldfile, HttpServletRequest request) {

        String upDir = request.getRealPath("/storage");
        Map map = new HashMap();
        map.put("bbsno", bbsno);
        map.put("passwd", passwd);
        boolean pflag = dao.passCheck(map);
        boolean flag = false;
        if (pflag) {
            if (oldfile != null)
                Utility.deleteFile(upDir, oldfile);
            flag = dao.delete(bbsno);
        }

        if (!pflag) {
            return "/bbs/passwdError";
        } else if (flag) {
            return "redirect:/bbs/list";
        } else {
            return "/bbs/error";
        }

    }

    @GetMapping("/bbs/delete")
    public String delete(int bbsno, Model model) {
        boolean flag = dao.checkRefnum(bbsno);

        model.addAttribute("flag", flag);

        return "/bbs/delete";

    }

    @PostMapping("/bbs/reply")
    public String reply(BbsDTO dto, HttpServletRequest request) {
        String basePath = request.getRealPath("/storage");
        if (dto.getFilenameMF() != null) {
            dto.setFilename(Utility.saveFileSpring(dto.getFilenameMF(), basePath));
            dto.setFilesize((int) dto.getFilenameMF().getSize());
        }

        Map map = new HashMap();
        map.put("grpno", dto.getGrpno());
        map.put("ansnum", dto.getAnsnum());
        dao.upAnsnum(map);
        boolean flag = dao.createReply(dto);

        if (flag) {
            return "redirect:/bbs/list"; // 재요청
        } else {
            return "/bbs/error";
        }

    }

    @GetMapping("/bbs/reply")
    public String reply(int bbsno, Model model) {

        model.addAttribute("dto", dao.readReply(bbsno));
        return "/bbs/reply";
    }

    @PostMapping("/bbs/update")
    public String update(BbsDTO dto, String oldfile, HttpServletRequest request) {
        String basePath = request.getRealPath("/storage");
        if (dto.getFilenameMF() != null) {
            if (oldfile != null)
                Utility.deleteFile(basePath, oldfile);
            dto.setFilename(Utility.saveFileSpring(dto.getFilenameMF(), basePath));
            dto.setFilesize((int) dto.getFilenameMF().getSize());
        }

        Map map = new HashMap();
        map.put("bbsno", dto.getBbsno());
        map.put("passwd", dto.getPasswd());
        boolean pflag = dao.passCheck(map);
        boolean flag = false;

        if (pflag) {
            flag = dao.update(dto);
        }

        if (!pflag) {
            return "/bbs/passwdError";
        } else if (flag) {
            return "redirect:/bbs/list";
        } else {
            return "/bbs/error";
        }

    }

    @GetMapping("/bbs/update")
    public String update(int bbsno, Model model) {

        model.addAttribute("dto", dao.read(bbsno));

        return "/bbs/update";
    }

    @GetMapping("/bbs/read")
    public String read(int bbsno, Model model) {

        dao.upViewcnt(bbsno);

        BbsDTO dto = dao.read(bbsno);

        String content = dto.getContent().replaceAll("\r\n", "<br>");

        dto.setContent(content);

        model.addAttribute("dto", dto);

        return "/bbs/read";
    }

    @RequestMapping("/bbs/list")
    public String list(HttpServletRequest request) {
        // 검색관련------------------------
        String col = Utility.checkNull(request.getParameter("col"));
        String word = Utility.checkNull(request.getParameter("word"));

        if (col.equals("total")) {
            word = "";
        }

        // 페이지관련-----------------------
        int nowPage = 1;// 현재 보고있는 페이지
        if (request.getParameter("nowPage") != null) {
            nowPage = Integer.parseInt(request.getParameter("nowPage"));
        }
        int recordPerPage = 3;// 한페이지당 보여줄 레코드갯수

        // DB에서 가져올 순번-----------------
        int sno = ((nowPage - 1) * recordPerPage) + 1;
        int eno = nowPage * recordPerPage;

        Map map = new HashMap();
        map.put("col", col);
        map.put("word", word);
        map.put("sno", sno);
        map.put("eno", eno);

        int total = dao.total(col, word);

        List<BbsDTO> list = dao.list(map);

        String paging = Utility.paging(total, nowPage, recordPerPage, col, word);

        // request에 Model사용 결과 담는다
        request.setAttribute("list", list);
        request.setAttribute("nowPage", nowPage);
        request.setAttribute("col", col);
        request.setAttribute("word", word);
        request.setAttribute("paging", paging);

        return "/bbs/list";
    }

    @GetMapping("/bbs/create")
    public String create() {
        return "/bbs/create";
    }

    @PostMapping("/bbs/create")
    public String create(BbsDTO dto, HttpServletRequest request) {
        String basePath = request.getRealPath("/storage");
        if (dto.getFilenameMF() != null) {
            dto.setFilename(Utility.saveFileSpring(dto.getFilenameMF(), basePath));
            dto.setFilesize((int) dto.getFilenameMF().getSize());
        }

        boolean flag = dao.create(dto);

        if (flag) {
            return "redirect:/bbs/list"; // 재요청
        } else {
            return "/bbs/error";
        }

    }

}