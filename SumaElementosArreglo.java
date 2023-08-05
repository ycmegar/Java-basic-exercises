// Ejercicio 28: Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.
import java.util.Scanner;

public class SumaElementosArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        int suma = calcularSuma(arreglo);
        
        System.out.println("La suma de los elementos en el arreglo es: " + suma);
        
        scanner.close();
    }
    
    // Función para calcular la suma de los elementos en un arreglo
    public static int calcularSuma(int[] arreglo) {
        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
}

