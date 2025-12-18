package sistemadenotas;


import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {
        int numAlunos;
        String nomeAluno;
        double nota = 0, media;
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE NOTAS:");
        System.out.println("DIGITE QUANTOS ALUNOS SÃO: ");
        numAlunos = scanner.nextInt();

        for (int i=0; i<numAlunos; i++){
            System.out.println("DIGITE O NOME DO ALUNO: ");
            nomeAluno = scanner.nextLine();
            nomes.add(nomeAluno);
            System.out.println("DIGITE A NOTA DO ALUNO: ");
            nota = scanner.nextDouble();
            notas.add(nota);
        }
        media = nota/numAlunos;
    }
}
