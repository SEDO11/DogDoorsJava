package dogDoor;
public class Bark {

  private String sound; //�ʵ�

  public Bark(String sound) { //������
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }

  public boolean equals(Object bark) {
    if (bark instanceof Bark) {
      Bark otherBark = (Bark)bark;
      if (this.sound.equalsIgnoreCase(otherBark.sound)) { //�Ҹ��� ���� ��, true
        return true; 
      }
    }
    return false; //�Ҹ��� �ٸ� �� false
  }
}