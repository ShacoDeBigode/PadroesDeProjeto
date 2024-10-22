package AbstractFactory.Test;

import AbstractFactory.*;
import org.junit.Test;
import static org.junit.Assert.*;

class FabricaVeiculosTest {

    // Testes da Fábrica de Gasolina

    @Test
    public void testFabricaGasolina_CriarCarro() {
        FabricaVeiculos fabrica = new FabricaGasolina();
        Veiculo veiculo = fabrica.criarVeiculo();
        Motor motor = fabrica.criarMotor();

        assertTrue(veiculo instanceof CarroGasolina);
        assertTrue(motor instanceof MotorGasolina);
    }

    @Test
    public void testFabricaGasolina_CriarMoto() {
        FabricaVeiculos fabrica = new FabricaGasolina();
        Veiculo veiculo = new MotoGasolina(); // Testando diretamente
        Motor motor = fabrica.criarMotor();

        assertTrue(veiculo instanceof MotoGasolina);
        assertTrue(motor instanceof MotorGasolina);
    }

    @Test
    public void testFabricaGasolina_Consistencia() {
        FabricaVeiculos fabrica = new FabricaGasolina();
        Veiculo veiculo1 = fabrica.criarVeiculo();
        Veiculo veiculo2 = fabrica.criarVeiculo();

        assertNotSame(veiculo1, veiculo2); // Devem ser diferentes instâncias
        assertTrue(veiculo1 instanceof CarroGasolina);
        assertTrue(veiculo2 instanceof CarroGasolina);
    }

    // Testes da Fábrica Elétrica

    @Test
    public void testFabricaEletrica_CriarCarro() {
        FabricaVeiculos fabrica = new FabricaEletrica();
        Veiculo veiculo = fabrica.criarVeiculo();
        Motor motor = fabrica.criarMotor();

        assertTrue(veiculo instanceof CarroEletrico);
        assertTrue(motor instanceof MotorEletrico);
    }

    @Test
    public void testFabricaEletrica_CriarMoto() {
        FabricaVeiculos fabrica = new FabricaEletrica();
        Veiculo veiculo = new MotoEletrica(); // Testando diretamente
        Motor motor = fabrica.criarMotor();

        assertTrue(veiculo instanceof MotoEletrica);
        assertTrue(motor instanceof MotorEletrico);
    }

    @Test
    public void testFabricaEletrica_Consistencia() {
        FabricaVeiculos fabrica = new FabricaEletrica();
        Veiculo veiculo1 = fabrica.criarVeiculo();
        Veiculo veiculo2 = fabrica.criarVeiculo();

        assertNotSame(veiculo1, veiculo2); // Devem ser diferentes instâncias
        assertTrue(veiculo1 instanceof CarroEletrico);
        assertTrue(veiculo2 instanceof CarroEletrico);
    }

    // Testes dos Métodos dos Produtos

    @Test
    public void testCarroGasolina_Montar() {
        CarroGasolina carro = new CarroGasolina();
        carro.montar(); // Deve imprimir "Montando um carro a gasolina."
    }

    @Test
    public void testMotorGasolina_Ligar() {
        MotorGasolina motor = new MotorGasolina();
        motor.ligar(); // Deve imprimir "Ligando motor a gasolina."
    }

    @Test
    public void testCarroEletrico_Montar() {
        CarroEletrico carro = new CarroEletrico();
        carro.montar(); // Deve imprimir "Montando um carro elétrico."
    }

    @Test
    public void testMotorEletrico_Ligar() {
        MotorEletrico motor = new MotorEletrico();
        motor.ligar(); // Deve imprimir "Ligando motor elétrico."
    }
}
