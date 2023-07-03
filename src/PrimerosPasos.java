public class PrimerosPasos {
    public static void main(String[] args) throws Exception {
        
        // holaMundo();
        // saludoNombre();
        // saludoNombre2("Nombre");//Remplazar el parametro
        // saludoEdad();
        // saludoNombreEdad("Nombre",10);//Remplazar los parametros
        // variables();
    }


  ///----------------------------------------------------------------///
  ///----------------------------------------------------------------///
  ///----------------------¡Manos a la obra!-------------------------///
  ///----------------------------------------------------------------///
  ///----------------------------------------------------------------///

    //Crear un programa que imprima "Hola Mundo" en la consola. 
    public static void holaMundo(){
        System.out.println("Hola Mundo");
    }

    //Crear un programa que imprima "Mi nombre es [tu nombre]" en la consola. 
    public static void saludoNombre(){
        String nombre = "Nombre";
        System.out.println("Mi nombre es " + nombre);
    }

    //Mismo ejercicio pero esta vez ejecutamos la funcion con un parametro
    public static void saludoNombre2(String nombre){
        System.out.println("Mi nombre es "+ nombre);
    }

    //Crear un programa que imprima "Mi edad es [edad]" en la consola.
    public static void saludoEdad(){
        int edad = 5;
        System.out.println("Mi edad es " + edad);
    }

    //Declarar una variable para edad y otra para nombre e imprimir en pantalla un texto que diga “Mi nombre es [nombre], y tengo [edad] años”
    public static void saludoNombreEdad(String nombre, int edad){
        System.out.println("Hola mi nombre es: " + nombre + "\nTengo " + edad + " Años");
    }

    //Crear e imprime una variable por cada uno de los siguientes tipos de dato: 
    public static void variables(){
        boolean truefalse = true;
        char caracter = 'a';
        String texto = "Hola mundo";
        int numeroEntero = 123;
        long numeroLargo = 1000000000L;
        float numeroDecimal = 3.14f;
        System.out.println("***Variables***");
        System.out.println(truefalse);
        System.out.println(caracter);
        System.out.println(texto);
        System.out.println(numeroEntero);
        System.out.println(numeroLargo);
        System.out.println(numeroDecimal);
    }
}
