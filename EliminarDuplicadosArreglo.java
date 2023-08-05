// Ejercicio 30: Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.
import java.util.Scanner;
import java.util.Arrays;

public class EliminarDuplicadosArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        int[] arregloSinDuplicados = eliminarDuplicados(arreglo);
        
        System.out.println("Arreglo sin elementos duplicados:");
        for (int elemento : arregloSinDuplicados) {
            System.out.print(elemento + " ");
        }
        
        scanner.close();
    }
    
    // Función para eliminar elementos duplicados de un arreglo
    public static int[] eliminarDuplicados(int[] arreglo) {
        int n = arreglo.length;
        int tamanioSinDuplicados = 0;
        
        for (int i = 0; i < n; i++) {
            boolean esDuplicado = false;
            
            for (int j = 0; j < tamanioSinDuplicados; j++) {
                if (arreglo[i] == arreglo[j]) {
                    esDuplicado = true;
                    break;
                }
            }
            
            if (!esDuplicado) {
                arreglo[tamanioSinDuplicados] = arreglo[i];
                tamanioSinDuplicados++;
            }
        }
        
        return Arrays.copyOf(arreglo, tamanioSinDuplicados);
    }
}

