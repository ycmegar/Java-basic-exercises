// Ejercicio 26: Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco 
import java.util.Scanner;

public class ContarCaracteresSinEspacios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        
        int cantidadCaracteres = contarCaracteresSinEspacios(cadena);
        
        System.out.println("La cadena tiene " + cantidadCaracteres + " caracteres (sin contar los espacios en blanco).");
        
        scanner.close();
    }
    
    // Función para contar la cantidad de caracteres sin espacios en una cadena
    public static int contarCaracteresSinEspacios(String cadena) {
        return cadena.replace(" ", "").length();
    }
}

