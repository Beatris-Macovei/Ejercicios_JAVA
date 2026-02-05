import java.util.Scanner;
public class DiasLaborables{
  public static void main(String[]args){
  Scanner teclado = new Scanner(System.in);
  System.out.println("Inserte un dia de la semana:");

  String dia=teclado.nextLine();
  String notatextual="Lunes";

  switch (dia){
    case "Lunes": notatextual="Laboral";
        System.out.println("El dia Lunes es Laboral");
            break;
        
    case "Martes": notatextual="Laboral";
        System.out.println("El dia Martes es Laboral");
        break;
        
    case "Miercoles": notatextual="Laboral";
        System.out.println("El dia Miercoles es Laboral");
        break;
        
    case "Jueves": notatextual="Laboral";
        System.out.println("El dia Jueves es Laboral");
        break;
        
    case "Viernes": notatextual="Laboral";
        System.out.println("El dia Viernes es Laboral");
        break;

     default: notatextual="No laboral";   
        
  }
  }
}
