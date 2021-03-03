package model; 

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

public class CommandService{ 

    /** 
     * 기본 생성자 
     */ 
    public CommandService() { 
        super(); 
    } 

    public StringBuffer getMyinfo() {
      StringBuffer sb = new StringBuffer(); 
      
      sb.append("<li> 이름 : 홍길동<br>"); 
      sb.append("<li> 전화 번호 : 010 - 123 - 4567 <br>"); 
      sb.append("<li> 주소 : 서울시 엔코아구 <br>"); 
      sb.append("<li> 성격 : 꼼꼼함 <br>"); 
       
      return sb; 
    }
    
    public StringBuffer getHello(){ 
        StringBuffer sb = new StringBuffer(); 
        sb.append("<li> 안녕하세요..MVC 입니다.<br>"); 
        sb.append("<li> Template Page<br>"); 
        sb.append("<li> URI Command Pattern<br>"); 
        sb.append("<li> Properties 파일을 이용한 처리입니다.<br>"); 
         
        return sb; 

    } 

    public String getDate(){ 
        Date dt = new Date(); 
        String str = dt.toLocaleString();  
         
        return str; 
    }

    public List<Map> teamList() {
      // TODO Auto-generated method stub
      List<Map> list = new ArrayList<Map>();
     
      Map<String, String> map = new HashMap<String, String>();
      map.put("name", "홍길동");
      map.put("phone", "010-123-4567");
      map.put("address", "서울시 엔코아구");
      
      list.add(map);
      
      map = new HashMap<String, String>();
      map.put("name", "김길동");
      map.put("phone", "010-234-5678");
      map.put("address", "서울시 플레이구");
      
      list.add(map);
      
      map = new HashMap<String, String>();
      map.put("name", "박길동");
      map.put("phone", "010-345-6789");
      map.put("address", "서울시 데이타구");
      
      list.add(map);
      
      map = new HashMap<String, String>();
      map.put("name", "이길동");
      map.put("phone", "010-456-7890");
      map.put("address", "서울시 인공지능구");
      
      list.add(map);
      
      return list;
    } 

} 