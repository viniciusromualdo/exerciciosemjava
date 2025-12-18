package somadenumeros;

import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args) {
        int n;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esse é o seu somador de números!");
        System.out.println("Informe o número que você deseja que termine o somador:");
        n = scanner.nextInt();

        for (int i=1; i<=n; i++){
            soma +=i;
            System.out.println(soma);
        }

    }
}
