package State;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento(100.0);


        pagamento.processar();
        pagamento.aprovar();

        System.out.println();


        pagamento.processar();

        System.out.println();


        Pagamento pagamento2 = new Pagamento(200.0);
        pagamento2.processar();
        pagamento2.falhar();

        System.out.println();


        pagamento2.aprovar();
    }
}
