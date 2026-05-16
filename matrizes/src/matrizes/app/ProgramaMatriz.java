package matrizes.app;

import javax.swing.JOptionPane;

import matrizes.service.MatrizService;

public class ProgramaMatriz {

    public static void main(String[] args) {

        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];

        // Ler matriz A
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                matrizA[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Digite o valor da matriz A [" + i + "][" + j + "]"
                        )
                );
            }
        }

        // Ler matriz B
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                matrizB[i][j] = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Digite o valor da matriz B [" + i + "][" + j + "]"
                        )
                );
            }
        }

        MatrizService service = new MatrizService();

        int[][] resultado = service.somar(matrizA, matrizB);

        String mensagem = "Resultado da soma:\n\n";

        mensagem += service.formatarMatriz(resultado);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
