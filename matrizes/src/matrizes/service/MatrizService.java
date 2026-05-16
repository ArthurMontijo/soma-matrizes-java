package matrizes.service;

public class MatrizService {

    public int[][] somar(int[][] matrizA, int[][] matrizB) {

        int[][] resultado = new int[2][2];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return resultado;
    }

    public String formatarMatriz(int[][] matriz) {

        String texto = "";

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                texto += matriz[i][j] + " ";
            }

            texto += "\n";
        }

        return texto;
    }
}