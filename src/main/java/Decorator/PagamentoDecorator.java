package Decorator;

public abstract class PagamentoDecorator implements PagamentoComponente {
    protected PagamentoComponente pagamentoDecorado;

    public PagamentoDecorator(PagamentoComponente pagamentoDecorado) {
        this.pagamentoDecorado = pagamentoDecorado;
    }

    @Override
    public void processar() {
        pagamentoDecorado.processar();
    }

    @Override
    public void aprovar() {
        pagamentoDecorado.aprovar();
    }

    @Override
    public void falhar() {
        pagamentoDecorado.falhar();
    }
}