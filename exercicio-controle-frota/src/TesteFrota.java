public class TesteFrota {

  public static void main(String[] args) {
    CarroEmpresa c1 = new CarroEmpresa("RTF 1234", 2018);
    Caminhao c2 = new Caminhao("REE 3214", 2015);

    c1.abastecer("Posto1", "Atanes", 180);
    c1.abastecer("Posto2", "Adriana", 230);
    c1.abastecer("Posto1", "Gilberto", 200);

    c2.abastecer("Posto1", "Atanes", 210);
    c2.abastecer("Posto1", "Atanes", 220);
    c2.abastecer("Posto1", "Atanes", 310);

    c1.listaAbastecimentos();
    c2.listaAbastecimentos();
  }

}
