import java.util.Random;

public class desafios {
    public static void main(String[] args) {
        generadorContrasenas();
    }

    // Generador de contraseñas
    // Desarrollar un programa en Java que genere una contraseña aleatoria. Esta
    // contraseña estará compuesta por una mezcla de letras mayúsculas, letras
    // minúsculas y dígitos. La contraseña deberá ser almacenada en un arreglo de
    // Character.

    // Para la generación de la contraseña, utilice un bucle for que repita la
    // operación tantas veces como la longitud de la contraseña que haya
    // especificado el usuario.

    // Para comprobar que la contraseña generada contiene al menos una letra
    // mayúscula, una letra minúscula y un dígito, utilice bucles do-while y while
    // con los métodos isUpperCase, isLowerCase y isDigit de la clase Character.

    // Finalmente, convierta el arreglo de caracteres en un String con un for y
    // luego imprima la contraseña generada en la consola.

    public static void generadorContrasenas() {
        int longitud = 8;

        char[] contraseña = new char[longitud];
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int tipoCaracter = random.nextInt(3);

            if (tipoCaracter == 0) {
                contraseña[i] = mayuscula(random);
            } else if (tipoCaracter == 1) {
                contraseña[i] = minuscula(random);
            } else {
                contraseña[i] = digito(random);
            }
        }

        boolean contieneMayuscula = false;
        boolean contieneMinuscula = false;
        boolean contieneDigito = false;

        do {
            for (int i = 0; i < longitud; i++) {
                if (Character.isUpperCase(contraseña[i])) {
                    contieneMayuscula = true;
                } else if (Character.isLowerCase(contraseña[i])) {
                    contieneMinuscula = true;
                } else if (Character.isDigit(contraseña[i])) {
                    contieneDigito = true;
                }
            }

            if (!contieneMayuscula || !contieneMinuscula || !contieneDigito) {
                for (int i = 0; i < longitud; i++) {
                    int tipoCaracter = random.nextInt(3);

                    if (tipoCaracter == 0) {
                        contraseña[i] = mayuscula(random);
                    } else if (tipoCaracter == 1) {
                        contraseña[i] = minuscula(random);
                    } else {
                        contraseña[i] = digito(random);
                    }
                }
            }
        } while (!contieneMayuscula || !contieneMinuscula || !contieneDigito);

        String contraseñaGenerada = new String(contraseña);
        System.out.println("Contraseña generada: " + contraseñaGenerada);
    }

    private static char mayuscula(Random random) {
        return (char) (random.nextInt(26) + 'A');
    }

    private static char minuscula(Random random) {
        return (char) (random.nextInt(26) + 'a');
    }

    private static char digito(Random random) {
        return (char) (random.nextInt(10) + '0');
    }

    // Desarrollar un programa en Java que genere un arreglo de calificaciones de
    // manera aleatoria.

    // Estas calificaciones se deben almacenar en un arreglo de Strings.

    // Una vez generado el arreglo, el programa debe generar 3 arreglos nuevos,
    // separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y
    // excelente (>=10).

    // Necesitaras convertir los Strings a double para lograrlo.

    // Luego debes calcular el promedio del arreglo original y de cada uno de los
    // nuevos arreglos.

    // Por ultimo imprime los resultado en consola.

   
}
