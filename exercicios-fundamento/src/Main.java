import java.util.HashMap;

public class Main {

  public static void main(String[] args) {

//    // testando SmartHouse
//    SmartHouse smartHouse = new SmartHouse();
//    System.out.println("Estado da lâmpada: " + smartHouse.isLampadaLigada());
//    System.out.println("Ligar lâmpada");
//    smartHouse.ligarLampada();
//    System.out.println("Estado da lâmpada: " + smartHouse.isLampadaLigada());
//    System.out.println("Desligar lâmpada");
//    smartHouse.desligarLampada();
//    System.out.println("Estado da lâmpada: " + smartHouse.isLampadaLigada());
//    System.out.println("ligar internet " + smartHouse.conectarInternet(120));
//
//    // testando Television
//    Television tv = new Television();
//    Television television = new Television("Phillips", "LCD", 32);
//    television.turnOn();
//    television.turnOff();
//
//    System.out.println(television.info());
//
//    System.out.print("O volume atual é: ");
//    System.out.println(television.getVolume());
//    System.out.println("Aumentando o volume");
//    for (int i = 0; i < 8; i++) {
//      television.increaseVolume();
//    }
//    System.out.print("O volume atual é: ");
//    System.out.println(television.getVolume());
//    System.out.println("Abaixando o volume");
//    for (int i = 0; i < 6; i++) {
//      television.descreaseVolume();
//    }
//    System.out.print("O volume atual é: ");
//    System.out.println(television.getVolume());
//
//    System.out.print("Modelo antigo: ");
//    System.out.println(television.getModel());
//    television.setModel("LCD-Ultra");
//    System.out.print("Modelo novo: ");
//    System.out.println(television.getModel())

//    Set<String> estudantes = Set.of("João","Maria","Pedro","Rosa");
//    System.out.println(estudantes);
//    estudantes.add("Fábio");  //não pode mudar estudantes pois Set é imutável

//    HashSet<String> estudantes = new HashSet<>();
//    boolean adicionouJoao = estudantes.add("João");
//    boolean adicionouJoaoDeNovo = estudantes.add("João");
//    boolean adicionouMaria = estudantes.add("Maria");
//    System.out.printf("adicionouJoao: %b%n",adicionouJoao);
//    System.out.printf("adicionouJoaoDeNovo: %b%n",adicionouJoaoDeNovo);
//    System.out.printf("adicionouMaria: %b%n",adicionouMaria);
//    System.out.println(estudantes);
//    estudantes.remove("João");
//    System.out.println(estudantes.size());
//    System.out.println(estudantes.contains("Maria"));

    HashMap<String, String> estudantes = new HashMap<String, String>();
    estudantes.put("x038702","João");
    estudantes.put("x784244","Maria");
    estudantes.put("x105852","Joana");
    System.out.println("Estudantes: "+estudantes);
    String valorAnterior = estudantes.put("x038702","José"); // Mesma matricula usada no mapeamento com João
    System.out.println("Valor anterior de x038702: "+valorAnterior);
    System.out.println("Estudantes: "+estudantes);
    System.out.println(estudantes.get("x105852"));
    estudantes.remove("x038702");
    System.out.println("Estudantes: "+estudantes);
    System.out.println(estudantes.size());


  }

}

