// Ejercicio 15: Crea un programa que pida al usuario un número entero y determine si es un número capicúa. Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.
import java.util.Scanner;

public class NumeroCapicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        boolean esCapicua = esNumeroCapicua(numero);
        
        if (esCapicua) {
            System.out.println(numero + " es un número capicúa.");
        } else {
            System.out.println(numero + " no es un número capicúa.");
        }
        
        scanner.close();
    }
    
    // Función para verificar si un número es capicúa
    public static boolean esNumeroCapicua(int numero) {
        int numeroOriginal = numero;
        int numeroReverso = 0;
        
        while (numero > 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;
        }
        
        return numeroReverso == numeroOriginal;
    }
}
