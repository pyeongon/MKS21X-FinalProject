public class MilitaryPolice extends Enemy {

  public MilitaryPolice(int hitpoints, int strength, int dexterity, int vitality, int magic, int spirit, int luck) {
    super(hitpoints, strength, dexterity, vitality, magic, spirit, luck);

  }

  public void attack(Squishy target) {
    if((int)(Math.random() * 10000) % 2 == 0) {
      // Machine Gun
      super.attack(target, 7);

    } else {
      // Tonfa
      super.attack(target, 10);

    }

  }

  public String getName() {
    return "MP";

  }


}
