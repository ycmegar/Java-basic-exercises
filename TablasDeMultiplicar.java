// Ejercicio 35: Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al 10. Usa para esto una matriz
public class TablasDeMultiplicar {
    public static void main(String[] args) {
        int[][] tablaMultiplicar = new int[10][10];

        // Llenar la matriz con las tablas de multiplicar
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }

        // Imprimir las tablas de multiplicar
        for (int i = 0; i < 10; i++) {
            System.out.println("Tabla de multiplicar del " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println((i + 1) + " x " + (j + 1) + " = " + tablaMultiplicar[i][j]);
            }
            System.out.println();
        }
    }
}
