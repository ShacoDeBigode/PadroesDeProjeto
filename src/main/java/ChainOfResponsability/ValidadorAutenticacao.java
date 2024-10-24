package ChainOfResponsability;

public class ValidadorAutenticacao extends ValidadorPagamento {
    @Override
    public void validar(Pagamento pagamento) {
        if (pagamento.isAutenticacaoOk()) {
            System.out.println("Autenticação bem-sucedida. Validação completa.");
            if (proximo != null) {
                proximo.validar(pagamento);
            }
        } else {
            System.out.println("Falha na validação: Autenticação falhou.");
        }
    }
}