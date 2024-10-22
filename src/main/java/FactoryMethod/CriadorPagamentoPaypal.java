package FactoryMethod;

class CriadorPagamentoPaypal extends CriadorPagamento {
    public Pagamento criarPagamento() {
        return new PagamentoPaypal();
    }
}