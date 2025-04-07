public class N6 {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("12345678", "Gol", 2008, 50000.0);
        Veiculo veiculo2 = new Veiculo("ABCDEFGH", "Fusca", 1960, 10000.0);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        veiculo1.registrarViagem(200.0);
        veiculo2.registrarViagem(400.0);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}
class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("--------------------------------");
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            this.quilometragem += km;
            System.out.println(km + " km adicionados ao veículo de placa " + placa);
        } else {
            System.out.println("Quilometragem inválida para registro.");
        }
    }
}