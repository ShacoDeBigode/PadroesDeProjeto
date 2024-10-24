package Strategy;

public class PagamentoCartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " com cartão de crédito.");
        // Lógica específica para cartão de crédito
    }
}