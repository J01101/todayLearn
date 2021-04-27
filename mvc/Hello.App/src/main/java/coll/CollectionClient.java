package coll;
 
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
 
public class CollectionClient {
 
  public static void main(String[] args) {
    //1. Spring 컨테이너 구동한다.
    AbstractApplicationContext factory = 
        new GenericXmlApplicationContext("app-context2.xml");
    
    //2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다
    CollectionBean coll = (CollectionBean)factory.getBean("coll");
    List<String> list = coll.getList();
    
    for(String li :list) {
      System.out.println(li);
    }
    
    ///////////////////////////////////////////
    
    Map<String,String> map = coll.getMap();
    System.out.println(map.entrySet()); 
    
    ///////////////////////////////////////////
    
    Properties proper = coll.getProper();
    System.out.println(proper); 

    //3.Spring 컨테이너를 종료한다.
    factory.close();
  }
}