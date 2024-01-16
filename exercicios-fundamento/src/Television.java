public class Television {

  private String brand;
  private String model;
  private int size;
  private boolean isOn = false;
  private static final int MAX_VOLUME = 30;
  private int volume = 0;

  public Television() {
    System.out.println("Construtor da classe Television sendo executado...");
  }

  public Television(String brand, String model, int size) {
    this.brand = brand;
    this.model = model;
    this.size = size;
  }

  public void increaseVolume() {
    if (volume < MAX_VOLUME) {
      volume++;
    }
  }

  public void descreaseVolume() {
    if (volume >0) {
      volume--;
    }
  }

  public void turnOn() {
    System.out.println("Ligando televisão...");
    isOn = true;
  }

  public void turnOff() {
    System.out.println("Desligando televisão...");
    isOn = false;
  }

  public String info() {
    return "Marca: %s, Modelo: %s, Tamanho: %d, Ligada: %b".formatted(
        brand, model, size, isOn
    );
  }

  public int getVolume() {
    return volume;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

}
