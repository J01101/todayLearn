package ioc;
 
public class SamsungTV implements TV {
 private AppleSpeaker speaker;
 private int price;
 
 public void setSpeaker(AppleSpeaker speaker) {
   this.speaker = speaker;
   System.out.println(">>> setSpeaker() 호출");
 }
 
 public void setPrice(int price) {
   System.out.println(">>> setPrice() 호출");
   this.price = price;
 }
 
 public SamsungTV(AppleSpeaker speaker, int price) {
   System.out.println(">>>>>>> SamsungTV(2) 객체 생성");
   this.speaker = speaker;
   this.price = price;
 }
  
  public void initMethod() {
    System.out.println("객체 초기화 작업.");
  }
  
  public void destroyMethod() {
    System.out.println("객체삭제 전 처리할 작업.");
  }
  
  public SamsungTV() {
   System.out.println(">>>>>>> SamsungTV 객체 생성");
  }
  
  public void powerOn() {
    System.out.println("SamsungTV.....전원 켠다.");
    System.out.println("price : " + price);
  }
 
  public void powerOff() {
    System.out.println("SamsungTV.....전원 끈다.");
  }
 
  public void volumeUp() {
    //System.out.println("SamsungTV.....소리 올린다.");
    speaker.volumeUp();
  }
 
  public void volumeDown() {
    //System.out.println("SamsungTV.....소리 내린다.");
    speaker.volumeDown();
  }
}