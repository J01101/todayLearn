package coupling;
 
public class LgTV {
   private String id;
   
   public LgTV() {}
   
   public LgTV(String id) {
     this.id = id;
   }
   
   public void turnOn() {
    System.out.println("LgTV.....전원 켠다.");
    System.out.println("id : " + id);
   }
   public void turnOff() {
    System.out.println("LgTV.....전원 끈다.");
   }
   public void soundUp() {
    System.out.println("LgTV.....소리 올린다.");
   }
   public void soundDown() {
    System.out.println("LgTV.....소리 내린다.");
   }
}