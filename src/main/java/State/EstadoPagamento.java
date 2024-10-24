package State;

public interface EstadoPagamento {
    void processar(Pagamento pagamento);
    void aprovar(Pagamento pagamento);
    void falhar(Pagamento pagamento);
}