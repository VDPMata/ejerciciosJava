import java.util.Scanner;

public class repaso1 {
    public static void main(String[] args) {
        // fibo();
        // numPrimos();
        // factorial();
        // fiboPlus();
        // numPrimosPlus();
    }
    /// ----------------------------------------------------------------///
    /// ----------------------------------------------------------------///
    /// ----------------------¡Manos a la obra!-------------------------///
    /// ----------------------------------------------------------------///
    /// ----------------------------------------------------------------///

    // Fibonacci
    // Escribir un programa que imprima los primeros 8 términos de la serie de
    // Fibonacci utilizando un bucle while. La serie de Fibonacci es una secuencia
    // donde cada número es la suma de los dos anteriores.
    // La serie de Fibonacci comienza de la siguiente manera:
    // Posición 0: 0
    // Posición 1: 1
    // Posición 2: 1 (suma de la posición 0 y la posición 1, 0 + 1 = 1)
    // Posición 3: 2 (suma de la posición 1 y la posición 2, 1 + 1 = 2)
    // Posición 4: 3 (suma de la posición 2 y la posición 3, 1 + 2 = 3)

    // Entonces, los primeros 5 términos (considerando el índice inicial 0) de la
    // serie de Fibonacci son: 0, 1, 1, 2, 3.
    public static void fibo() {
        int contador = 8;
        int posicion = 0;
        int indiceActual = 0;
        int indiceAnterior = 1;

        while (posicion < contador) {
            int indiceSiguiente = indiceActual + indiceAnterior;
            System.out.println("Posicion " + posicion + ": " + indiceActual);
            indiceAnterior = indiceActual;
            indiceActual = indiceSiguiente;
            posicion++;
        }
    }

    // Números primos
    // Solicitar al usuario que introduzca un número y verificar si es primo
    // utilizando un bucle do-while.
    // Un número es primo si solo tiene dos divisores: 1 y él mismo.
    // Si el número no es primo, pedir al usuario que introduzca otro número hasta
    // que introduzca un número primo.
    public static void numPrimos() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
        } while (!esPrimo(numero));

        System.out.println(numero + " es un número primo.");
        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Factorial
    // Escribir un programa que solicite al usuario un número y calcule su factorial
    // utilizando un bucle do-while.
    // El factorial de un número es el producto de todos los números desde 1
    // hasta ese número. Te compartimos algunos ejemplos:
    // El factorial de 3 es 1 * 2 * 3 = 6.
    // El factorial de 5 es 1 * 2 * 3 * 4 * 5 = 120.
    // El factorial de 7 es 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040.
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        int factorial = 1;
        int contador = 1;

        do {
            factorial = factorial * contador;
            contador++;
        } while (contador <= numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
        scanner.close();
    }
    // Fibonacci plus
    // Basándote en el primer ejercicio, ahora crear un programa que solicite al
    // usuario ingresar la posición de un número en la serie de Fibonacci y mostrar
    // el valor correspondiente a esa posición.

    // Recuerda que la serie de Fibonacci comienza con los siguientes valores:
    // Posición 0: 0
    // Posición 1: 1
    // Posición 2: 1
    // Posición 3: 2
    // Posición 4: 3
    public static void fiboPlus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posicion de la serie de Fibonacci: ");
        int posicion = scanner.nextInt();

        int numeroAnterior = 0;
        int numeroActual = 1;

        for (int i = 2; i <= posicion; i++) {
            int siguienteNumero = numeroAnterior + numeroActual;
            numeroAnterior = numeroActual;
            numeroActual = siguienteNumero;
        }
        System.out.println("El numero en la posicion " + posicion + " de la serie de Fibonacci es: " + numeroActual);
        scanner.close();
    }
    
    // Números primos plus
    // Siguiendo el ejemplo del tercer ejercicio, el desafío ahora es desarrollar un
    // programa que solicite al usuario la cantidad deseada de números primos a
    // obtener.
    // El programa debe generar y mostrar la cantidad de números primos solicitada
    // por el usuario.
    public static void numPrimosPlus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int cantidad = scanner.nextInt();
        int numeroActual = 2;
        int contador = 0;

        while (contador < cantidad) {
            if (esPrimo2(numeroActual)) {
                System.out.println(numeroActual);
                contador++;
            }
            numeroActual++;
            scanner.close();
        }
    }

    public static boolean esPrimo2(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
