public class PlayableCharacter {

  private String name; // nome
  private String race; // raça (elfo, humano, orc)
  protected boolean isAlive;

  public PlayableCharacter() {
    this.isAlive = true;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public void move() {
    if (!isAlive) {
      System.out.println("Personagem morreu e não pode se mover.");
      return;
    }

    System.out.println(name + " está se movendo!");
  }

  public void attack() {
    if (!isAlive) {
      System.out.println("Personagem morreu e não pode atacar.");
      return;
    }

    System.out.println(name + " está atacando!");
  }

}
