package Observer;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento(100.0);

        ObservadorPagamento vendas = new DepartamentoVendas();
        ObservadorPagamento logistica = new SistemaLogistica();
        ObservadorPagamento usuario = new Usuario("João");

        pagamento.registrarObservador(vendas);
        pagamento.registrarObservador(logistica);
        pagamento.registrarObservador(usuario);

        pagamento.processar();
        pagamento.aprovar();

        System.out.println();

        Pagamento pagamento2 = new Pagamento(200.0);
        pagamento2.registrarObservador(vendas);
        pagamento2.registrarObservador(logistica);
        pagamento2.registrarObservador(usuario);

        pagamento2.processar();
        pagamento2.falhar();
    }
}
