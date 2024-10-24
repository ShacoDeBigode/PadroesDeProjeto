package ChainOfResponsability;

public class ValidadorSaldo extends ValidadorPagamento {
    @Override
    public void validar(Pagamento pagamento) {
        if (pagamento.isSaldoSuficiente()) {
            System.out.println("Saldo suficiente. Validando próximo...");
            if (proximo != null) {
                proximo.validar(pagamento);
            }
        } else {
            System.out.println("Falha na validação: Saldo insuficiente.");
        }
    }
}
