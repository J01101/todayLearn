package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CommandService;

public class MyinfoAction implements Action {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
    // TODO Auto-generated method stub
    // 모델 사용
    CommandService service = new CommandService();
    StringBuffer sb = service.getMyinfo();
    // 결과 request에 저장
    request.setAttribute("myinfo", sb);
    // 해당 결과를 보여줄 view 페이지 리턴
    return "/view/myinfo.jsp";
  }

}
