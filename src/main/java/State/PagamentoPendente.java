package State;

public class PagamentoPendente implements EstadoPagamento {
    @Override
    public void processar(Pagamento pagamento) {
        System.out.println("Processando pagamento de R$ " + pagamento.getValor() + "...");
        pagamento.setEstado(new PagamentoProcessando());
    }

    @Override
    public void aprovar(Pagamento pagamento) {
        System.out.println("Não é possível aprovar. O pagamento ainda está pendente.");
    }

    @Override
    public void falhar(Pagamento pagamento) {
        System.out.println("Não é possível falhar. O pagamento ainda está pendente.");
    }
}
