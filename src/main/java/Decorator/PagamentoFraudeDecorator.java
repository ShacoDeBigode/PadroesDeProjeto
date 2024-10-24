package Decorator;

public class PagamentoFraudeDecorator extends PagamentoDecorator {

    public PagamentoFraudeDecorator(PagamentoComponente pagamentoDecorado) {
        super(pagamentoDecorado);
    }

    @Override
    public void processar() {
        if (verificarFraude()) {
            super.falhar();
        } else {
            super.processar();
        }
    }

    @Override
    public void aprovar() {
        if (verificarFraude()) {
            super.falhar();
        } else {
            super.aprovar();
        }
    }

    private boolean verificarFraude() {
        // Simulação de verificação de fraude
        boolean fraude = Math.random() > 0.8;  // 20% de chance de fraude
        if (fraude) {
            System.out.println("[FRAUDE DETECTADA]: O pagamento foi marcado como suspeito.");
        }
        return fraude;
    }
}