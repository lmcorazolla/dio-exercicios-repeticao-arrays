package loops;

import java.util.Scanner;

public class Ex2Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;


        System.out.println("Número da nota em inteiros de 0 a 10: ");
        nota = scan.nextInt();
        while(nota < 0 | nota > 10){
            System.out.println("Valor Inválido! Entre um valor inteiro entre 0 e 10.");
            nota = scan.nextInt();
        }


    }
}
