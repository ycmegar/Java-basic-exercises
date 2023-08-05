// Ejercicio 31: Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente.	
import java.util.Scanner;

public class OrdenamientoSeleccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        ordenarPorSeleccion(arreglo);
        
        System.out.println("Arreglo ordenado de manera ascendente:");
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        
        scanner.close();
    }
    
    // Función para ordenar un arreglo por selección
    public static void ordenarPorSeleccion(int[] arreglo) {
        int n = arreglo.length;
        
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            
            if (indiceMenor != i) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[indiceMenor];
                arreglo[indiceMenor] = temp;
            }
        }
    }
}

