package Strategy;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(new PagamentoCartaoCredito());
        pedido1.finalizarPedido(500.0);

        Pedido pedido2 = new Pedido(new PagamentoPayPal());
        pedido2.finalizarPedido(300.0);

        Pedido pedido3 = new Pedido(new PagamentoBoleto());
        pedido3.finalizarPedido(200.0);

        pedido1.setMetodoPagamento(new PagamentoBoleto());
        pedido1.finalizarPedido(500.0);
    }
}
