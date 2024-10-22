package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        CriadorPagamento criadorCartao = new CriadorPagamentoCartao();
        Pagamento pagamentoCartao = criadorCartao.criarPagamento();
        pagamentoCartao.processarPagamento(150.00);

        CriadorPagamento criadorPaypal = new CriadorPagamentoPaypal();
        Pagamento pagamentoPaypal = criadorPaypal.criarPagamento();
        pagamentoPaypal.processarPagamento(250.00);
    }
}