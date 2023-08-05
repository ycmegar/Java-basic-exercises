// Ejercicio 9. Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("Por favor ingrese un número entero positivo.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        
        scanner.close();
    }
}

