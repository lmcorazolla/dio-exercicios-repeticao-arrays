package loops;

import java.util.Scanner;

public class Ex4ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int contadorPares = 0;
        int contadorImpares = 0;
        int contador = 0;

        do {
            System.out.println("Quantos números?");
            quantNumeros = scan.nextInt();

        } while(quantNumeros <=0);


        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 1) contadorImpares++;
            else contadorPares++;
            contador++;
        } while(contador < quantNumeros);

        System.out.println("Quantidade de Pares: " + contadorPares);
        System.out.println("Quantidade de Ímpares: " + contadorImpares);


    }
}
