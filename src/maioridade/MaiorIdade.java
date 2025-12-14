package maioridade;

import java.util.Scanner;


public class MaiorIdade {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Me informe sua idade: ");
        idade = scanner.nextInt();
        if (idade < 0){
            System.out.println("Número inválido!!");
            return;
        }

        if (idade >= 18){
            System.out.println(nome + ", você é maior de idade!");
        } else {
            System.out.println(nome + ", você é menor de idade");
        }

        if (idade <= 10){
            System.out.println("Parabéns " + nome + " você é uma criança! ");
        } else if (idade > 10 && idade <=18) {
            System.out.println("Parabéns " + nome + " você está na adolescência!");
        } else if (idade > 18 && idade <= 60) {
            System.out.println("Parabéns " + nome + " você é um adulto!");
        }else {
            System.out.println("Parabéns " + nome + " você é um idoso, está na melhor idade!");
        }

    }
}
