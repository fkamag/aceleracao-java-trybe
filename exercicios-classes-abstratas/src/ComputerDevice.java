public abstract class ComputerDevice {
  private final String brand;
  private double storageCapacity;
  public static final double MAX_STORAGE_CAPACITY = 2048.0;

  public ComputerDevice(String brand, double storageCapacity) {
    this.brand = brand;
    this.storageCapacity = storageCapacity;
  }

  public String getBrand() {
    return this.brand;
  }

  public double getStorageCapacity() {
    return this.storageCapacity;
  }

  public abstract void bootUp();

  public final void shutDown() {
    System.out.println("Desligando o dispositivo...");
  }

}
