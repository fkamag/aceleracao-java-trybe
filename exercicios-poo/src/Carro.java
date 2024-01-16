public class Carro {

  static int contador = 0;
  private String marca;
  private String modelo;
  private int ano;

  public Carro(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    contador++;
  }

  public void exibirInformacoes() {
    System.out.printf("Marca: %s, Modelo: %s, Ano: %d ", this.marca,
        this.modelo, this.ano);
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  static void quantidadeDeCarros() {
    System.out.println(contador);
  }
}
