public class Teste {
    public static void main(String[] args) {
        Cliente pedroka  = new Cliente("pedroka", "09834326342");
        BancoItau Teste = new BancoItau();

        Teste.abrirConta(pedroka, "244", 13000,"Poupança");
        Teste.abrirConta(pedroka, "137", 1800, "Conta Corrente");

        System.out.println();
    }
}
