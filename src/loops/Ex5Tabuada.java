package loops;

import java.util.Scanner;

public class Ex5Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;

        do {
            System.out.println("Tabuada de: ");
            numero = scan.nextInt();
        } while (numero <= 0 | numero > 10);

        System.out.println("Tabuada de " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}
