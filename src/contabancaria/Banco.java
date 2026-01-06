package contabancaria;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Vinícius");
        ContaPoupança conta2 = new ContaPoupança("Milena");

        System.out.println(conta1.titular);
        conta1.aplicarlimite(1500);
        conta1.depositar(1500);
        conta1.consultarSaldo();
        conta1.sacar(3200);
        System.out.println("___________________________________________");

        System.out.println(conta2.titular);
        conta2.depositar(400);
        conta2.consultarSaldo();
    }
}
