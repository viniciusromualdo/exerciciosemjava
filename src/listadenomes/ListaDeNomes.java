package listadenomes;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ListaDeNomes {
    public static void main(String[] args) {
        String nome;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i=0; i<5; i++){
            System.out.println("Escreva um nome: ");
            nome = scanner.nextLine().toLowerCase();
            nomes.add(nome);
        }
        System.out.println(nomes);
    }
}
