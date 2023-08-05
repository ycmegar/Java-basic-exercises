// Ejercicio 32: Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra).
import java.util.Scanner;

public class BuscarElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        System.out.print("Ingrese el número que desea buscar: ");
        int numeroBuscado = scanner.nextInt();
        
        int indice = buscarElemento(arreglo, numeroBuscado);
        
        if (indice != -1) {
            System.out.println("El número " + numeroBuscado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
        
        scanner.close();
    }
    
    // Función para buscar un elemento en un arreglo
    public static int buscarElemento(int[] arreglo, int numeroBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                return i;
            }
        }
        return -1; // Retorna -1 si el elemento no se encuentra en el arreglo
    }
}

