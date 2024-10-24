package ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        ValidadorPagamento validadorSaldo = new ValidadorSaldo();
        ValidadorPagamento validadorCartao = new ValidadorCartao();
        ValidadorPagamento validadorAutenticacao = new ValidadorAutenticacao();

        validadorSaldo.setProximo(validadorCartao);
        validadorCartao.setProximo(validadorAutenticacao);

        Pagamento pagamentoValido = new Pagamento(100.0, true, true, true);
        System.out.println("Tentando processar um pagamento válido:");
        validadorSaldo.validar(pagamentoValido);

        System.out.println();

        Pagamento pagamentoInvalido = new Pagamento(100.0, false, true, true);
        System.out.println("Tentando processar um pagamento com saldo insuficiente:");
        validadorSaldo.validar(pagamentoInvalido);

        System.out.println();

        Pagamento pagamentoCartaoInvalido = new Pagamento(100.0, true, false, true);
        System.out.println("Tentando processar um pagamento com cartão inválido:");
        validadorSaldo.validar(pagamentoCartaoInvalido);
    }
}
