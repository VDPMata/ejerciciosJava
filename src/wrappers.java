import java.util.Scanner;

public class wrappers {
    public static void main(String[] args) {
        // sumaStr();
        // cadenaNumero();
        // verificarLetras();
        // espaciosBlancos();
        // numeroValido();
        //cuentaDigitos();
    }

    /// ----------------------------------------------------------------///
    /// ----------------------------------------------------------------///
    /// ----------------------¡Manos a la obra!-------------------------///
    /// ----------------------------------------------------------------///
    /// ----------------------------------------------------------------///

    // Suma de números: Pide al usuario que ingrese un string que represente un
    // entero, y luego un string que represente un doble.
    // Convierte cada cadena al tipo de dato correspondiente usando los métodos
    // valueOf,
    // suma sus valores e imprímelos por consola.
    public static void sumaStr() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        String strEntero = scanner.nextLine();
        int entero = Integer.valueOf(strEntero);

        System.out.println("Ingrese un numero decimal: ");
        String strDecimal = scanner.nextLine();
        double decimal = Double.valueOf(strDecimal);

        System.out.println("La suma es: " + (entero + decimal));
        scanner.close();
    }

    // Conversión de cadena a número: Escribir un programa que lea un dato tipo
    // cadena pero que represente
    // un número entero como entrada utilizando la clase Scanner, y luego convierta
    // la cadena en un número
    // entero utilizando la clase de envoltura Integer.
    public static void cadenaNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        String cadena = scanner.nextLine();

        int numero = Integer.parseInt(cadena);

        System.out.println("El numero entero es: " + numero);
        scanner.close();
    }

    // Verificar si una cadena contiene solo letras: Pide al usuario que ingrese una
    // cadena.
    // Crea un bucle que recorra cada carácter en la cadena y use
    // Character.isLetter()
    // para verificar si todos los caracteres son letras. Muestra un mensaje al
    // usuario
    // indicando si la cadena contiene solo letras o no.
    public static void verificarLetras() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cadena");
        String cadena = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (!Character.isLetter(caracter)) {
                contador = 1;
                break;
            }
        }
        if (contador == 0) {
            System.out.println("La cadena contiene solo letras");
        } else {
            System.out.println("La cadena no contiene solo letras");
        }
        scanner.close();
    }

    // Cuenta espacios en blanco en una cadena: Pide al usuario que ingrese una
    // cadena.
    // Crea un bucle que recorra cada carácter en la cadena y use
    // Character.isWhitespace()
    // para contar el número de espacios en blanco en la cadena. Muestra el recuento
    // al usuario.
    public static void espaciosBlancos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cadena");
        String cadena = scanner.nextLine();
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isWhitespace(caracter)) {
                contador++;
            }
        }
        System.out.println("En la cadena se encuentran: " + contador + " espacios");
        scanner.close();
    }

    // Verificar si una cadena representa un número válido: Pide al usuario que
    // ingrese una cadena.
    // Intenta convertir la cadena a un doble usando Double.valueOf(). Si la cadena
    // no representa un número válido, Double.valueOf()
    // lanzará una excepción. Atrapa esta excepción y muestra un mensaje al usuario
    // indicando que la entrada no es un número válido.
    public static void numeroValido() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cadena");
        String cadena = scanner.nextLine();
        try {
            double numero = Double.valueOf(cadena);
            System.out.println("La cadena es un numero valido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("La cadena no tiene numeros validos");
        }
        scanner.close();
    }

    // Cuenta dígitos en un número: Pide al usuario que ingrese un número. Convierte
    // el número a una cadena
    // y luego utiliza un bucle y Character.isDigit() para contar el número de
    // dígitos en el número.
    public static void cuentaDigitos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        String numeroStr = String.valueOf(numero);
        int contador = 0;

        for (int i = 0; i < numeroStr.length(); i++) {
            if (Character.isDigit(numeroStr.charAt(i))) {
                contador++;
            }
        }
        System.out.println("La cantidad de digitos encontrados es: " + contador);
        scanner.close();
    }

}
