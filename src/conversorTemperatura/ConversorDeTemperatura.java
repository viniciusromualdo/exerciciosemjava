package conversorTemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        String temperatura = "";
        String tipoTemperaturaInicial;
        String tipoTemperaturaFinal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, este é o seu conversor de temperaturas!");
        System.out.println("Digite de qual unidade de temperatura você quer converter (F ou C): ");
        tipoTemperaturaInicial = scanner.nextLine().toLowerCase();

        System.out.println("Digite para qual unidade de temperatura você quer converter (F ou C): ");
        tipoTemperaturaFinal = scanner.nextLine().toLowerCase();

        System.out.println("Digite a temperatura: ");
        double temp = Double.parseDouble(temperatura);

        if (tipoTemperaturaInicial = "c" && tipoTemperaturaFinal = "f"){
            temp = temp * 1.8 + 32;
            System.out.println("A temperatura em Farenheit é: " + temp);
        } else if(tipoTemperaturaInicial = "f" && tipoTemperaturaFinal = "c"){
            temp = (temp - 32) * 5/9;

        }else {
            System.out.println("Operação inválida!");
        }
    }
}
