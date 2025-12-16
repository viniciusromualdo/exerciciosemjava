package conversorTemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        String opcao;
        String temperatura;
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        do {
            System.out.println("Olá, este é o seu conversor de temperaturas!");
            System.out.println("Escolha um número dentre as opções abaixo: ");
            System.out.println("1 - Converter de Farenheit para Celsius: ");
            System.out.println("2 - Converter de Celsius para Farenheit: ");
            System.out.println("3 - Converter de Celsius para Kelvin: ");
            System.out.println("4 - Converter de Kelvin para Celsius: ");
            System.out.println("5 - Converter de Farenheit para Kelvin: ");
            System.out.println("6 - Converter de Kelvin para Farenheit: ");
            opcao = scanner.nextLine();

            switch (opcao){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                    break;
                default:
                    System.out.println("Escolha uma opção válida (Entre 1 e 6)");
                    continue;
            }

            System.out.println("Digite a temperatura: ");
            temperatura = scanner.nextLine();
            double tempNum = Double.parseDouble(temperatura);

            switch (opcao){
                case "1":
                    tempNum = (tempNum - 32) * 5/9;
                    System.out.println("A temperatura em graus Celsius é: " + tempNum);
                    break;
                case "2":
                    tempNum = tempNum * 1.8 + 32;
                    System.out.println("A temperatura em graus Farenheit é: " + tempNum);
                    break;
                case "3":
                    tempNum = tempNum + 273.15;
                    System.out.println("A temperatura em graus Kelvin é: " + tempNum);
                    break;
                case "4":
                    tempNum = tempNum - 273.15;
                    System.out.println("A temperatura em graus Celsius é: " + tempNum);
                    break;
                case "5":
                    tempNum = (tempNum - 32) * 5/9 + 273.15;
                    System.out.println("A temperatura em graus Kelvin é: " + tempNum);
                    break;
                case "6":
                    tempNum = (tempNum - 273.15) * 9/5 + 32;
                    System.out.println("A temperatura em graus Farenheit é: " + tempNum);
                    break;

            }

            if (continua){
                System.out.println("Você deseja realizar outra conversão? (sim/não) ");
                String resposta = scanner.nextLine();

                if (resposta.equals("não")){
                    continua = false;
                }
            }



        } while (continua);

    }
}
