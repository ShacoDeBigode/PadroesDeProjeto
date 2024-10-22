package AbstractFactory;

public class FabricaGasolina implements FabricaVeiculos {
    public Veiculo criarVeiculo() {
        return new CarroGasolina();
    }

    public Motor criarMotor() {
        return new MotorGasolina();
    }
}