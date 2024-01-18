public class Mage extends PlayableCharacter {

  private String spell;

  public String getSpell() {
    return spell;
  }

  public void setSpell(String spell) {
    this.spell = spell;
  }

  @Override
  public void attack() {
    System.out.println("O mago lança um feitiço.");
  }
}
