// Ejercicio 21: Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella 
import java.util.Scanner;

public class ContarLetraEnCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0);
        
        int contador = contarLetraEnCadena(cadena, letra);
        
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");
        
        scanner.close();
    }
    
    // Función para contar cuántas veces aparece una letra en una cadena
    public static int contarLetraEnCadena(String cadena, char letra) {
        int contador = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        
        return contador;
    }
}

