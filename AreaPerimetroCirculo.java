// Ejercicio 3. Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.

import java.util.Scanner;

public class AreaPerimetroCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
        
        scanner.close();
    }
}
