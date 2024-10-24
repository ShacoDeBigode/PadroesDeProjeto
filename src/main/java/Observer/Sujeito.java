package Observer;

import java.util.ArrayList;
import java.util.List;

// Subject Interface
public abstract class SujeitoPagamento {
    private List<ObservadorPagamento> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorPagamento observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorPagamento observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String estado) {
        for (ObservadorPagamento observador : observadores) {
            observador.atualizar(this, estado);
        }
    }

    public abstract void processar();
    public abstract void aprovar();
    public abstract void falhar();
}
