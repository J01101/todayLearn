package ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
 
  public static void main(String[] args) {
    // 1. Spring 컨테이너 구동
    AbstractApplicationContext factory = 
        new GenericXmlApplicationContext("META-INF/spring/app-context.xml");
    // app-context.xml을 읽어 들여서 bean 객체를 생성해줌
    
    // 2. spring 컨테이너로 부터 필요한 객체를 요청(lookup)한다.
    TV tv = (TV)factory.getBean("tv");
    TV tv2 = (TV)factory.getBean("tv2");
    TV tv3 = (TV)factory.getBean("tv3");
    
    tv.powerOn();
    tv.powerOff();
    tv.volumeUp();
    tv.volumeDown();
   
    tv2.powerOn();
    tv2.powerOff();
    tv2.volumeUp();
    tv2.volumeDown();
    
    tv3.powerOn();
    tv3.powerOff();
    tv3.volumeUp();
    tv3.volumeDown();
    
    // 3. Spring 컨테이너 종료
    factory.close();
  }
}