package ChainOfResponsability;

// Handler Interface
public abstract class ValidadorPagamento {
    protected ValidadorPagamento proximo;

    public void setProximo(ValidadorPagamento proximo) {
        this.proximo = proximo;
    }

    public abstract void validar(Pagamento pagamento);
}
