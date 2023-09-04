public interface BancoGeral {
    public ContaAbstrata abrirConta(Cliente cliente, String numeroConta, double saldoInicial, String tipo);
    public boolean depositar(ContaAbstrata cliente, double valor);
    public boolean sacar(ContaAbstrata cliente, double valor);


}
