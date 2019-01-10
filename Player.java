public class Player extends Squishy {

  private int level;          // playable character level
  private int damage_taken;   // damage taken to calculate limit
  private int manapoints;

  public Player(int hitpoints, int strength, int dexterity, int vitality, int magic, int spirit, int luck, int manapoints) {
    super(hitpoints, strength, dexterity, vitality, magic, spirit, luck);
    this.manapoints = manapoints;
    level = 5;

  }

}
