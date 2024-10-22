package FactoryMethod;

class CriadorPagamentoCartao extends CriadorPagamento {
    public Pagamento criarPagamento() {
        return new PagamentoCartao();
    }
}