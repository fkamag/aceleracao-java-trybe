import java.time.LocalTime;

public class PontoEletronico {

  public void marcarHoraExtra() {
    LocalTime horaAtual = LocalTime.now();
    LocalTime fimExpediente = LocalTime.parse("16:00:00");

    if (horaAtual.isAfter(fimExpediente)) {
      System.out.println("Funcionário está fazendo hora extra");
    } else {
      System.out.println("Funcionário está dentro do expediente de trabalho");
    }
  }

  public static void main(String[] args) {
    PontoEletronico ponto = new PontoEletronico();
    ponto.marcarHoraExtra();
  }

}
