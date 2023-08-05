// Ejercicio 23: Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene
import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una oración: ");
        String oracion = scanner.nextLine();
        
        int cantidadPalabras = contarPalabras(oracion);
        
        System.out.println("La oración contiene " + cantidadPalabras + " palabras.");
        
        scanner.close();
    }
    
    // Función para contar cuántas palabras contiene una oración
    public static int contarPalabras(String oracion) {
        String[] palabras = oracion.split("\\s+");
        return palabras.length;
    }
}
