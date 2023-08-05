// Ejercicio 7. Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.
import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Por favor ingrese un número entero positivo.");
        } else {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
        
        scanner.close();
    }
}
