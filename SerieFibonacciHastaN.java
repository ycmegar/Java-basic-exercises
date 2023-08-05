// Ejercicio 16: Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario. 
import java.util.Scanner;

public class SerieFibonacciHastaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numeroLimite = scanner.nextInt();
        
        System.out.println("Serie de Fibonacci hasta " + numeroLimite + ":");
        
        int termino1 = 0;
        int termino2 = 1;
        
        while (termino1 <= numeroLimite) {
            System.out.print(termino1 + " ");
            int siguienteTermino = termino1 + termino2;
            termino1 = termino2;
            termino2 = siguienteTermino;
        }
        
        scanner.close();
    }
}

