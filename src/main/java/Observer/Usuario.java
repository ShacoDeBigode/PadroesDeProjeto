package Observer;

public class Usuario implements ObservadorPagamento {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(SujeitoPagamento pagamento, String estado) {
        System.out.println("Usuário " + nome + " notificado. Estado do pagamento: " + estado);
        if (estado.equals("Aprovado")) {
            System.out.println("Usuário " + nome + " foi informado que o pagamento foi aprovado.");
        } else if (estado.equals("Falhado")) {
            System.out.println("Usuário " + nome + " foi informado que o pagamento falhou.");
        }
    }
}