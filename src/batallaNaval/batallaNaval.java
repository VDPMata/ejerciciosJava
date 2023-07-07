package batallaNaval;
import java.util.Random;
import java.util.Scanner;


public class batallaNaval{
    public static void main(String[] args) {
        char[][] jugador = generarMatriz(4, 4);
        char[][] computadora = generarMatriz(4, 4);

        colocarBarcos(computadora, 5);

        int barcosJugador = 5;
        int barcosComputadora = 5;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (barcosJugador > 0 && barcosComputadora > 0) {
            System.out.println("Mapa de la computadora:");
            imprimirMatrizOculta(computadora);
            System.out.println("Mapa del jugador:");
            imprimirMatriz(jugador);

            System.out.print("Ingresa las coordenadas (Ejemplo: A2): ");
            String coordenadasJugador = scanner.nextLine();
            int[] coordenadas = convertirCoordenadas(coordenadasJugador);

            if (coordenadas != null) {
                if (computadora[coordenadas[0]][coordenadas[1]] == '=') {
                    System.out.println("¡Has acertado!");
                    computadora[coordenadas[0]][coordenadas[1]] = 'A';
                    barcosComputadora--;
                } else if (computadora[coordenadas[0]][coordenadas[1]] == 'A') {
                    System.out.println("Ya has atacado esa posición antes.");
                } else {
                    System.out.println("Has fallado.");
                    jugador[coordenadas[0]][coordenadas[1]] = 'X';
                }

                if (barcosComputadora == 0) {
                    break;
                }

                int filaComputadora = random.nextInt(4);
                int columnaComputadora = random.nextInt(4);

                if (jugador[filaComputadora][columnaComputadora] == '=') {
                    System.out.println("¡La computadora ha acertado!");
                    jugador[filaComputadora][columnaComputadora] = 'A';
                    barcosJugador--;
                } else if (jugador[filaComputadora][columnaComputadora] == 'A') {
                    System.out.println("La computadora ha atacado esa posición antes.");
                } else {
                    System.out.println("La computadora ha fallado.");
                    jugador[filaComputadora][columnaComputadora] = 'X';
                }
            } else {
                System.out.println("Coordenadas inválidas. Vuelve a intentarlo.");
            }
        }

        System.out.println("Mapa de la computadora:");
        imprimirMatriz(computadora);
        System.out.println("Mapa del jugador:");
        imprimirMatriz(jugador);

        if (barcosJugador == 0) {
            System.out.println("¡Has ganado la partida!");
        } else {
            System.out.println("La computadora ha ganado la partida.");
        }
        scanner.close();
    }   
    public static char[][] generarMatriz(int filas, int columnas) {
        char[][] matriz = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = '~';
            }
        }
        return matriz;
    }

    public static void colocarBarcos(char[][] matriz, int barcos) {
        Random random = new Random();
        int barcosColocados = 0;

        while (barcosColocados < barcos) {
            int fila = random.nextInt(matriz.length);
            int columna = random.nextInt(matriz[0].length);
            if (matriz[fila][columna] != '=') {
                matriz[fila][columna] = '=';
                barcosColocados++;
            }
        }
    }

    public static void imprimirMatriz(char[][] matriz) {
        System.out.println("-  1 2 3 4");
        char filaLetra = 'A';
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(filaLetra + "| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            filaLetra++;
        }
    }

    public static void imprimirMatrizOculta(char[][] matriz) {
        System.out.println("-  1 2 3 4");
        char filaLetra = 'A';
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(filaLetra + "| ");
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == '=') {
                    System.out.print("~ ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
            filaLetra++;
        }
    }

    public static int[] convertirCoordenadas(String coordenadas) {
        int[] resultado = new int[2];
        if (coordenadas.length() != 2) {
            return null;
        }

        char filaLetra = coordenadas.charAt(0);
        char columnaLetra = coordenadas.charAt(1);

        if (filaLetra < 'A' || filaLetra > 'D' || columnaLetra < '1' || columnaLetra > '4') {
            return null;
        }

        resultado[0] = filaLetra - 'A';
        resultado[1] = columnaLetra - '1';

        return resultado;
    }
        
}



