package Strategy;

public class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando boleto bancário para pagamento de R$ " + valor);
    }
}