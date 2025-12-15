package maioridade;

import java.util.Scanner;


public class MaiorIdade {
    public static void main(String[] args) {
        String nome;
        String idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Me informe sua idade: ");
        idade = scanner.nextLine();


        try{
            int idadeInt = Integer.parseInt(idade);
            if (idadeInt < 0){
                System.out.println("Número inválido!!");
                return;
            }
            if (idadeInt >= 18){
                System.out.println(nome + ", você é maior de idade!");
            } else {
                System.out.println(nome + ", você é menor de idade");
            }

            if (idadeInt <= 10){
                System.out.println("Parabéns " + nome + " você é uma criança! ");
            } else if (idadeInt > 10 && idadeInt <=18) {
                System.out.println("Parabéns " + nome + " você está na adolescência!");
            } else if (idadeInt > 18 && idadeInt <= 60) {
                System.out.println("Parabéns " + nome + " você é um adulto!");
            }else {
                System.out.println("Parabéns " + nome + " você é um idoso, está na melhor idade!");
            }

        } catch (NumberFormatException x){
            System.out.println("Digite um número válido!");
        }


        /* if (idadeInt < 0){
            System.out.println("Número inválido!!");
            return;
        }

        if (idadeInt >= 18){
            System.out.println(nome + ", você é maior de idade!");
        } else {
            System.out.println(nome + ", você é menor de idade");
        }

        if (idadeInt <= 10){
            System.out.println("Parabéns " + nome + " você é uma criança! ");
        } else if (idadeInt > 10 && idade <=18) {
            System.out.println("Parabéns " + nome + " você está na adolescência!");
        } else if (idadeInt > 18 && idade <= 60) {
            System.out.println("Parabéns " + nome + " você é um adulto!");
        }else {
            System.out.println("Parabéns " + nome + " você é um idoso, está na melhor idade!");
        } */

    }
}
