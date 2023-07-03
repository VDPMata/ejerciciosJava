import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class tryStringMath {
    public static void main(String[] args) {
        //tryCatch();
        //stringToInt();
        //longitudCadena();
        //concatenar();
        //extraccionStr();
        //busquedaCaracteres();
        //mayusMinus();
        //valorAbsoluto();
        //redondeo();
        //numeroAleatorios();
        //potencia();
        //raiz();
        //conversorTemperatura();
        //validacionContrasena();
    }

  ///----------------------------------------------------------------///
  ///----------------------------------------------------------------///
  ///----------------------¡Manos a la obra!-------------------------///
  ///----------------------------------------------------------------///
  ///----------------------------------------------------------------///

    // 1. Ejercicio de división segura: Escribe un programa que solicite al usuario 
    // dos números enteros y realice la división del primer número entre el segundo número. 
    // Utiliza un bloque "try-catch" para manejar la excepción en caso de que se intente realizar 
    // una división por cero. En caso de que se produzca la excepción, muestra un mensaje adecuado en pantalla.
    public static void tryCatch(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Ingrese un numero");
            int numero1 = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numero2 = scanner.nextInt(); 
            System.out.println("La division de los numeros es: "+(numero1/numero2));
        } catch (ArithmeticException e){
            System.out.println("Error: No se puede dividir por cero.");
        }          
            scanner.close();
        }
    
    // Ejercicio de conversión de cadena a entero: Escribe un programa que solicite al usuario 
    // una cadena de caracteres que represente un número entero. Utiliza el método Integer.parseInt() 
    // para convertir la cadena a un número entero. Utiliza un bloque "try-catch" para manejar la excepción 
    // en caso de que la cadena ingresada no pueda ser convertida a un número entero. En caso de que se produzca 
    // la excepción, muestra un mensaje adecuado en pantalla.    
    public static void stringToInt(){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingrese una cadena de caracteres");
            String cadena = scanner.nextLine();
            int numero = Integer.parseInt(cadena);
            System.out.println("El numero entero ingresado es: " + numero);
        }catch(NumberFormatException e){
            System.out.println("Error: La cadena ingresada no se puede convertir a numeros enteros");
            }
            scanner.close();
        }
        
    // Ejercicio de longitud de cadena: Escribir un programa que solicite al usuario una cadena de texto 
    // y muestre en pantalla la longitud de la cadena utilizando el método length() de la clase String.
    public static void longitudCadena(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena: ");
        String cadena = scanner.nextLine();
        System.out.println(cadena.length());
        scanner.close();
        }
    
    // Ejercicio de concatenación de cadenas: Escribir un programa que solicite al usuario su 
    // nombre y apellido por separado, y luego muestre en pantalla el nombre completo utilizando 
    // el método concat() de la clase String.
    public static void concatenar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = scanner.nextLine();

        System.out.println("Hola ".concat(nombre).concat(" ").concat(apellido));
        
        scanner.close();
    }
      
    // Ejercicio de extracción de subcadena: Escribir un programa que solicite al usuario una 
    // frase y dos números enteros, representando un índice inicial y un índice final. 
    // Utilizar el método substring() de la clase String para extraer la subcadena que se encuentra 
    // entre los índices ingresados por el usuario, y mostrar la subcadena resultante en pantalla.
    public static void extraccionStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();
        System.out.println("Ingrese el indice inicial");
        int indiceInicial = scanner.nextInt();
        System.out.println("Ingrese el indice final");
        int indiceFinal = scanner.nextInt();
        System.out.println(frase.substring(indiceInicial, indiceFinal));
        scanner.close();
    }

    // Ejercicio de búsqueda de caracteres: Escribir un programa que solicite al usuario 
    // una palabra y un carácter, y determine si el carácter ingresado se encuentra en la palabra 
    // utilizando el método indexOf() de la clase String. Mostrar un mensaje adecuado en pantalla 
    // indicando si el carácter se encuentra o no en la palabra.
    public static void busquedaCaracteres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = scanner.nextLine();
        System.out.println("Ingrese un caracter");
        char caracter = scanner.next().charAt(0);
        System.out.println(palabra.indexOf(caracter)+1);
        scanner.close();
    }

    // Ejercicio de conversión de mayúsculas y minúsculas: Escribir un programa que solicite al usuario 
    // una cadena de texto y muestre en pantalla la misma cadena, pero con todos los caracteres 
    // en mayúsculas o minúsculas. Utilizar los métodos toUpperCase() y toLowerCase() 
    // de la clase String para realizar la conversión.
    public static void mayusMinus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de text");
        String cadena = scanner.nextLine();
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        scanner.close();
    }

    //Ejercicio de cálculo del valor absoluto: Escribir un programa que solicite al usuario un número entero y muestre 
    //en pantalla su valor absoluto utilizando el método abs() de la clase Math.
    public static void valorAbsoluto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = scanner.nextInt();
        System.out.println(Math.abs(numero));
        scanner.close();
    }

    //Ejercicio de redondeo de números: Escribir un programa que solicite al usuario un número decimal y muestre 
    //en pantalla su valor redondeado utilizando el método round() de la clase Math.
    public static void redondeo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal");
        double numeroDecimal = scanner.nextDouble();
        System.out.println(Math.round(numeroDecimal));
        scanner.close();

    }

    //Ejercicio de generación de números aleatorios: Escribir un programa que genere y muestre en pantalla un número 
    //aleatorio en el rango del 1 al 100 utilizando el método random() de la clase Math. Puedes utilizar el método floor() 
    //para redondear el número aleatorio hacia abajo.
    public static void numeroAleatorios(){
        double numeroRandom = Math.floor(Math.random()*100);
        System.out.println(numeroRandom);
    }

    //Ejercicio de cálculo de potencia: Escribir un programa que solicite al usuario dos números enteros, 
    //representando la base y el exponente, y calcular el resultado de elevar la base al exponente utilizando el método pow() 
    //de la clase Math. Mostrar el resultado en pantalla.
    public static void potencia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base");
        int base = scanner.nextInt();
        System.out.println("Ingrese su exponente");
        int exp = scanner.nextInt();
        System.out.println(Math.pow(base, exp));
        scanner.close();
    }

    //Ejercicio de cálculo de raíz cuadrada: Escribir un programa que solicite al usuario un número positivo y calcule 
    //su raíz cuadrada utilizando el método sqrt() de la clase Math. Si el número ingresado es negativo, mostrar un mensaje adecuado en pantalla.
    public static void raiz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo");
        double num = scanner.nextInt();
        System.out.println(Math.sqrt(num));
        scanner.close();
    }

    
    // Conversión de unidades de temperatura 
    // Escribir un programa que solicite al usuario una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F). 
    // Luego, el programa debe convertir la temperatura a la otra unidad de medida y mostrar el resultado en pantalla. 
    // El programa debe manejar las siguientes situaciones:
    // Si el usuario ingresa una unidad de medida inválida, mostrar un mensaje de error.
    // Si el usuario ingresa una temperatura no válida, mostrar un mensaje de error.
    public static void conversorTemperatura(){
        Scanner scanner = new Scanner(System.in);
        double temperatura = 0.0;
        String unidad = "";

        try {
            System.out.println("Ingrese la temperatura: ");
            temperatura = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: La temperatura ingresada no es valida.");
            scanner.close();
            return;
        }

        try{
            System.out.println("Ingrese la unidad de medida (C para Celsius, F para Fahrenheit)");
            unidad = scanner.next();
        } catch(InputMismatchException e) {
            System.out.println("Error: La unidad de medida ingresada no es valida");
            scanner.close();
            return;
        }

        if(unidad.equalsIgnoreCase("c")){
            System.out.println("La temperatura en Fahrenheit es: " + (temperatura*9/5)+32);
        }else if(unidad.equalsIgnoreCase("f")){
            System.out.println("La temperatura en Celcius es: " + (temperatura - 32)*5/9);
        }else{
            System.out.println("Error: Unidad de medida invalida");
        }

        scanner.close();
    }

    
    // Validación de contraseña
    // Escribir un programa que solicite al usuario que ingrese una contraseña y verifique si cumple con los siguientes criterios para considerarse segura:
    // La contraseña debe tener al menos 8 caracteres.
    // La contraseña debe contener al menos una letra mayúscula y una letra minúscula.
    // La contraseña debe contener al menos un número.
    // La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).
    // El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los criterios establecidos. Puedes utilizar métodos de la clase String para verificar cada uno de los criterios.
    public static void validacionContrasena(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

        if (esContrasenaSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no cumple con los criterios de seguridad.");
        }

        scanner.close();
    }

    public static boolean esContrasenaSegura(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }

        boolean tieneLetraMayuscula = false;
        boolean tieneLetraMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);

            if (Character.isUpperCase(caracter)) {
                tieneLetraMayuscula = true;
            } else if (Character.isLowerCase(caracter)) {
                tieneLetraMinuscula = true;
            } else if (Character.isDigit(caracter)) {
                tieneNumero = true;
            } else if (esCaracterEspecial(caracter)) {
                tieneCaracterEspecial = true;
            }
        }

        return tieneLetraMayuscula && tieneLetraMinuscula && tieneNumero && tieneCaracterEspecial;
    }

    public static boolean esCaracterEspecial(char caracter) {
        String caracteresEspeciales = "!@#$%^&*()-_=+[{]};:',<.>/?";
        return caracteresEspeciales.contains(String.valueOf(caracter));
    }

}



