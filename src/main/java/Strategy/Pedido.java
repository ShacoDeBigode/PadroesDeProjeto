package Strategy;

public class Pedido {
    private Pagamento metodoPagamento;

    public Pedido(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void setMetodoPagamento(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void finalizarPedido(double valor) {
        System.out.println("Finalizando pedido com valor de R$ " + valor);
        metodoPagamento.processarPagamento(valor);
    }
}
