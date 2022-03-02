package loops;

import java.util.Scanner;

public class Ex3MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int numeroMaior = 0;
        int somaNumeros = 0;


        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero > numeroMaior) numeroMaior = numero;
            count++;
            somaNumeros += numero;
        } while(count < 5);

        System.out.println("A soma dos números é " + somaNumeros + " e a média " + somaNumeros/5);
        System.out.println("O maior número apresentado foi " + numeroMaior);




    }
}
