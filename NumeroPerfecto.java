// Ejercicio 14: Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.
import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        boolean esPerfecto = esNumeroPerfecto(numero);
        
        if (esPerfecto) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
        
        scanner.close();
    }
    
    // Función para verificar si un número es perfecto
    public static boolean esNumeroPerfecto(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        int sumaDivisores = 1; // Empezamos con 1 porque todo número es divisible por 1
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
                if (i != numero / i) {
                    sumaDivisores += numero / i;
                }
            }
        }
        
        return sumaDivisores == numero;
    }
}

