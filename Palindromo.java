// Ejercicio 22: Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda) 
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        boolean esPalindromo = esPalindromo(frase);
        
        if (esPalindromo) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
        
        scanner.close();
    }
    
    // Función para verificar si una frase es un palíndromo
    public static boolean esPalindromo(String frase) {
        frase = frase.replaceAll("\\s+", "").toLowerCase();
        int inicio = 0;
        int fin = frase.length() - 1;
        
        while (inicio < fin) {
            if (frase.charAt(inicio) != frase.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        
        return true;
    }
}

