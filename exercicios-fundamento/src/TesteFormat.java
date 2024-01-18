import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteFormat {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número:");
    double number = scanner.nextDouble();

    DecimalFormat df;
    if (number * 10 % 1 == 0) {
      df = new DecimalFormat("0.0");
    } else {
      df = new DecimalFormat("0.##");
    }

    System.out.println(df.format(number) + "%");
  }
}
