package coupling;
 
public class SamsungTV {
  
  private int price;
  
  public void setPrice(int price) {
    this.price = price;
  }
  
        public void powerOn() {
                System.out.println("SamsungTV.....전원 켠다.");
                System.out.println("price : " + price);
        }
        public void powerOff() {
                System.out.println("SamsungTV.....전원 끈다.");
        }
        public void volumeUp() {
                System.out.println("SamsungTV.....소리 올린다.");
        }
        public void volumeDown() {
                System.out.println("SamsungTV.....소리 내린다.");
        }
        
}