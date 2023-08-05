// Ejercicio 5. Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.

import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println("El primer número (" + num1 + ") es mayor que el segundo número (" + num2 + ").");
        } else if (num2 > num1) {
            System.out.println("El segundo número (" + num2 + ") es mayor que el primer número (" + num1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
        scanner.close();
    }
}

