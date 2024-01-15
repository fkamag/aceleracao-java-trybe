public class Main {

  public static void main(String[] args) {
    SmartHouse smartHouse = new SmartHouse();
    System.out.println("Estado da lâmpada: " + smartHouse.isLampadaLigada());
    System.out.println("Ligar lâmpada");
    smartHouse.ligarLampada();
    System.out.println("Estado da lâmpada: " + smartHouse.isLampadaLigada());
    System.out.println("Desligar lâmpada");
    smartHouse.desligarLampada();
    System.out.println("Estado da lâmpada: " + smartHouse.isLampadaLigada());
    System.out.println("ligar internet " + smartHouse.conectarInternet(120));

  }

}
