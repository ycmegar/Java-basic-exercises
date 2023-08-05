// Ejercicio 6. Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.
import java.util.Scanner;

public class PositivoNegativoCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();
        
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        scanner.close();
    }
}

