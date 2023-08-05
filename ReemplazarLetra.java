// Ejercicio 24: Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra
import java.util.Scanner;

public class ReemplazarLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Ingrese la letra que desea reemplazar: ");
        char letraAntigua = scanner.next().charAt(0);
        
        System.out.print("Ingrese la nueva letra: ");
        char letraNueva = scanner.next().charAt(0);
        
        String cadenaModificada = reemplazarLetra(cadena, letraAntigua, letraNueva);
        
        System.out.println("Cadena modificada: " + cadenaModificada);
        
        scanner.close();
    }
    
    // Función para reemplazar una letra por otra en una cadena
    public static String reemplazarLetra(String cadena, char letraAntigua, char letraNueva) {
        return cadena.replace(letraAntigua, letraNueva);
    }
}

