public class CarroEmpresa extends Veiculo {

  public CarroEmpresa(String placa, int anoFabricacao) {
    super(placa, anoFabricacao);
    this.setCombustivel("Flex");
  }

  @Override
  public void abastecer(String local, String motorista, double valor) {
    this.abastecimentos.add(String.format("Local: %s, Motorista: %s, valor: R$ %.2f",
        local, motorista, valor));
  }
}
