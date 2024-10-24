package State;

public class PagamentoProcessando implements EstadoPagamento {
    @Override
    public void processar(Pagamento pagamento) {
        System.out.println("Pagamento já está em processamento.");
    }

    @Override
    public void aprovar(Pagamento pagamento) {
        System.out.println("Pagamento de R$ " + pagamento.getValor() + " aprovado!");
        pagamento.setEstado(new PagamentoAprovado());
    }

    @Override
    public void falhar(Pagamento pagamento) {
        System.out.println("Falha no processamento do pagamento de R$ " + pagamento.getValor() + ".");
        pagamento.setEstado(new PagamentoFalhado());
    }
}
