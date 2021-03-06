package dogDoor;
import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {

  private DogDoor door; //필드

  public BarkRecognizer(DogDoor door) { //생성자
    this.door = door;
  }

  public void recognize(Bark bark) { //메소드
    System.out.println("   BarkRecognizer: Heard a '" +
        bark.getSound() + "'");
    List allowedBarks = door.getAllowedBarks();
    for (Iterator i = allowedBarks.iterator(); i.hasNext(); ) {
      Bark allowedBark = (Bark)i.next();
      if (allowedBark.equals(bark)) {
        door.open();
        return;
      }
    } 
    System.out.println("This dog is not allowed.");
  }
}