package ChainOfResponsability;

public class ValidadorCartao extends ValidadorPagamento {
    @Override
    public void validar(Pagamento pagamento) {
        if (pagamento.isCartaoValido()) {
            System.out.println("Cartão válido. Validando próximo...");
            if (proximo != null) {
                proximo.validar(pagamento);
            }
        } else {
            System.out.println("Falha na validação: Cartão inválido.");
        }
    }
}