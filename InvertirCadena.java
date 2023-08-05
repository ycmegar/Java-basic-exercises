// Ejercicio 20: Realiza un programa que solicite al usuario una cadena y luego invierta su orden 
import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        
        String cadenaInvertida = invertirCadena(cadena);
        
        System.out.println("Cadena invertida: " + cadenaInvertida);
        
        scanner.close();
    }
    
    // Función para invertir una cadena
    public static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder();
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        
        return cadenaInvertida.toString();
    }
}

