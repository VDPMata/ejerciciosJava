import java.util.Arrays;
import java.util.Scanner;

public class arrayBucles {
    public static void main(String[] args) {
        // sumaArray();
        // promedioArray();
        // mayorElemento();
        // encontrarElemento();
        // copiaArray();
        // nombresArray();
        // recorrerArray();
        // sumaAcumulada();
        // minimoElemento();
        // elementosInversos();
        // invertirArray();
    }

    /// ----------------------------------------------------------------///
    /// ----------------------------------------------------------------///
    /// ----------------------¡Manos a la obra!-------------------------///
    /// ----------------------------------------------------------------///
    /// ----------------------------------------------------------------///

    // Suma de elementos: Escribir un programa que cree un array de 3
    // enteros e imprima por consola la suma de todos sus elementos, sin usar el
    // bucle for.
    public static void sumaArray() {
        int[] numeros = { 2, 4, 6 };
        int suma = numeros[0] + numeros[1] + numeros[2];
        System.out.println("La suma de los elementos es: " + suma);
    }

    // Promedio de elementos: Escribir un programa que cree un array de 3 enteros
    // e imprima por consola el promedio de todos sus elementos, sin usar el bucle
    // for.
    public static void promedioArray() {
        int[] numeros = { 2, 4, 6 };
        int suma = numeros[0] + numeros[1] + numeros[2];
        System.out.println("El promedio de los elementos es: " + (suma / 3));
    }

    // Encontrar el máximo: Escribir un programa que cree un array de 3 enteros y
    // devuelva
    // el valor máximo presente en el array, sin usar el bucle for.
    public static void mayorElemento() {
        int[] numeros = { 5, 7, 1 };
        if (numeros[0] > numeros[1] && numeros[0] > numeros[2]) {
            System.out.println("El elemento mayor es: " + numeros[0]);
        } else if (numeros[1] > numeros[0] && numeros[1] > numeros[2]) {
            System.out.println("El elemento mayor es: " + numeros[1]);
        } else if (numeros[2] > numeros[0] && numeros[2] > numeros[0]) {
            System.out.println("El elemento mayor es: " + numeros[2]);
        }
    }

    // Buscar un elemento: Escribir un programa que cree un array de 3 enteros y
    // solicite un
    // número al usuario, e imprima por consola si está presente en el array o no,
    // sin usar el bucle for.
    public static void encontrarElemento() {
        int[] numeros = { 12, 2, 19 };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        if (numeros[0] == num || numeros[1] == num || numeros[2] == num) {
            System.out.println("El elemento esta presente dentro del array");
        } else {
            System.out.println("El elemento no se encuentra dentro del array");
        }
        scanner.close();
    }

    // Copiar elementos: Escribir un programa que cree un array de 3 enteros y cree
    // una copia del
    // mismo pero con un tamaño extra de 2 elementos, imprimiendo el contenido del
    // nuevo array por consola, sin usar el bucle for.
    public static void copiaArray() {
        int[] numeros = { 15, 12, 10 };
        int[] copia = new int[numeros.length + 2];
        System.arraycopy(numeros, 0, copia, 0, numeros.length);
        System.out.println("Los elementos del nuevo array son: " + copia[0]);
        System.out.println("Los elementos del nuevo array son: " + copia[1]);
        System.out.println("Los elementos del nuevo array son: " + copia[2]);
        System.out.println("Los elementos del nuevo array son: " + copia[3]);
        System.out.println("Los elementos del nuevo array son: " + copia[4]);
    }

    // Ordenar elementos: Escribir un programa que solicite al usuario 4 nombres, lo
    // cuales debes
    // ordenar alfabeticamente y luego imprimirlos en consola, sin usar el bucle
    // for.
    public static void nombresArray() {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[4];
        System.out.println("Ingrese un nombre");
        nombres[0] = scanner.nextLine();
        System.out.println("Ingrese un nombre");
        nombres[1] = scanner.nextLine();
        System.out.println("Ingrese un nombre");
        nombres[2] = scanner.nextLine();
        System.out.println("Ingrese un nombre");
        nombres[3] = scanner.nextLine();
        Arrays.sort(nombres);

        System.out.println("Los nombres ordenados...");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);
        scanner.close();
    }

    // Imprimir elementos: Escribir un programa que recorra un array de enteros e
    // imprima cada elemento en una línea separada.
    public static void recorrerArray() {
        int[] array = { 1, 5, 6, 8, 19, 28, 30 };
        int contador = 0;
        for (int i = 0; i < array.length; i++) {

            System.out.println(String.format("El elemento en el array[%d] es: %d", contador, array[i]));
            contador++;
        }
    }

    // Calcular suma acumulada: Escribir un programa que recorra un array de enteros
    // y calcule la suma
    // acumulada de los elementos, reemplazando cada elemento por la suma acumulada
    // hasta ese punto.
    public static void sumaAcumulada() {
        int[] numeros = { 15, 30, 48, 123, 87 };
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println(suma);
    }

    // Encontrar el valor mínimo: Escribir un programa que recorra un array de
    // enteros y encuentre el valor mínimo presente en el array.
    public static void minimoElemento() {
        int[] numeros = { 15, 30, 48, 123, 87, 3 };
        int minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (minimo > numeros[i]) {
                minimo = numeros[i];
            }
        }
        System.out.println("El menor elemento es: " + minimo);

    }

    // Imprimir elementos en orden inverso: Escribir un programa que recorra un
    // array de enteros y los imprima en orden inverso,
    // comenzando desde el último elemento.
    public static void elementosInversos() {

        int[] array = { 1, 5, 6, 8, 19, 28, 30 };
        int contador = array.length;
        for (int i = array.length - 1; i >= 0; i--) {

            System.out.println(String.format("El elemento en el array[%d] es: %d", contador, array[i]));
            contador--;
        }

    }

    // Invertir un array: Escribir un programa que recorra un array de enteros y lo
    // invierta
    // (es decir, el primer elemento pasa a ser el último y viceversa) y lo imprima
    // por consola.
    public static void invertirArray() {
        int[] array = { 1, 5, 6, 8, 19, 28, 30 };

        int elementoIzq = 0;
        int elementoDer = array.length - 1;
        while (elementoIzq < elementoDer) {
            int aux = array[elementoIzq];
            array[elementoIzq] = array[elementoDer];
            array[elementoDer] = aux;
            elementoIzq++;
            elementoDer--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elementos: " + array[i]);
        }

    }
}
