package ioc;
 
public class LgTV implements TV {
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
  
  public LgTV() {
    System.out.println(">>>>>>> LgTV 객체 생성");
  }
  
  public void powerOn() {
    System.out.println("LgTV.....전원 켠다.");
    System.out.println("price : " + price);
  }
 
  public void powerOff() {
    System.out.println("LgTV.....전원 끈다.");
  }
 
  public void volumeUp() {
    //System.out.println("LgTV.....소리 올린다.");
    speaker.volumeUp();
  }
 
  public void volumeDown() {
    //System.out.println("LgTV.....소리 내린다.");
    speaker.volumeDown();
  }
 
}