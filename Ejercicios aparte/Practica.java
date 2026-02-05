import java.util.Scanner;
public class Practica
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un dia de la semana");
        String dia = teclado.next();
        

        switch (dia) {
            case lunes: System.out.println("Dia laborable");
                break;
        
            case martes: System.out.println("Dia laborable");
                break;

            case miercoles: System.out.println("Dia laborable");
                break;

            case jueves: System.out.println("Dia laborable");
                break;

            case viernes: System.out.println("Dia laborable");
                break;

            case sabado: System.out.println("Dia no laborable");
                break;

            case domingo: System.out.println("Dia no laborable");
                break;
        }
    }
}
