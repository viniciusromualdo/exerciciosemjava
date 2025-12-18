package contadordevogais;

import java.util.Scanner;

public class ContadorDeVogais {
    public static void main(String[] args) {
        String palavra;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma palavra: ");
        palavra = scanner.nextLine().toLowerCase();

        for(int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
                if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                    contador++;
                }
        }
        System.out.println(contador);
    }
}

/* 7️⃣ Contador de Vogais

Leia uma palavra e conte quantas vogais ela tem.

🔹 Aprende:

        for + charAt() */