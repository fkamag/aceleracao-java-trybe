import static java.lang.Math.abs;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Idade {
  public long calcularIdadeEmDias(String nascimento) {
    LocalDate hoje = LocalDate.now();
    LocalDate dataNascimento = LocalDate.parse(nascimento);

     return ChronoUnit.DAYS.between(dataNascimento, hoje);
  }

  public int calcularIdadeEmAnos(String nascimento) {
    LocalDate hoje = LocalDate.now();
    LocalDate dataNascimento = LocalDate.parse(nascimento);

    Period idade = Period.between(dataNascimento, hoje);
    return idade.getYears();
  }

  public static void main(String[] args) {
    Idade idade = new Idade();
    System.out.println("A sua idade é: " +
        idade.calcularIdadeEmAnos("1970-05-26"));

    System.out.println("A quantidade de dias desde o seu nascimento é: " +
        idade.calcularIdadeEmDias("1970-05-26"));
  }

}
