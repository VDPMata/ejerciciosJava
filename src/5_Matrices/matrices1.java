import java.util.Scanner;

public class matrices1 {
    public static void main(String[] args) {
        // sumaMatrices();
        // multMatriz();
        espiralMatriz();
    }

    // 1. Sumar dos matrices de la misma dimensión: La suma de dos matrices se
    // realiza sumando cada elemento correspondiente en las dos matrices. Por
    // ejemplo, si tienes dos matrices A y B, el elemento en la primera fila y la
    // primera columna de la matriz sumada C sería la suma del elemento en la
    // primera fila y la primera columna de A y el mismo elemento de B.

    // [1, 2, 3] [10, 20, 30] [11, 22, 33]
    // [4, 5, 6] + [40, 50, 60] = [44, 55, 66]
    // [7, 8, 9] [70, 80, 90] [77, 88, 99]
    public static void sumaMatrices() {
        int[][] matrizA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrizB = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        int filas = matrizA.length;
        int columnas = matrizA[0].length;

        int[][] matrizSuma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);

        System.out.println("Matriz B:");
        imprimirMatriz(matrizB);

        System.out.println("Matriz Suma:");
        imprimirMatriz(matrizSuma);
    }

    // Usaremos este metodo para no tener que repetir tanto codigo
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 2. Multiplicar dos matrices: La multiplicación de matrices es un poco más
    // complicada que la suma. Para multiplicar dos matrices, necesitas seguir estos
    // pasos para cada elemento de la matriz resultante:

    // Multiplica cada elemento de una fila de la primera matriz por el elemento
    // correspondiente de una columna de la segunda matriz.
    // Suma todos esos productos.
    // Ese es el valor del elemento en la fila y columna correspondientes de la
    // matriz resultante.
    // Por ejemplo:
    // [1, 2] [5, 6] [(1*5 + 2*7), (1*6 + 2*8)] [19, 22]

    // [3, 4] [7, 8] [(3*5 + 4*7), (3*6 + 4*8)] [43, 50]
    public static void multMatriz() {
        int[][] matrizA = {
                { 1, 2 },
                { 3, 4 }
        };

        int[][] matrizB = {
                { 5, 6 },
                { 7, 8 }
        };

        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;

        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
            System.out.println("No se puede realizar la multiplicación de matrices. Las dimensiones no son válidas.");
            return;
        }

        int[][] matrizResultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int sum = 0;
                for (int k = 0; k < columnasA; k++) {
                    sum += matrizA[i][k] * matrizB[k][j];
                }
                matrizResultado[i][j] = sum;
            }
        }

        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);

        System.out.println("Matriz B:");
        mostrarMatriz(matrizB);

        System.out.println("Matriz Resultado:");
        mostrarMatriz(matrizResultado);
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 4. Matriz espiralada: Pedir al usuario dos números para crear una matriz
    // “tamaño1 x tamaño2” y luego rellenarla de forma espiralada en sentido
    // horario, comenzando desde (0,0). Por ejemplo, una matriz 3x4 se llenaría de
    // la siguiente manera:
    // [1, 2, 3, 4]
    // [10, 11 , 12 ,5]
    // [9, 8, 7, 6]

    public static void espiralMatriz() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        int valor = 1;
        int inicioFila = 0;
        int finFila = filas - 1;
        int inicioColumna = 0;
        int finColumna = columnas - 1;

        while (valor <= filas * columnas) {
            for (int i = inicioColumna; i <= finColumna; i++) {
                matriz[inicioFila][i] = valor++;
            }
            inicioFila++;

            for (int i = inicioFila; i <= finFila; i++) {
                matriz[i][finColumna] = valor++;
            }
            finColumna--;

            if (inicioFila <= finFila) {
                for (int i = finColumna; i >= inicioColumna; i--) {
                    matriz[finFila][i] = valor++;
                }
                finFila--;
            }

            if (inicioColumna <= finColumna) {
                for (int i = finFila; i >= inicioFila; i--) {
                    matriz[i][inicioColumna] = valor++;
                }
                inicioColumna++;
            }
        }

        System.out.println("Matriz espiralada:");
        mostrarMatrizEspiral(matriz);

        scanner.close();
    }

    public static void mostrarMatrizEspiral(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
