package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    double num1;
    double num2;
    double resultado;
    String operacao;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem vindo a sua calculadora");
    System.out.println("Digite o primeiro número: ");
    num1 = scanner.nextDouble();
    System.out.println("Digite o segundo número: ");
    num2 = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Digite qual tipo de operação você deseja realizar: ");
    operacao = scanner.nextLine().toLowerCase();

        /* if(operacao.equals("soma")){
            resultado = num1 + num2;
            System.out.println("O resultado da soma é: " + resultado);
        }else if(operacao.equals("subtracao")){
            resultado = num1 - num2;
            System.out.println("O resultado da subtração é: " + resultado);
        }else if (operacao.equals("multiplicacao")){
            resultado = num1 * num2;
            System.out.println("O resultado da multiplicação é: " + resultado);
        } else if (operacao.equals("divisao")) {
            resultado = num1/num2;
            System.out.println("O resultado da divisão é: " + resultado);
        }else {
            System.out.println("Operação inválida!");
        }
        */

        switch (operacao){
            case "soma":
                resultado = num1 + num2;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case "subtração":
                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case "multiplicação":
                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case "divisão":
                resultado = num1 / num2;
                System.out.println("O resultado da divisão é: " + resultado);
                break;
            default:
                System.out.println("Operação inválida!");
        }
        scanner.close();
    }
}
