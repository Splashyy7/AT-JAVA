public class N6 {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("ABC1234", "Toyota Corolla", 2020, 45000.5);

        Veiculo veiculo2 = new Veiculo("XYZ9876", "Honda Civic", 2022, 12500.8);

        System.out.println("=== DETALHES INICIAIS DOS VEÍCULOS ===");
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        System.out.println("=== REGISTRANDO VIAGENS ===");
        veiculo1.registrarViagem(250.5);
        System.out.println("Viagem de 250.5 km registrada para o veículo 1");

        veiculo2.registrarViagem(180.3);
        System.out.println("Viagem de 180.3 km registrada para o veículo 2");

        System.out.println("=== DETALHES ATUALIZADOS DOS VEÍCULOS ===");
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
        System.out.println("Detalhes do Veículo:");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            this.quilometragem += km;
        } else {
            System.out.println("Erro: A quilometragem da viagem deve ser maior que zero");
        }
    }
}