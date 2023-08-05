// Ejercicio 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci. La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
public class SerieFibonacci {
    public static void main(String[] args) {
        int n = 20; // Número de términos en la serie Fibonacci
        int[] fibonacci = new int[n];
        
        // Inicializar los primeros dos términos
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        // Calcular los términos restantes
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        // Mostrar la serie Fibonacci
        System.out.println("Los primeros 20 números de la serie Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}

