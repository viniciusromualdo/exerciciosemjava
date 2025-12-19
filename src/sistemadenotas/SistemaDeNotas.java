package sistemadenotas;


import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {
        int numAlunos;
        String nomeAluno, alunoMaiorNota = "";
        double nota = 0, media, soma = 0, maiorNota = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE NOTAS:");
        System.out.println("DIGITE QUANTOS ALUNOS SÃO: ");
        numAlunos = scanner.nextInt();
        scanner.nextLine();


        for (int i=0; i<numAlunos; i++){
            System.out.println("DIGITE O NOME DO ALUNO: ");
            nomeAluno = scanner.nextLine();
            System.out.println("DIGITE A NOTA DO ALUNO: ");
            nota = scanner.nextDouble();
            scanner.nextLine();

            soma += nota;

            if(i==0){
                maiorNota = nota;
                alunoMaiorNota = nomeAluno;
            }else if (nota > maiorNota){
                maiorNota = nota;
                alunoMaiorNota = nomeAluno;
            }


        }
        media = soma/numAlunos;
        System.out.println("A média da nota dos alunos é: " + media);
        System.out.println("O aluno com a maior nota foi: " + alunoMaiorNota);
    }
}
