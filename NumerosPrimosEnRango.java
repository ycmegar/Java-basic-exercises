// Ejercicio 17: Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.
import java.util.Scanner;

public class NumerosPrimosEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Números primos entre " + num1 + " y " + num2 + ":");
        
        for (int i = num1; i <= num2; i++) {
            if (esNumeroPrimo(i)) {
                System.out.print(i + " ");
            }
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

