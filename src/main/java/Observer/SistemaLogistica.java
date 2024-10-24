package Observer;

public class SistemaLogistica implements ObservadorPagamento {
    @Override
    public void atualizar(SujeitoPagamento pagamento, String estado) {
        System.out.println("Sistema de Logística notificado. Estado do pagamento: " + estado);
        if (estado.equals("Aprovado")) {
            System.out.println("Sistema de Logística prepara o envio.");
        }
    }
}