package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        FabricaVeiculos fabrica;
        String tipoVeiculo = "Eletrico"; // Pode ser "Gasolina" ou "Eletrico"

        if (tipoVeiculo.equals("Gasolina")) {
            fabrica = new FabricaGasolina();
        } else {
            fabrica = new FabricaEletrica();
        }

        Veiculo veiculo = fabrica.criarVeiculo();
        Motor motor = fabrica.criarMotor();

        veiculo.montar(); // Monta o veículo
        motor.ligar();    // Liga o motor
    }
}