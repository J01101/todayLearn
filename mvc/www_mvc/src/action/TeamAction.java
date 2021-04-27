package action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CommandService;

public class TeamAction implements Action {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
    // TODO Auto-generated method stub
    CommandService service = new CommandService();
    List<Map> list = service.teamList();
    request.setAttribute("team", list);
    return "/view/teamlist.jsp";
  }

}
