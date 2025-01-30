public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("12345-6");

        conta.depositar(1000);
        conta.sacar(500);
        conta.depositar(200);
        conta.sacar(2000); // Tentativa de saque maior que o saldo

        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}
