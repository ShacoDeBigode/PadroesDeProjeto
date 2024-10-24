package Observer;

public class DepartamentoVendas implements ObservadorPagamento {
    @Override
    public void atualizar(SujeitoPagamento pagamento, String estado) {
        System.out.println("Departamento de Vendas notificado. Estado do pagamento: " + estado);
        if (estado.equals("Aprovado")) {
            System.out.println("Departamento de Vendas confirma a venda.");
        }
    }
}