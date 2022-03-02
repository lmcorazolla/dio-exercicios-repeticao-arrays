package arrays;

import java.util.Random;

public class Ex4ArraysMultidimensionais {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int linha = 0; linha < M.length; linha++){
            for( int coluna = 0; coluna < M[linha].length; coluna++){
                M[linha][coluna] = random.nextInt(100);
            }
        }
        System.out.println("Matriz");
        for (int[] linha :M) {
            for (int elementoColuna : linha) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }

    }
}
