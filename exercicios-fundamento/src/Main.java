import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//    HashMap<String, String> estudantes = new HashMap<String, String>();
//    estudantes.put("x038702","João");
//    estudantes.put("x784244","Maria");
//    estudantes.put("x105852","Joana");
//    System.out.println("Estudantes: "+estudantes);
//    String valorAnterior = estudantes.put("x038702","José"); // Mesma matricula usada no mapeamento com João
//    System.out.println("Valor anterior de x038702: "+valorAnterior);
//    System.out.println("Estudantes: "+estudantes);
//    System.out.println(estudantes.get("x105852"));
//    estudantes.remove("x038702");
//    System.out.println("Estudantes: "+estudantes);
//    System.out.println(estudantes.size());

//    Collection<Estudante> estudantes = CodeExamples.obterEntrada();
//    List<String> matriculas = estudantes.stream()
//        .filter(e -> "Computação".equals(e.getCursso()))
//        .sorted(Comparator.comparing(Estudante::getNome))
//        .map(Estudante::getMatricula)
//        .toList();
//    System.out.println(matriculas);
//
//    Collection<String> nomes = List.of("João", "Maria", "João", "José", "José", "Joana");
//    long pessoasDistintas = nomes.stream()
//        .distinct()
//        .count();
//    System.out.println(pessoasDistintas);
//
//    Estudante estudanteMario = estudantes.stream()
//        .filter(e -> "Bernardo".equals(e.getNome()))
//        .findAny()
//        .orElse(null);
//
//    System.out.println(estudanteMario.getMatricula() + " " + estudanteMario.getNome());
//
//    Collection<String> numeros = Stream.of("um","dois","três","quatro")
//        .filter(e -> e.length()>3)
//        .toList();
//
//    System.out.println(numeros);

    // Praticar

    // Exercício 1
    List<Integer> numeros = List.of(7, 4, 5, 6, 9, 8, 2);
    System.out.println(numeros);
    List<Integer> pares = numeros.stream()
        .filter(e -> e % 2 == 0)
        .toList();
    System.out.println(pares);

    //Exercício 2
    List<String> nomes = List.of("fabio", "jose", "maria");
    System.out.println(nomes);
    List<String> nomesMaiuscula = nomes.stream()
        .map(String::toUpperCase)
        .toList();
    System.out.println(nomesMaiuscula);

    //Exercício 3
    Integer soma = numeros.stream()
        .mapToInt(e -> e)
        .sum();
    System.out.println(soma);

    //Exercício 4
    List<String> result = stringsMaioresQueX(nomes, 4);
    System.out.println(result);

  }

  public static List<String> stringsMaioresQueX(List<String> palavras, int x) {
    return palavras.stream()
        .filter(e -> e.length() > x)
        .toList();
  }

}
