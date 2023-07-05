import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class repaso2 {
    public static void main(String[] args) {
        menuOracion();
    }
    // Escribir un programa en Java que permita al usuario realizar diversas
    // operaciones con una oración.
    // El programa debe cumplir con los siguientes requisitos:
    // 1. Mostrar un menú de opciones al usuario donde podrá:

    // a) "Crear oración" o "Borrar oración": Si la oración está vacía, mostrar el
    // mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje
    // "Borrar oración". agregar de a 1 palabra.

    // b) "Cantidad de caracteres de la oración": Calcular y mostrar la cantidad
    // total de caracteres en la oración (incluyendo espacios).

    // c) "Cantidad de palabras de la oración": Calcular y mostrar la cantidad de
    // palabras en la oración.

    // d) "Mostrar palabras ordenadas alfabéticamente": Mostrar las palabras de la
    // oración ordenadas alfabéticamente.

    // e) "Ingresar un número y devolver la palabra correspondiente": Solicitar al
    // usuario ingresar un número y mostrar la palabra correspondiente a esa
    // posición en la oración. Si se ingresa un número fuera del rango de número de
    // palabras (la primera palabra corresponde al número 1), mostrar el mensaje
    // "Número inválido. Intente nuevamente".

    // f) "Buscar palabra dentro de la oración": Solicitar al usuario ingresar una
    // palabra y verificar si esa palabra se encuentra en la oración. Mostrar un
    // mensaje indicando si la palabra fue encontrada y la posición en la que se
    // encuentra.

    // g) "Modificar palabra dentro de la oración": Solicitar al usuario ingresar la
    // palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra
    // y volver a solicitar la palabra. Si la palabra es correcta, solicitar una
    // nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración
    // modificada (recuerda validar que solo contenga letras y espacios).

    // h) "Agregar contenido a la oración": Solicitar al usuario ingresar contenido
    // y agregar ese contenido al final de la oración.

    // i) "Salir": Terminar el programa.

    // 2. Después de realizar una operación, mostrar el menú de opciones nuevamente
    // para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".
    public static void menuOracion(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> oracion = new ArrayList<>();

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("a) Crear oración o Borrar oración");
            System.out.println("b) Cantidad de caracteres de la oración");
            System.out.println("c) Cantidad de palabras de la oración");
            System.out.println("d) Mostrar palabras ordenadas alfabéticamente");
            System.out.println("e) Ingresar un número y devolver la palabra correspondiente");
            System.out.println("f) Buscar palabra dentro de la oración");
            System.out.println("g) Modificar palabra dentro de la oración");
            System.out.println("h) Agregar contenido a la oración");
            System.out.println("i) Salir");

            System.out.print("Ingrese una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion.toLowerCase()) {
                case "a":
                    if (oracion.isEmpty()) {
                        System.out.println("Crear oración");
                        crearOracion(scanner, oracion);
                    } else {
                        System.out.println("Borrar oración");
                        borrarOracion(oracion);
                    }
                    break;
                case "b":
                    System.out.println("Cantidad de caracteres de la oración: " + contarCaracteres(oracion));
                    break;
                case "c":
                    System.out.println("Cantidad de palabras de la oración: " + contarPalabras(oracion));
                    break;
                case "d":
                    palabrasOrdenadas(oracion);
                    break;
                case "e":
                    ingresarNumeroYMostrarPalabra(scanner, oracion);
                    break;
                case "f":
                    buscarPalabra(scanner, oracion);
                    break;
                case "g":
                    modificarPalabra(scanner, oracion);
                    break;
                case "h":
                    agregarContenido(scanner, oracion);
                    break;
                case "i":
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
    

    public static void crearOracion(Scanner scanner, ArrayList<String> oracion) {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        
        oracion.add(palabra);
    }

    public static void borrarOracion(ArrayList<String> oracion) {
        oracion.clear();
        System.out.println("Oración borrada.");
    }

    public static int contarCaracteres(ArrayList<String> oracion) {
        int contador = 0;
        for (String palabra : oracion) {
            contador += palabra.length();
        }
        return contador;
    }

    public static int contarPalabras(ArrayList<String> oracion) {
        return oracion.size();
    }

    public static void palabrasOrdenadas(ArrayList<String> oracion) {
        ArrayList<String> palabrasOrdenadas = new ArrayList<>(oracion);
        Collections.sort(palabrasOrdenadas);

        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabrasOrdenadas) {
            System.out.println(palabra);
        }
    }

    public static void ingresarNumeroYMostrarPalabra(Scanner scanner, ArrayList<String> oracion) {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        if (numero >= 1 && numero <= oracion.size()) {
            String palabra = oracion.get(numero - 1);
            System.out.println("Palabra correspondiente al número " + numero + ": " + palabra);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    public static void buscarPalabra(Scanner scanner, ArrayList<String> oracion) {
        System.out.print("Ingrese una palabra: ");
        String palabraBuscada = scanner.nextLine();

        boolean encontrada = false;
        int posicion = -1;

        for (int i = 0; i < oracion.size(); i++) {
            if (oracion.get(i).equalsIgnoreCase(palabraBuscada)) {
                encontrada = true;
                posicion = i + 1;
                break;
            }
        }

        if (encontrada) {
            System.out.println("La palabra \"" + palabraBuscada + "\" se encuentra en la posición " + posicion);
        } else {
            System.out.println("La palabra \"" + palabraBuscada + "\" no fue encontrada en la oración.");
        }
    }

    public static void modificarPalabra(Scanner scanner, ArrayList<String> oracion) {
        System.out.print("Ingrese la palabra que desea cambiar: ");
        String palabraBuscar = scanner.nextLine();

        int posicion = -1;

        for (int i = 0; i < oracion.size(); i++) {
            if (oracion.get(i).equalsIgnoreCase(palabraBuscar)) {
                posicion = i;
                break;
            }
        }

        if (posicion == -1) {
            System.out.println("La palabra \"" + palabraBuscar + "\" no se encontró en la oración.");
            return;
        }

        System.out.print("Ingrese la nueva palabra: ");
        String nuevaPalabra = scanner.nextLine();

        oracion.set(posicion, nuevaPalabra);
        System.out.println("Oración modificada:");
        mostrarOracion(oracion);
    }

    public static void agregarContenido(Scanner scanner, ArrayList<String> oracion) {
        System.out.print("Ingrese contenido a agregar: ");
        String contenido = scanner.nextLine();

        oracion.add(contenido);
        System.out.println("Contenido agregado correctamente.");
    }

    public static void mostrarOracion(ArrayList<String> oracion) {
        System.out.println("Oración:");
        for (String palabra : oracion) {
            System.out.print(palabra + " ");
        }
        System.out.println();
    }
}


