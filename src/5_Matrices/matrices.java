
public class matrices {
    public static void main(String[] args) {
        // matrizOrgArr();
        // sumaMatriz();
        // mayorMenorMatriz();
        // parImparMatriz();
        // imprimirInverso();
        //matrizTranspuesta();

    }

    // 1. Matriz de elementos: Crea una matriz de 3x3 con enteros y muestra su
    // contenido por consola en formato de matriz. Luego, muestra el mismo contenido
    // en formato de arreglo. Por ejemplo:
    // Matriz original:
    // [5, 3, 2]
    // [8, 1, 5]

    // Arreglo:
    // [5] [3] [2]
    // [8] [1] [5]

    public static void matrizOrgArr() {
        int[][] matriz = {
                { 5, 3, 2 },
                { 8, 1, 5 }
        };

        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Arreglo: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
        }
    }

    // 2. Suma de los elementos de una matriz: Calcula e imprime la suma de todos
    // los elementos de la matriz.

    public static void sumaMatriz() {
        int[][] matriz = {
                { 5, 3, 2 },
                { 8, 1, 5 }
        };
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

    // 3. Encontrar el número más grande y más pequeño en una matriz: Encuentra y
    // muestra el número más grande y más pequeño en una matriz.

    public static void mayorMenorMatriz() {
        int[][] matriz = {
                { 5, 3, 2 },
                { 8, 1, 5 }
        };
        int mayor = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("El numero mas grande de la matriz es: " + mayor);
        System.out.println("El numero menor de la matriz es: " + menor);
    }

    // 4. Contar los números pares e impares en una matriz: Cuenta y muestra cuántos
    // números pares e impares hay en una matriz.
    public static void parImparMatriz() {
        int[][] matriz = {
                { 5, 3, 2 },
                { 8, 1, 5 }
        };

        int par = 0;
        int impar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }
        System.out.println("La cantidad de impares es: " + impar);
        System.out.println("La cantidad de pares es: " + par);
    }

    // 5. Imprimir una matriz en orden inverso: Imprime los elementos de una matriz
    // en orden inverso.
    public static void imprimirInverso() {
        int[][] matriz = {
                { 5, 3, 2 },
                { 8, 1, 5 }
        };

        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    // Transposición de matrices: Imprime por consola la transposición de una
    // matriz. La transposición es una nueva matriz donde las filas de la matriz
    // original se convierten en columnas y viceversa.
    public static void matrizTranspuesta(){
        int[][] matriz = {
            { 5, 3, 2 },
            { 8, 1, 5 }
        };

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < matrizTranspuesta.length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz original: ");
        mostrarMatriz(matriz);

        System.out.println("Matriz transpuesta");
        mostrarMatriz(matrizTranspuesta);
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
