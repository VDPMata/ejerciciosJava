import java.util.Arrays;
import java.util.Scanner;

public class buclesTres {
    public static void main(String[] args) {
        // ordenSort();
        // busquedaBinaria();
        // arreglosIguales();
        // busquedaArray();
        rellenarArray();
    }

    // 1. Ordenar en forma descendente: Escribir un programa que ordene un arreglo
    // de enteros en forma descendente
    // utilizando el método Arrays.sort(). Y los imprima ordenados en la consola.
    public static void ordenSort() {
        int[] array = { 1, 15, 25, 11, 3, 89, 7 };
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    // 2. Búsqueda binaria: Escribir un programa que realice una búsqueda binaria en
    // un arreglo ordenado de enteros
    // utilizando el método Arrays.binarySearch(). El programa debe imprimir el
    // índice del valor buscado si está presente en el arreglo.
    public static void busquedaBinaria() {
        Scanner scanner = new Scanner(System.in);
        int[] array = { 1, 3, 15, 18, 19, 23 };
        System.out.println("Ingrese el valor a buscar dentro del array");
        int valor = scanner.nextInt();
        int indice = Arrays.binarySearch(array, valor);
        if (indice >= 0) {
            System.out.println("El valor " + valor + " esta presente en el array[" + indice + "]");
        } else {
            System.out.println("El valor no se encontro");
        }
        scanner.close();
    }

    // 3. Comparar arreglos: Escribir un programa que compare dos arreglos de
    // enteros utilizando el método Arrays.equals().
    // El programa debe imprimir si los arreglos son iguales o no.
    public static void arreglosIguales() {
        int[] array = { 1, 3, 15, 18, 19, 23 };
        int[] array2 = { 1, 3, 15, 18, 19, 23 };
        int[] array3 = { 0, 3, 5, 8, 19, 32 };
        boolean iguales = Arrays.equals(array, array2);
        boolean iguales2 = Arrays.equals(array, array3);
        System.out.println("Los arreglos son iguales? " + iguales);
        System.out.println("Los arreglos son iguales? " + iguales2);
    }

    // 4. Crear un programa en Java que declare y muestre un arreglo de enteros
    // junto con sus indices.
    // Luego, el programa debe solicitar al usuario dos índices: un índice inicial y
    // un índice final.
    // Con estos dos índices, el programa debe copiar la parte del arreglo original
    // comprendida entre estos dos índices
    // (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange().
    // Asegúrese de incluir validaciones para confirmar que el índice inicial es
    // menor que el
    // índice final y que ambos índices estén dentro del rango válido del arreglo
    // original.
    // Finalmente, el programa debe imprimir el nuevo arreglo por consola.
    public static void busquedaArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = { 1, 3, 15, 18, 19, 23 };
        int indiceInicial;
        int indiceFinal;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indice:" + i + " Valor:" + array[i]);
        }
        System.out.println("Ingrese el indice inicial");
        indiceInicial = scanner.nextInt();
        System.out.println("Ingrese el indice final");
        indiceFinal = scanner.nextInt();
        if (indiceInicial > indiceFinal || indiceInicial < 0 || indiceFinal >= array.length) {
            System.out.println("Los indice ingresados no son validos");
        }
        int[] arrayCopia = Arrays.copyOfRange(array, indiceInicial, indiceFinal);
        for (int i = 0; i < arrayCopia.length; i++) {
            System.out.println("Indice:" + i + " Valor:" + arrayCopia[i]);
        }
        scanner.close();
    }

    // 5. Rellenar un arreglo: Escribir un programa que solicite al usuario el
    // tamaño para un arreglo y un entero con el cual quiera rellanarlo,
    // crear el arreglo y usar Arrays.fill(). Luego, imprime el arreglo resultante.
    public static void rellenarArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arregloa: ");
        int tamaño = scanner.nextInt();
        System.out.println("Ingrese el valor para rellenar el arreglo: ");
        int valor = scanner.nextInt();
        int[] array = new int[tamaño];
        Arrays.fill(array, valor);
        System.out.println("Array: " + Arrays.toString(array));
        scanner.close();
    }
    // 6. Rellenar un arreglo de manera personalizada: Escribir un programa en Java
    // que solicite al usuario un tamaño para un arreglo.
    // Luego, debe pedirle que ingrese un número con el cual desea rellenar cierta
    // parte del arreglo, seguido de un índice final.
    // Esta parte del arreglo deberá ser rellenada con el número proporcionado hasta
    // el indice ingresado por el usuario.
    // Si el índice final ingresado no es el último índice del arreglo, el programa
    // debe continuar pidiendo al usuario nuevos números
    // para rellenar el arreglo, hasta que se haya proporcionado un número para cada
    // posición. Asegúrese de validar lo siguiente:

    // La primera vez que se pide al usuario un número para rellenar el arreglo, el
    // índice inicial debe ser 0.
    // El índice final siempre debe ser menor que el tamaño total del arreglo.
    // Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice
    // inicial debe ser el índice
    // inmediatamente siguiente al último índice final ingresado. El usuario solo
    // deberá ingresar el nuevo índice final.
    // Por último el programa debe imprimir por consola el arreglo completo.

}
