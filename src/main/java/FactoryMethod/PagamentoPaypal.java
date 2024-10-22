package FactoryMethod;

class PagamentoPaypal implements Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " com PayPal.");
    }
}