// Ejercicio 27: Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente
import java.util.Arrays;
import java.util.Scanner;

public class OrdenarPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        String[] palabras = frase.split("\\s+");
        Arrays.sort(palabras);
        
        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        scanner.close();
    }
}

