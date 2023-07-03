import java.util.Random;
import java.util.Scanner;

public class buclesDos {
    public static void main(String[] args) {
        //recorrerArray();
        //arrayCaracteres();
        //sumaPromedioArray();
        //cadenaArray();
        //menuInteractivo();
        //adivinarNumero()
        //contrasenaSecreto();
        //cantidadDigitos();
    }

  ///----------------------------------------------------------------///
  ///----------------------------------------------------------------///
  ///----------------------¡Manos a la obra!-------------------------///
  ///----------------------------------------------------------------///
  ///----------------------------------------------------------------///
  
// Contar elementos pares: Escribir un programa que recorra un array de enteros e imprima por consola sus elementos.
    public static void recorrerArray(){
         int[] array = {1, 5, 6, 8, 19, 28, 30};
         for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
         }     
    }

// Contar ocurrencias: Escribir un programa que recorra un array de caracteres y solicite al usuario un carácter objetivo,
// y cuente cuántas veces aparece el carácter objetivo en el array y lo imprima por consola.
    public static void arrayCaracteres(){
        Scanner scanner = new Scanner(System.in);
        char[] array = {'a','b','c','o','q','p','w','a'};
        int contador = 0;
        System.out.println("Ingrese un caracter");
        char caracter = scanner.next().charAt(0);
        for (int i = 0; i < array.length; i++) {
            if(array[i] == caracter){
                contador++;
            }
        }
        System.out.println("El caracter se repite: " + contador);
        scanner.close();

    }

// Calcular promedio: Sumar todos los elementos de un array de números reales y calcular su promedio e imprimirlo en consola.
    public static void sumaPromedioArray(){
        int[] array = {15,15,2,3,6,95,85,27};
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma+=array[i];
        }
        System.out.println("La suma es:" + suma + " y el promedio es: " + (suma/array.length) );
    }

// Concatenar elementos: Concatenar todos los elementos de un array de cadenas en una sola cadena separada por espacios e imprimirlo
// en consola.
    public static void cadenaArray(){
        String[] palabras = {"Hola", "mundo", "Java",};
        StringBuilder strgBuilder = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            strgBuilder.append(palabras[i]);
            if(i < palabras.length-1){
                strgBuilder.append(" ");
            }
        }
        System.out.println(strgBuilder.toString());
    }

// Menú interactivo con while: Crea un menú interactivo que solicite al usuario que elija una opción de un conjunto de opciones. 
// El menú debe seguir apareciendo hasta que el usuario elija la opción para salir del programa. Para este ejercicio, 
// no es necesario que las opciones del menú realicen acciones reales. Solo necesitas mostrar un mensaje que indique qué 
// opción eligió el usuario.
    public static void menuInteractivo(){
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while(!salir){
            System.out.println("***** Menú *****");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.println("-----------------");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ha seleccionado la opcion 1");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opcion 2");
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opcion 3");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una opción valida.");
                    break;
            }
        }
        scanner.close();
    }

// Adivinar el número: Escribir un programa que genere un número aleatorio entre 1 y 100, y le pida al usuario 
// adivinar ese número utilizando un bucle do-while. El programa debe mostrar un mensaje indicando si el número 
// ingresado es mayor o menor que el número aleatorio, y continuar pidiendo al usuario que adivine hasta que lo haga correctamente.
    public static void adivinarNumero(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numAleatorio = random.nextInt(100)+1;
        int numeroIngresado;
        int contador = 0;
        
        System.out.println("***Bienvenido***");
        System.out.println("Intente adivinar el numero generado");
        do {
            numeroIngresado = scanner.nextInt();
            contador++;
            if(numAleatorio>numeroIngresado){
                System.out.println("El numero ingresado es menor");
                System.out.println("Ingrese otro numero");
            }else if(numAleatorio<numeroIngresado){
                System.out.println("El numero ingresado es mayor");
                System.out.println("Ingrese otro numero");
            }else {
                System.out.println("Felicidades encontraste el numero en "+ contador +" intentos");
            }
        } while (numAleatorio != numeroIngresado);
        System.out.println("Felicitaciones encontraste el numero en " + contador + " intentos");    
        scanner.close();
    }


// Validación de contraseña: Escribir un programa que solicite al usuario ingresar una contraseña y la valide utilizando un bucle while. 
// La contraseña correcta es "secreto". El programa debe seguir pidiendo al usuario que ingrese la contraseña hasta que sea correcta.
    public static void contrasenaSecreto(){
        Scanner scanner = new Scanner(System.in);
        String contrasena =  " ";
    
        do {    
            System.out.println("Ingrese su contraseña");
            contrasena = scanner.nextLine();

        } while (!contrasena.equals("secreto"));
            System.out.println("Iniciando sesion...");
        scanner.close();
    }

// Número de dígitos: Escribe un programa que le pida al usuario un número entero y utilice un bucle while para calcular 
// el número de dígitos de ese número. Por ejemplo, el número 4578 tiene 4 dígitos 
// (pensar en la lógica para el 0 que debe devolver que tiene una cifra y también para que se cuenten las cifras de números negativos).
    public static void cantidadDigitos(){
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        if(numero == 0){
            contador++;
        }else{
            if(numero<0){
                numero=-numero;
            }
        while(numero != 0){
            numero = numero/10;
            contador++;
        }
        }
        System.out.println("El numero tiene "+ contador + " digitos");
        scanner.close();
    }
}
