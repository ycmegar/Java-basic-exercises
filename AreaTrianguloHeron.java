// Ejercicio 11: Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.
import java.util.Scanner;

public class AreaTrianguloHeron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();
        
        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();
        
        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();
        
        // Calculamos el semiperímetro
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        
        // Calculamos el área utilizando la fórmula de Herón
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        
        System.out.println("El área del triángulo es: " + area);
        
        scanner.close();
    }
}

