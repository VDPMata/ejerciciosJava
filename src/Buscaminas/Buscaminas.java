import java.util.Random;

public class Buscaminas {
    public static void main(String[] args) {
        Buscaminas buscaminas = new Buscaminas();
        buscaminas.generarMapa();
        buscaminas.imprimirMapa();
        buscaminas.calcularConteoMinas();
        System.out.println("Numero de minas: ");
    }
    private static final int filas = 8;
    private static final int columnas = 8;
    private static final int minas = 10;
    private static final char celdaMina = 'M';
    private static final char celdaVacia = 'O';

    private char[][] mapa;
    private int[][] conteoMinas;

    public void generarMapa() {
        mapa = new char[filas][columnas];
        conteoMinas = new int[filas][columnas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mapa[i][j] = celdaVacia;
            }
        }


        Random random = new Random();
        int minasColocadas = 0;
        while (minasColocadas < minas) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);
            if (mapa[fila][columna] != celdaMina) {
                mapa[fila][columna] = celdaMina;
                minasColocadas++;
            }
        }
    }

    public void imprimirMapa() {
        System.out.println("Mapa:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void calcularConteoMinas() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (mapa[i][j] != celdaMina) {
                    int minasCircundantes = contarMinasCircundantes(i, j);
                    conteoMinas[i][j] = minasCircundantes;
                }
            }
        }

        
    }

    private int contarMinasCircundantes(int fila, int columna) {
        int minasCircundantes = 0;

        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (i >= 0 && i < filas && j >= 0 && j < columnas) {
                    if (mapa[i][j] == celdaMina) {
                        minasCircundantes++;
                    }
                }
            }
        }
        return minasCircundantes;
    }

}