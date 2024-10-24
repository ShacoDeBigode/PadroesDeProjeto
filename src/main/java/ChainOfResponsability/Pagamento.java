package ChainOfResponsability;

public class Pagamento {
    private double valor;
    private boolean saldoSuficiente;
    private boolean cartaoValido;
    private boolean autenticacaoOk;

    public Pagamento(double valor, boolean saldoSuficiente, boolean cartaoValido, boolean autenticacaoOk) {
        this.valor = valor;
        this.saldoSuficiente = saldoSuficiente;
        this.cartaoValido = cartaoValido;
        this.autenticacaoOk = autenticacaoOk;
    }

    public double getValor() {
        return valor;
    }

    public boolean isSaldoSuficiente() {
        return saldoSuficiente;
    }

    public boolean isCartaoValido() {
        return cartaoValido;
    }

    public boolean isAutenticacaoOk() {
        return autenticacaoOk;
    }
}
