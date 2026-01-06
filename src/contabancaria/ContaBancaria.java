package contabancaria;

import java.util.Random;

public class ContaBancaria {
    Random gerador = new Random();
    int numeroConta;
    String titular;
    float saldo = 0;

    public ContaBancaria(String nomeTitular) {
        this.titular = nomeTitular;
        numeroConta = gerador.nextInt(3000);
        System.out.println("Seu número de conta é: " + numeroConta);
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Saldo atualizado com sucesso! Seu novo saldo é: " + saldo);
    }

    public void sacar(float valorASacar) {
        if (valorASacar < saldo) {
            saldo -= valorASacar;
            System.out.println("Saque realizado com sucesso! Seu novo é valor é: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é de: " + saldo);
    }

}
