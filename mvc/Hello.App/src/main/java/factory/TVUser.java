package factory;
 
public class TVUser {
 
  public static void main(String[] args) {
    TV  tv = BeanFactory.getBean(args[0]);
    tv.powerOn();
    tv.powerOff();
    tv.volumeUp();
    tv.volumeDown();
 
    tv = BeanFactory.getBean(args[1]);
    tv.powerOn();
    tv.powerOff();
    tv.volumeUp();
    tv.volumeDown();
  }
}