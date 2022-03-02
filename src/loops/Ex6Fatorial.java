package loops;

import java.util.Scanner;

public class Ex6Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial de: ");
        long fatorial = scan.nextLong();
        long multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for (long i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.print(multiplicacao);

    }
}
