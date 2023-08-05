// Ejercicio 34: Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.
import java.util.Scanner;

public class RotacionArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        System.out.print("Ingrese la cantidad de posiciones para rotar (positivo hacia la derecha, negativo hacia la izquierda): ");
        int cantidadPosiciones = scanner.nextInt();
        
        int[] arregloRotado = rotarArreglo(arreglo, cantidadPosiciones);
        
        System.out.println("Arreglo rotado:");
        for (int elemento : arregloRotado) {
            System.out.print(elemento + " ");
        }
        
        scanner.close();
    }
    
    // Función para rotar un arreglo hacia la izquierda o la derecha
    public static int[] rotarArreglo(int[] arreglo, int cantidadPosiciones) {
        int n = arreglo.length;
        int[] arregloRotado = new int[n];
        
        for (int i = 0; i < n; i++) {
            int nuevaPosicion = (i + cantidadPosiciones) % n;
            if (nuevaPosicion < 0) {
                nuevaPosicion += n;
            }
            arregloRotado[nuevaPosicion] = arreglo[i];
        }
        
        return arregloRotado;
    }
}

