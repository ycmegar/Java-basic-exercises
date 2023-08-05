// Ejercicio 4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.
import java.util.Scanner;

public class MayorMenorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        
        scanner.close();
    }
}

