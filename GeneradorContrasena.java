// Ejercicio 18: Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.
import java.util.Random;

public class GeneradorContrasena {
    public static void main(String[] args) {
        String contrasena = generarContrasena();
        System.out.println("Contraseña generada: " + contrasena);
    }
    
    public static String generarContrasena() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrasena = new StringBuilder();
        Random random = new Random();
        
        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(indice);
            contrasena.append(caracter);
        }
        
        return contrasena.toString();
    }
}

