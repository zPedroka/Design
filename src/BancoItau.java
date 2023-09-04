public class BancoItau implements BancoGeral{
    @Override
    public ContaAbstrata abrirConta(Cliente cliente, String numeroConta, double saldoInicial, String tipo) {
        if (tipo == "Conta Corrente"){
            return new ContaCorrente(numeroConta,saldoInicial,cliente);
        }
        else if (tipo == "Poupança"){
            return new Poupanca(numeroConta, saldoInicial, cliente);

        }
        return null;
    }

    @Override
    public boolean depositar(ContaAbstrata cliente, double valor) {
        return false;
    }

    @Override
    public boolean sacar(ContaAbstrata cliente, double valor) {
        if (valor <= cliente.obterLimite()){
            return false;
        }
        else{
            return true;
        }

    }
}
