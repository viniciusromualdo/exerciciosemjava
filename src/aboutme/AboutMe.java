package aboutme;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.nextLine();

            if (nome.isBlank()){
                throw new IllegalArgumentException("Não é aceito entrada vazia");
            }

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.nextLine();
            if (sobrenome.isBlank()){
                throw new IllegalArgumentException("Não é válido entrada vazia");
            }

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();


            // imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } catch (InputMismatchException ex) {
            System.err.println("Digite a idade ou altura no formato americano (Ex: 15, 0.00)");
        } catch (IllegalArgumentException e) {
            System.err.println("Texto inválido!");
        }
    }
}
