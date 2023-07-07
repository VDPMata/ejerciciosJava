import java.util.Scanner;

public class estructurasControl {
  public static void main(String[] args) {
    // calificacion();
    // positivoNegativo();
    // divisibilidad();
    // contrasena();
    // descuento();
    // diaOpcion();
    // calificaciones();
    // figurasGeometricas();
    // diaHabil();
    // guardarSalir();
  }

  /// ----------------------------------------------------------------///
  /// ----------------------------------------------------------------///
  /// ----------------------¡Manos a la obra!-------------------------///
  /// ----------------------------------------------------------------///
  /// ----------------------------------------------------------------///

  // 1. Ejercicio de calificación: Escribir un programa que solicite al usuario
  // una puntuación entre 0 y 100. Luego, mostrar en pantalla la calificación
  // correspondiente según la siguiente escala:
  // Si la puntuación está entre 90 y 100, muestra "A".
  // Si la puntuación está entre 80 y 89, muestra "B".
  // Si la puntuación está entre 70 y 79, muestra "C".
  // Si la puntuación está entre 60 y 69, muestra "D".
  // Si la puntuación es menor a 60, muestra "F".
  public static void calificacion() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la calificacion del 0 al 100: ");
    int calificacion = scanner.nextInt();
    if (calificacion >= 90) {
      System.out.println("A");
    } else if (calificacion >= 80 && calificacion < 90) {
      System.out.println("B");
    } else if (calificacion >= 70 && calificacion < 80) {
      System.out.println("C");
    } else if (calificacion >= 60 && calificacion < 70) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
    scanner.close();
  }

  // 2. Ejercicio de números positivos y negativos: Escribir un programa que
  // solicite
  // al usuario un número y determine si es positivo, negativo o cero. Mostrar el
  // resultado en pantalla.
  public static void positivoNegativo() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int num = scanner.nextInt();
    if (num == 0) {
      System.out.println("El numero es: " + num);
    } else if (num < 0) {
      System.out.println("El numero es negativo: " + num);
    } else if (num > 0) {
      System.out.println("El numero es positivo: " + num);
    }
    scanner.close();
  }

  // 3. Ejercicio de divisibilidad: Escribir un programa que solicite al usuario
  // un número y determine si es divisible por 5 y por 3, por ninguno de
  // los dos o por ambos. Mostrar el resultado en pantalla.
  public static void divisibilidad() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int num = scanner.nextInt();
    if (num % 5 == 0 && num % 3 == 0) {
      System.out.println("El numero es divisible por 5 y por 3");
    } else if (num % 5 == 0) {
      System.out.println("Es divisible por 5");
    } else if (num % 3 == 0) {
      System.out.println("El numero es divisible por 3");
    } else {
      System.out.println("No es divisible por ninguno");
    }
    scanner.close();
  }

  // Ejercicio de verificación de contraseña: Escribir un programa que solicite
  // al usuario una contraseña y verifique si coincide con una contraseña
  // predefinida.
  // Si la contraseña ingresada es correcta, mostrar un mensaje de "Acceso
  // concedido".
  // De lo contrario, mostrar un mensaje de "Acceso denegado".
  public static void contrasena() {
    int passDefinida = 2365;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese contrasena");
    int pass = scanner.nextInt();
    if (pass == passDefinida) {
      System.out.println("Acceso condedio");
    } else {
      System.out.println("Acceso denegado");
    }
    scanner.close();
  }

  // Ejercicio de cálculo de descuento: Escribir un programa que solicite al
  // usuario el
  // precio de un producto y determine si tiene derecho a un descuento.
  // Si el precio es mayor o igual a $100, aplicar un descuento del 10% y mostrar
  // el nuevo precio.
  // De lo contrario, mostrar el precio original sin descuento.
  public static void descuento() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el precio");
    double precio = scanner.nextInt();
    if (precio > 100) {
      System.out.println("El precio final es: " + precio * 0.90);
    } else {
      System.out.println("El precio final es: " + precio);
    }
    scanner.close();
  }

  // Ejercicio de días de la semana: Escribir un programa que solicite al usuario
  // un número del 1 al 7,
  // representando un día de la semana, y muestre en pantalla el nombre
  // correspondiente a ese día.
  // Utilizar la estructura "switch" para implementar este programa.
  public static void diaOpcion() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Un dia del 1 al 7");
    int dia = scanner.nextInt();

    switch (dia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miercoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sabado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("No ingreso ningun numero valido");
    }
    scanner.close();
  }

  // Ejercicio de conversión de calificaciones: Escribir un programa que solicite
  // al usuario una calificación
  // numérica del 1 al 5 y muestre en pantalla la calificación correspondiente en
  // letras, utilizando la siguiente escala:
  // 1: "Muy deficiente"
  // 2: "Deficiente"
  // 3: "Suficiente"
  // 4: "Notable"
  // 5: "Sobresaliente". Utilizar la estructura "switch" para implementar este
  // programa.
  public static void calificaciones() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Califique el servicio");
    int calificacion = scanner.nextInt();

    switch (calificacion) {
      case 1:
        System.out.println("Muy deficiente");
        break;
      case 2:
        System.out.println("Deficiente");
        break;
      case 3:
        System.out.println("Suficiente");
        break;
      case 4:
        System.out.println("Notable");
        break;
      case 5:
        System.out.println("Sobresaliente");
        break;
      default:
        System.out.println("Opcion invalida");
    }
    scanner.close();
  }

  // Ejercicio de selección de figura geométrica: Escribir un programa que
  // solicite al usuario un número del 1 al 3
  // para seleccionar una figura geométrica (1: círculo, 2: cuadrado, 3:
  // triángulo). Luego, mostrar en pantalla
  // el área correspondiente a la figura seleccionada. Utilizar la estructura
  // "switch" para implementar este programa.
  public static void figurasGeometricas() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero del 1 al 3");
    int opcion = scanner.nextInt();
    switch (opcion) {
      case 1:
        System.out.println("Circulo");
        break;
      case 2:
        System.out.println("Cuadrado");
        break;
      case 3:
        System.out.println("Triangulo");
        break;
      default:
        System.out.println("Opcion no valida");
    }
    scanner.close();
  }

  // Ejercicio de verificación de día hábil: Escribir un programa que solicite al
  // usuario un número del 1 al 7,
  // representando un día de la semana, y determine si es un día hábil o un día no
  // hábil. Mostrar el resultado en pantalla.
  // Considerar que los días hábiles son del 1 al 5 (de lunes a viernes), y
  // utilizar la estructura "switch" para implementar este programa.
  public static void diaHabil() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese dia ");
    int opcion = scanner.nextInt();
    switch (opcion) {
      case 1:
        System.out.println("Habil");
        break;
      case 2:
        System.out.println("Habil");
        break;
      case 3:
        System.out.println("Habil");
        break;
      case 4:
        System.out.println("Habil");
        break;
      case 5:
        System.out.println("Habil");
        break;
      case 6:
        System.out.println("dia no habil ");
        break;
      case 7:
        System.out.println("dia no habil");
        break;
      default:
        System.out.println("opcion no valida");
    }
    scanner.close();
  }

  // Ejercicio de selección de opción: Escribir un programa que muestre un menú
  // con las siguientes opciones:
  // Opción 1: "Guardar"
  // Opción 2: "Cargar"
  // Opción 3: "Salir" Solicitar al usuario que ingrese un número del 1 al 3 para
  // seleccionar una opción. Utilizar la estructura "switch" para implementar este
  // programa y mostrar en pantalla el mensaje correspondiente a la opción
  // seleccionada.
  public static void guardarSalir() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese una opcion del 1 al 3");
    int opcion = scanner.nextInt();
    switch (opcion) {
      case 1:
        System.out.println("Guardar");
        break;
      case 2:
        System.out.println("Cargar");
        break;
      case 3:
        System.out.println("Salir");
        break;
      default:
        System.out.println("Opcion no valida");
    }
    scanner.close();
  }
}
