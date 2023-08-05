// Ejercicio 13: Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales 
import java.util.Scanner;

public class RedondeoDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número decimal: ");
        double numero = scanner.nextDouble();
        
        System.out.print("Ingrese el número de decimales a redondear: ");
        int decimales = scanner.nextInt();
        
        double resultado = redondearDecimal(numero, decimales);
        
        System.out.println("El número redondeado a " + decimales + " decimales es: " + resultado);
        
        scanner.close();
    }
    
    // Función para redondear un número decimal a un número específico de decimales
    public static double redondearDecimal(double numero, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.round(numero * factor) / factor;
    }
}

