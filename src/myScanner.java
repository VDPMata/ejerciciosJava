import java.util.Scanner;

public class myScanner {
     
     public static void main(String[] args) throws Exception{
        
        //primerScanner();
        //opreacionesArimeticas();
        //operacionesLogicas();
        //operacionesLogicasCombinadas();
        //opciones();
      }
      
  ///----------------------------------------------------------------///
  ///----------------------------------------------------------------///
  ///----------------------¡Manos a la obra!-------------------------///
  ///----------------------------------------------------------------///
  ///----------------------------------------------------------------///
    
    
   // 1. Solicitar al usuario que ingrese su nombre, guardarlo en una variable. 
   // 2. Solicitar al usuario que ingrese su edad, guardarlo en una variable.
   // 3. Imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.
     public static void primerScanner(){

      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese su nombre: ");
      String nombre = scanner.nextLine();

      System.out.println("Ingrese su edad");
      int edad = scanner.nextInt();

      System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
      
      scanner.close();
    }
    
  //1. Dados dos números, realizar las 5 operaciones posibles en Java y mostrar el resultado en consola. 
  //2. Pedir al usuario que ingrese dos números, guardarlos en una variable, realizar la suma de los números y mostrar el resultado en la consola.
     
    public static void opreacionesArimeticas(){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Ingrese el primer numero: ");
      int numero1 = scanner.nextInt();

      System.out.println("Ingrese el segundo numero");
      int numero2 = scanner.nextInt();

      System.out.println("La suma de ambos numeros es: " + (numero1+numero2) );
      System.out.println("La resta de ambos numeros es: " + (numero1-numero2));
      System.out.println("La multiplicacion de ambos numeros es: "+ (numero1*numero2));
      System.out.println("La division de ambos numeros es:"+ (numero1/numero2));
      System.out.println("El modulo de ambos numeros es: "+ (numero1%numero2));
      
      int suma = numero1 + numero2;
      
      System.out.println("La suma entre ambos es: " + suma);
            
      scanner.close();
    }

// 1. Pedir al usuario que introduzca dos números, y: 
// 2. Comparar si número 1 es mayor a número 2.
// 3. Comparar si número 1 es distinto a número 2.
// 4. Comparar si número 1 es divisible por 2. consideramos divisible si queda un numero entero...

    public static void operacionesLogicas(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese el primer numero: ");
      int numero1 = scanner.nextInt();
      System.out.println("Ingrese el segundo numero");
      int numero2 = scanner.nextInt();

      if(numero1 > numero2){
        System.out.println("El primer numero "+ numero1 + " es mayor que "+ numero2);
      }
      if(numero1 == numero2){
        System.out.println("Los numeros son iguales: "+ numero1 + " = " + numero2);
      }
      if(numero1%numero2==0 ){
        System.out.println("El resultado de la division es: " + (numero1/numero2));
      }
      scanner.close();

    }

// Pedir al usuario que ingrese 4 números y comparar:
// Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
// Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.

    public static void operacionesLogicasCombinadas(){

      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese el primer numero: ");
      int numero1 = scanner.nextInt();
      System.out.println("Ingrese el segundo numero");
      int numero2 = scanner.nextInt();
      System.out.println("Ingrese el tercer numero: ");
      int numero3 = scanner.nextInt();
      System.out.println("Ingrese el cuarto numero");
      int numero4 = scanner.nextInt();
      
      if(numero1>numero2 && numero3>numero4){
        System.out.println("El numero1: "+ numero1 +" es mayor al numero2: "+ numero2 + " y el numero3: "+ numero3 + " es mayor al numero4: "+ numero4);
      }
      if(numero1>numero2 || numero3>numero4){
        System.out.println("El numero1: "+numero1 + " es mayor al numero2: "+ numero2 +" o si el numero3: "+ numero3 + " es mayor al numero4: "+ numero4);
      }
      scanner.close();

    }

// 1. Solicitar al usuario que ingrese un número y guardarlo en una variable.
// 2. Crear un programa que identifique si el número es par o impar.
// 3. Mostrar el resultado en la consola.

    public static void parOImpar(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese un numero");
      int num = scanner.nextInt();
      if(num%2==0){
        System.out.println("El numero es par");
      }else{
        System.out.println("El numero es impar");   
      }
      scanner.close();
    }


// 1. Recibir dos números del usuario.
// 2. Declarar variables para almacenar los números y el resultado de la operación
// 3. Permitir al usuario elegir qué operación quiere realizar.
// 4. Mostrar el resultado de la operación en la consola.

    public static void opciones(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese un numero");
      int num1 = scanner.nextInt();
      System.out.println("Ingrese otro");
      int num2 = scanner.nextInt();

      System.out.println("=== Opciones ===");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicacion");
      System.out.println("4. Division");
      System.out.println("Ingrese la opcion deseada: ");
      int opcion = scanner.nextInt();

      switch(opcion){
        case 1:
        System.out.println("La suma es: "+(num1+num2));
        break;

        case 2:
        System.out.println("La resta es: "+(num1-num2));
        break;

        case 3:
        System.out.println("La multiplicacion "+(num1*num2));
        break;

        case 4:
        System.out.println("La division es: "+(num1/num2));
        break;

        default:
        System.out.println("Opcion invalida");
      }
      scanner.close();

    }
   }

