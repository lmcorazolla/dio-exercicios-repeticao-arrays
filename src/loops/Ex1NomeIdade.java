package loops;

import java.util.Scanner;

public class Ex1NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeAluno;
        int idadeAluno;

        while(true) {

            System.out.println("Insira Nome do Aluno: ");
            nomeAluno = scan.next();
            if (nomeAluno.equals("0")) break;
            System.out.println("Insira Idade do Aluno: ");
            idadeAluno = scan.nextInt();

        }

    }
}
