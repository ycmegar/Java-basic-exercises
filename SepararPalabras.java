// Ejercicio 25: Pide al usuario una frase y muestra cada palabra por separado 
import java.util.Scanner;

public class SepararPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        String[] palabras = frase.split("\\s+");
        
        System.out.println("Palabras en la frase:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        scanner.close();
    }
}

