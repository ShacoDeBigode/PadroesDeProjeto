package State;

public class Pagamento {
    private EstadoPagamento estadoAtual;
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
        this.estadoAtual = new PagamentoPendente();  // Estado inicial
    }

    public double getValor() {
        return valor;
    }

    public void setEstado(EstadoPagamento estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void processar() {
        estadoAtual.processar(this);
    }

    public void aprovar() {
        estadoAtual.aprovar(this);
    }

    public void falhar() {
        estadoAtual.falhar(this);
    }
}
