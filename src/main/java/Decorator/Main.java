package Decorator;

public class Main {
    public static void main(String[] args) {
        PagamentoComponente pagamento = new PagamentoConcreto(100.0);

        pagamento = new PagamentoLogDecorator(pagamento);

        pagamento = new PagamentoFraudeDecorator(pagamento);

        pagamento.processar();
        pagamento.aprovar();

        System.out.println();

        PagamentoComponente pagamento2 = new PagamentoConcreto(200.0);
        pagamento2 = new PagamentoLogDecorator(new PagamentoFraudeDecorator(pagamento2));

        pagamento2.processar();
        pagamento2.aprovar();
    }
}