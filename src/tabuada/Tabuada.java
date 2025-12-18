package tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int n, a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número para a tabuada: ");
        n = scanner.nextInt();

        System.out.println("O resultado da tabuada de " + n + " é: ");
        for (int i=1; i<=10; i++){
            a = n * i;
            System.out.println(n + " X " + i + " = " + a);
        }
    }
}
