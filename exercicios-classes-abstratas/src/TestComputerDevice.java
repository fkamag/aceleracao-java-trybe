public class TestComputerDevice {

  public static void main(String[] args) {
    Laptop laptop = new Laptop("Samsung", 100, 14);
    Desktop desktop = new Desktop("Dell", 500);
    PowerBank powerBank = new PowerBank();
    ComputerDevice genericDevice = new Laptop("Apple", 256, 13.3);

    if (genericDevice instanceof Laptop) {
      Laptop specificLaptop = (Laptop) genericDevice;
      checkDevice(specificLaptop);
    }

    checkDevice(laptop);
    checkDevice(desktop);

    plugDevice(laptop);
    plugDevice(powerBank);
  }

  public static void checkDevice(ComputerDevice device) {
    System.out.println("Verificando dispositivo de marca " + device.getBrand());
    device.bootUp();
  }

  public static void plugDevice(Chargeable chargeable) {
    System.out.println("A bateria atual é " + chargeable.getBatteryLevel());
    chargeable.charge();
  }

}
