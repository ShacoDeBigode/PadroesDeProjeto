package Observer;

public class Pagamento extends SujeitoPagamento {
    private double valor;
    private String estado;

    public Pagamento(double valor) {
        this.valor = valor;
        this.estado = "Pendente";  // Estado inicial
    }

    public double getValor() {
        return valor;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento de R$ " + valor + "...");
        estado = "Processando";
        notificarObservadores(estado);
    }

    @Override
    public void aprovar() {
        System.out.println("Pagamento de R$ " + valor + " aprovado!");
        estado = "Aprovado";
        notificarObservadores(estado);
    }

    @Override
    public void falhar() {
        System.out.println("Falha no pagamento de R$ " + valor + ".");
        estado = "Falhado";
        notificarObservadores(estado);
    }
}
