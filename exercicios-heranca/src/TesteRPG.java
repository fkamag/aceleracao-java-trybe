public class TesteRPG {

  public static void main(String[] args) {
    Warrior warrior = new Warrior();
    warrior.setName("Aragorn");
    warrior.setRace("Humano");
    warrior.setWeapon("Espada");
    System.out.println(warrior.getName() + " é da raça " + warrior.getRace() + " e utiliza "
        + warrior.getWeapon());

    Mage mage = new Mage();
    mage.setName("Pettros");
    mage.setRace("Reptiliano");
    mage.setSpell("Conjuração");
    System.out.println(mage.getName() + " é da raça " + mage.getRace() + " e utiliza "
        + mage.getSpell());

    Cleric cleric = new Cleric();
    cleric.setName("Zara");
    cleric.setRace("Elfo");
    cleric.setMagic("Cura e Luz");
    System.out.println(cleric.getName() + " é da raça " + cleric.getRace() + " e utiliza "
        + cleric.getMagic());

    warrior.move();
    warrior.attack();

    mage.move();
    mage.attack();

    cleric.move();
    cleric.attack();

    moveAndAttack(warrior);
    moveAndAttack(cleric);

    Barbarian barbarian = new Barbarian();
    barbarian.setName("Grush");
    barbarian.move();

    cleric.heal();
    cleric.heal("Poção de Vida");
    cleric.heal("Feitiço de Luz", 7);
  }

  public static void moveAndAttack(PlayableCharacter player) {
    player.move();
    player.attack();
  }

}
