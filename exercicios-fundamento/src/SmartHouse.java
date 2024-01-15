

/**
 * Classe.
 **/
public class SmartHouse {
  boolean lampada = false;

  public void ligarLampada() {
    lampada = true;
  }

  public void desligarLampada() {
    lampada = false;
  }

  public boolean isLampadaLigada() {
    return lampada;
  }

  public boolean conectarInternet(double taxa) {
    return taxa > 0.5;
  }
}
