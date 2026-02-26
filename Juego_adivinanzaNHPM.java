import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinanza {

    public static void main(String[] args) {
        // Herramientas iniciales
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        
        // Configuración del juego
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        int intentos = 0;
        int suposicion = 0;
        boolean haGanado = false;

        System.out.println("¡Bienvenido al Desafío Numérico!");
        System.out.println("He pensado un número entre 1 y 100. ¿Puedes adivinarlo?");

        // Bucle principal del juego
        while (!haGanado) {
            System.out.print("Introduce tu número: ");
            
            // Validar que el usuario ingrese un número
            if (lector.hasNextInt()) {
                suposicion = lector.nextInt();
                intentos++;

                if (suposicion < 1 || suposicion > 100) {
                    System.out.println("Por favor, mantente entre 1 y 100.");
                } else if (suposicion < numeroSecreto) {
                    System.out.println("Demasiado bajo. ¡Intenta otra vez!");
                } else if (suposicion > numeroSecreto) {
                    System.out.println("Demasiado alto. ¡Prueba de nuevo!");
                } else {
                    haGanado = true;
                    System.out.println("\n¡FELICIDADES! 🎉");
                    System.out.println("Has adivinado el número " + numeroSecreto + " en " + intentos + " intentos.");
                }
            } else {
                System.out.println("Eso no es un número válido. Inténtalo de nuevo.");
                lector.next(); // Limpiar la entrada incorrecta
            }
        }

        lector.close();
    }
}
