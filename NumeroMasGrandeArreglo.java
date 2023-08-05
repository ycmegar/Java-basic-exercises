// Ejercicio 29: Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros.
import java.util.Scanner;

public class NumeroMasGrandeArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        int maximo = encontrarMaximo(arreglo);
        
        System.out.println("El número más grande en el arreglo es: " + maximo);
        
        scanner.close();
    }
    
    // Función para encontrar el número más grande en un arreglo
    public static int encontrarMaximo(int[] arreglo) {
        int maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }
}

