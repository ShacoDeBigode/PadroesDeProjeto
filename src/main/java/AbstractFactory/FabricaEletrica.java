package AbstractFactory;

public class FabricaEletrica implements FabricaVeiculos {
    public Veiculo criarVeiculo() {
        return new CarroEletrico(); // ou return new MotoEletrica();
    }

    public Motor criarMotor() {
        return new MotorEletrico();
    }
}