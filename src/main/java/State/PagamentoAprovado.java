package State;

public class PagamentoAprovado implements EstadoPagamento {
    @Override
    public void processar(Pagamento pagamento) {
        System.out.println("Pagamento já foi aprovado. Não pode ser processado novamente.");
    }

    @Override
    public void aprovar(Pagamento pagamento) {
        System.out.println("Pagamento já está aprovado.");
    }

    @Override
    public void falhar(Pagamento pagamento) {
        System.out.println("Não é possível falhar. O pagamento já foi aprovado.");
    }
}