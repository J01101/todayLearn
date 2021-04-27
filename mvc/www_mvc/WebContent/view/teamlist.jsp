<%@ page contentType = "text/html; charset=UTF-8" import = "java.util.*"%> 
<html> 
<head><title>TeamList</title></head> 
<body> 
<div align="center"> 
<br>
<h1> 
<% List<Map> list = (List<Map>)request.getAttribute("team"); %> 
</h1> 
</div> 

<div class="container">
  <h2>Team Table</h2>
  <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>            
  <table class="table">
    <thead>
      <tr>
        <th>이름</th>
        <th>전화번호</th>
        <th>주소</th>
      </tr>
    </thead>
    <tbody>
      <tr>
      <% for(int i=0; i<list.size(); i++){
        Map<String, String> map = list.get(i);
      %>
        <td><%= map.get("name") %></td>
        <td><%= map.get("phone") %></td>
        <td><%= map.get("address") %></td>
      </tr>
      <% 
      }
      %>
    </tbody>
  </table>
</div>

</body> 
</html> 