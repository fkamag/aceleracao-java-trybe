public class ContaPoupanca extends Conta {

  @Override
  public void sacar(double valor) {
    this.saldo -= valor + 2;
  }

  public double simularRendimento() {
    return saldo * 0.05;
  }

  public double simularRendimento(double taxa) {
    return saldo * taxa;
  }
}
