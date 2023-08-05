// Ejercicio 33: Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrecuenciaElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        Map<Integer, Integer> frecuencia = contarFrecuencia(arreglo);
        
        System.out.println("Frecuencia de elementos en el arreglo:");
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println("Elemento " + entry.getKey() + ": " + entry.getValue() + " veces");
        }
        
        scanner.close();
    }
    
    // Función para contar la frecuencia de elementos en un arreglo
    public static Map<Integer, Integer> contarFrecuencia(int[] arreglo) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        
        for (int elemento : arreglo) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }
        
        return frecuencia;
    }
}

