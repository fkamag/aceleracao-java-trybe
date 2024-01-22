public class PowerBank implements Chargeable {

  @Override
  public void charge() {
    System.out.println("Carregando o powerbank...");
  }

  @Override
  public int getBatteryLevel() {
    return 65;
  }
}
