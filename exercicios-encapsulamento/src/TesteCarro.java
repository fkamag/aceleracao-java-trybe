public class TesteCarro {

  public static void main(String[] args) {

    Carro carro1 = new Carro("Hyundai", "HB20", 2022);
    carro1.exibirInformacoes();

    System.out.println(carro1.getMarca());
    System.out.println(carro1.getModelo());
    System.out.println(carro1.getAno());

    carro1.setMarca("VW");
    carro1.setModelo("Gol");
    carro1.setAno(1998);

    System.out.println(carro1.getMarca());
    System.out.println(carro1.getModelo());
    System.out.println(carro1.getAno());

    Carro carro2 = new Carro("Fiat", "Tempra", 1993);

    System.out.print("Quantidade de carros criados até o momento: ");
    Carro.quantidadeDeCarros();


  }

}
