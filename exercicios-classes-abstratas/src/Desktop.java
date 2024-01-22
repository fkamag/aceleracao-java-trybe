public final class Desktop extends ComputerDevice {

  public Desktop(String brand, double storageCapacity) {
    super(brand, storageCapacity);
  }

  @Override
  public void bootUp() {
    System.out.println("Inicializando o computador desktop...");
  }
}
