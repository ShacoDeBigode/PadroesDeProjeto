package Decorator;

public class PagamentoLogDecorator extends PagamentoDecorator {

    public PagamentoLogDecorator(PagamentoComponente pagamentoDecorado) {
        super(pagamentoDecorado);
    }

    @Override
    public void processar() {
        super.processar();
        log("Processando pagamento...");
    }

    @Override
    public void aprovar() {
        super.aprovar();
        log("Pagamento aprovado!");
    }

    @Override
    public void falhar() {
        super.falhar();
        log("Pagamento falhou!");
    }

    private void log(String mensagem) {
        System.out.println("[LOG]: " + mensagem);
    }
}