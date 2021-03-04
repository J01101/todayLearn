package polymorphism;
 
public class TVUser {
 
  public static void main(String[] args) {
    TV  tv = new SamsungTV();
    tv.powerOn();
    tv.powerOff();
    tv.volumeUp();
    tv.volumeDown();
 
    TV  tv2 = new LgTV();
    tv2.powerOn();
    tv2.powerOff();
    tv2.volumeUp();
    tv2.volumeDown();
  }
}