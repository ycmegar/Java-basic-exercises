// Ejercicio 12: Realiza un programa que pida al usuario un número entero y determine si es un número primo o no
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        boolean esPrimo = esNumeroPrimo(numero);
        
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        
        scanner.close();
    }
    
    // Función para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

