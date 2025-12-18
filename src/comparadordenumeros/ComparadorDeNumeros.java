package comparadordenumeros;

import java.util.Scanner;

public class ComparadorDeNumeros {
    public static void main(String[] args) {
        int maiorNumero;
        int menorNumero, n, a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        a = scanner.nextInt();
        maiorNumero = a;
        menorNumero = a;


        for (int i=0; i<5; i++){
            System.out.println("Escreva o próximo número para a comparação: ");
            n = scanner.nextInt();
            if (n > maiorNumero){
                maiorNumero = n;
            }
            if (n < menorNumero){
                menorNumero = n;
            }
        }
        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);
    }
}
