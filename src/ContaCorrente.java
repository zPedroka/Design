public class ContaCorrente extends ContaAbstrata{
    public ContaCorrente(String numeroConta, double saldo, Cliente cliente) {
        super(numeroConta, saldo, cliente);
    }

    private double LimChequeEsp;
    @Override
    public double obterLimite() {
        return this.getSaldo() + this.getLimChequeEsp();
    }


    public double getLimChequeEsp() {
        return LimChequeEsp;
    }

    public void setLimChequeEsp(double limChequeEsp) {
        LimChequeEsp = limChequeEsp;
    }
}

