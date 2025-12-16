package mediaescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class MediaEscolar {
    public static void main(String[] args) {
        String nome;
        String nota1Str, nota2Str, nota3Str, nota4Str;
        float media;
        String materia;
        boolean prox = true;
        ArrayList<String> materias = new ArrayList<>();
        ArrayList<Float> medias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, este é o seu sistema de cálculo de média escolar! ");
        System.out.println("Diga o nome do aluno: ");
        nome = scanner.nextLine();

        do {

        try {
            System.out.println("Informe qual é a materia: ");
            materia = scanner.nextLine();
            materias.add(materia);
            System.out.println("Você vai me dizer agora as notas de cada uma das 4 unidades: ");
            System.out.println("Informe a nota da 1° unidade: ");
            nota1Str = scanner.nextLine();
            float nota1 = Float.parseFloat(nota1Str);

            System.out.println("Muito bem, informe agora a nota da 2° unidade: ");
            nota2Str = scanner.nextLine();
            float nota2 = Float.parseFloat(nota2Str);

            System.out.println("Informe a nota da 3° unidade: ");
            nota3Str = scanner.nextLine();
            float nota3 = Float.parseFloat(nota3Str);

            System.out.println("É a última! Informe a última nota: ");
            nota4Str = scanner.nextLine();
            float nota4 = Float.parseFloat(nota4Str);

            media = (nota1 + nota2 + nota3 + nota4)/4;
            medias.add(media);

            if(media < 6){
                    System.out.println("O aluno(a) " + nome + " possui média final de " + media + " e por isso está REPROVADO em " + materia + "!" );
                } else if(media >= 6 && media <= 7){
                    System.out.println("O aluno(a) " + nome + " possui média final de " + media + " e por isso está de RECUPERAÇÃO em " + materia + "!");
                } else {
                    System.out.println("O aluno(a) " + nome + " possui média final de " + media + " e por isso está APROVADO em " + materia + "! PARABÉNS!!!");
                }
            } catch (NumberFormatException x){
                System.out.println("Digite um valor válido!");
            }

        if(prox){
            System.out.println("Você deseja realizar mais uma operação? (sim/não)");
            String resposta = scanner.nextLine();
            if (resposta.equals("não")){
                prox = false;
                System.out.println(nome);
                System.out.println(materias);
                System.out.println(medias);
            }
        }

        } while (prox);

    }
}
