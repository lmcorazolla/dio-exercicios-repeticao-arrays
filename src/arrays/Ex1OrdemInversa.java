package arrays;
/*Crie um vetor de 6 números inteiros
 e mostre-os na ordem inversa.*/

import java.lang.reflect.Array;

public class Ex1OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {40, 10, -10, 20, 2, -6};

        System.out.println("vetor");

        int count = 0;
        while(count < (vetor.length)) {
            System.out.println(vetor[count]);
            count++;
        }

        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }

    }
}
