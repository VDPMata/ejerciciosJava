import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class repaso3 {
    public static void main(String[] args) {
        registroAlumnos();
    }
    // Escribir un programa en Java que permita llevar un registro de alumnos.

    // El programa debe cumplir con los siguientes requisitos:

    // 1. Mostrar un menú de opciones al usuario, donde podrá seleccionar una de las
    // siguientes acciones:

    // a) "Registrar alumno": Permitir al usuario registrar un nuevo alumno
    // ingresando su nombre y nota.

    // b) "Mostrar todos los alumnos": Mostrar en pantalla el nombre y la nota de
    // todos los alumnos registrados hasta el momento.

    // c) "Mostrar promedio de notas": Calcular y mostrar en pantalla el promedio de
    // las notas de todos los alumnos registrados hasta el momento.

    // d) "Buscar alumno por nombre": Solicitar al usuario ingresar el nombre de un
    // alumno y mostrar en pantalla su nota si el alumno existe.

    // e) "Modificar nota por nombre": Solicitar al usuario ingresar el nombre de un
    // alumno y permitir modificar su nota si el alumno existe.

    // f) "Eliminar alumno por nombre": Solicitar al usuario ingresar el nombre de
    // un alumno y eliminar al alumno si existe.

    // g) "Salir": Terminar el programa.

    // 2. El programa debe validar que el nombre no esté vacío y que la nota sea un
    // número válido entre 0.00 y 10.00.

    // 3. El programa debe utilizar las estructuras de control adecuadas (if,
    // switch, for, while, do-while) según corresponda para implementar las
    // diferentes opciones del menú.

    // 4. El programa debe manejar excepciones utilizando bloques try-catch para
    // manejar posibles excepciones al leer datos de entrada del usuario.

    // 5. Después de realizar una operación, mostrar el menú de opciones nuevamente
    // para que el usuario pueda elegir otra acción hasta que elija la opción
    // "Salir".

    public static void registroAlumnos() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
            System.out.println("Menú de opciones:");
            System.out.println("1) Registrar alumno");
            System.out.println("2) Mostrar todos los alumnos");
            System.out.println("3) Mostrar promedio de notas");
            System.out.println("4) Buscar alumno por nombre");
            System.out.println("5) Modificar nota por nombre");
            System.out.println("6) Eliminar alumno por nombre");
            System.out.println("7) Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        registrarAlumno(scanner, nombres, notas);
                        break;
                    case 2:
                        mostrarAlumnos(nombres, notas);
                        break;
                    case 3:
                        mostrarPromedioNotas(notas);
                        break;
                    case 4:
                        buscarAlumno(scanner, nombres, notas);
                        break;
                    case 5:
                        modificarNota(scanner, nombres, notas);
                        break;
                    case 6:
                        eliminarAlumno(scanner, nombres, notas);
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
                scanner.nextLine();
            }
        }

        System.out.println("¡Hasta luego!");
        scanner.close();
    }

    public static void registrarAlumno(Scanner scanner, ArrayList<String> nombres, ArrayList<Double> notas) {
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();

        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
            return;
        }

        double nota = -1;

        while (nota < 0 || nota > 10) {
            try {
                System.out.print("Ingrese la nota del alumno (0.00 - 10.00): ");
                nota = scanner.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Nota inválida. Intente nuevamente.");
                scanner.nextLine();
            }
        }

        scanner.nextLine();

        nombres.add(nombre);
        notas.add(nota);

        System.out.println("Alumno registrado correctamente.");
    }

    public static void mostrarAlumnos(ArrayList<String> nombres, ArrayList<Double> notas) {
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.println("Lista de alumnos registrados:");
        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            double nota = notas.get(i);
            System.out.println("Nombre: " + nombre + ", Nota: " + nota);
        }
    }

    public static void mostrarPromedioNotas(ArrayList<Double> notas) {
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas.");
            return;
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        double promedio = suma / notas.size();

        System.out.println("Promedio de notas: " + promedio);
    }

    public static void buscarAlumno(Scanner scanner, ArrayList<String> nombres, ArrayList<Double> notas) {
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String nombre = scanner.nextLine();

        int indice = nombres.indexOf(nombre);

        if (indice == -1) {
            System.out.println("El alumno no existe.");
        } else {
            double nota = notas.get(indice);
            System.out.println("Alumno encontrado. Nota: " + nota);
        }
    }

    public static void modificarNota(Scanner scanner, ArrayList<String> nombres, ArrayList<Double> notas) {
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a modificar: ");
        String nombre = scanner.nextLine();

        int indice = nombres.indexOf(nombre);

        if (indice == -1) {
            System.out.println("El alumno no existe.");
        } else {
            double nuevaNota = -1;

            while (nuevaNota < 0 || nuevaNota > 10) {
                try {
                    System.out.print("Ingrese la nueva nota del alumno (0.00 - 10.00): ");
                    nuevaNota = scanner.nextDouble();

                    if (nuevaNota < 0 || nuevaNota > 10) {
                        System.out.println("Nota inválida. Intente nuevamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Nota inválida. Intente nuevamente.");
                    scanner.nextLine();
                }
            }

            scanner.nextLine();

            notas.set(indice, nuevaNota);
            System.out.println("Nota modificada correctamente.");
        }
    }

    public static void eliminarAlumno(Scanner scanner, ArrayList<String> nombres, ArrayList<Double> notas) {
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno a eliminar: ");
        String nombre = scanner.nextLine();

        int indice = nombres.indexOf(nombre);

        if (indice == -1) {
            System.out.println("El alumno no existe.");
        } else {
            nombres.remove(indice);
            notas.remove(indice);
            System.out.println("Alumno eliminado correctamente.");
        }
    }
}
