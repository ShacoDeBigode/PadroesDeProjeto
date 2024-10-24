package Decorator;

public class PagamentoConcreto implements PagamentoComponente {
    private double valor;

    public PagamentoConcreto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento de R$ " + valor);
    }

    @Override
    public void aprovar() {
        System.out.println("Pagamento de R$ " + valor + " aprovado!");
    }

    @Override
    public void falhar() {
        System.out.println("Falha no pagamento de R$ " + valor);
    }
}
