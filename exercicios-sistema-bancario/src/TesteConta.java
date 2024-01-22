public class TesteConta {

  public static void main(String[] args) {

    ContaCorrente cc = new ContaCorrente();
    cc.depositar(100);
    System.out.println("O saldo inicial da conta corrente é " + cc.getSaldo());

    cc.sacar(20);
    System.out.println("O saldo atual da conta corrente é " + cc.getSaldo());

    ContaPoupanca cp = new ContaPoupanca();
    cp.depositar(100);
    System.out.println("O saldo inicial da conta é " + cp.getSaldo());

    cp.sacar(20);
    System.out.println("O saldo atual da conta é " + cp.getSaldo());

    System.out.println(cp.simularRendimento());

    System.out.println(cp.simularRendimento(0.10));
  }

}
