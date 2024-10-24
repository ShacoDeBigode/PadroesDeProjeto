package State;

public class PagamentoFalhado implements EstadoPagamento {
    @Override
    public void processar(Pagamento pagamento) {
        System.out.println("Não é possível processar. O pagamento falhou.");
    }

    @Override
    public void aprovar(Pagamento pagamento) {
        System.out.println("Não é possível aprovar. O pagamento falhou.");
    }

    @Override
    public void falhar(Pagamento pagamento) {
        System.out.println("Pagamento já está em estado de falha.");
    }
}