package FactoryMethod;

class PagamentoCartao implements Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " com Cartão de Crédito.");
    }
}