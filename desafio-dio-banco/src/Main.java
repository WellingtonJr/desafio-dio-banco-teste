public class Main {
    public static void main(String[] args) throws Exception {
        Cliente wellington = new Cliente();
        wellington.setNome("Wellington");

        Conta cc = new ContaCorrente(wellington);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(wellington);
        poupanca.sacar(300);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
