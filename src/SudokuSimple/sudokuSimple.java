package SudokuSimple;

public class sudokuSimple {
    public static void main(String[] args) {
        // sudokuValido();
    }

    // Matriz mágica
    // Escribir un programa que determine si una matriz es una matriz mágica
    // En este caso, se utilizará una matriz de tamaño 3x3, con números enteros del
    // 1 al 9.

    // Aquí te compartimos dos ejemplos de matrices mágicas para verificar el
    // algoritmo:

    // Matriz 1:
    // 8 1 6
    // 3 5 7
    // 4 9 2

    // Matriz 2:
    // 2 7 6
    // 9 5 1
    // 4 3 8

    // El programa verificará si cada matriz cumple con
    // las condiciones de una matriz mágica.
    public static void sudokuValido() {

        int[][] matriz = {
                { 8, 1, 6 },
                { 3, 5, 7 },
                { 4, 9, 2 }
        };

        boolean esMagica = verificarSudorku(matriz);

        if (esMagica) {
            System.out.println("La matriz es una matriz mágica.");
        } else {
            System.out.println("La matriz no es una matriz mágica.");
        }
    }

    public static boolean verificarSudorku(int[][] matriz) {
        if (matriz.length != 3 || matriz[0].length != 3) {
            return false;
        }

        // Verificar que los números no se repitan
        boolean[] numerosRepetidos = new boolean[10]; // 0 a 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int numero = matriz[i][j];
                if (numero < 1 || numero > 9 || numerosRepetidos[numero]) {
                    return false;
                }
                numerosRepetidos[numero] = true;
            }
        }

        int sumaObjetivo = matriz[0][0] + matriz[0][1] + matriz[0][2];

        for (int i = 1; i < 3; i++) {
            int sumaFila = matriz[i][0] + matriz[i][1] + matriz[i][2];
            if (sumaFila != sumaObjetivo) {
                return false;
            }
        }
        for (int j = 0; j < 3; j++) {
            int sumaColumna = matriz[0][j] + matriz[1][j] + matriz[2][j];
            if (sumaColumna != sumaObjetivo) {
                return false;
            }
        }
        int sumaDiagonalPrincipal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaDiagonalPrincipal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
        if (sumaDiagonalPrincipal1 != sumaObjetivo || sumaDiagonalPrincipal2 != sumaObjetivo) {
            return false;
        }

        return true;
    }
}
