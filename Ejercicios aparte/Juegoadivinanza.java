import java.util.Scanner;
import java.util.Random;
public class Juegoadivinanza{
  public static void main(String[]args){
   Scanner teclado = new Scanner(System.in);
   Random random = new Random();
  int adivino=random.nextInt(100);
  int numero;
  
  System.out.println("Intenta adivinar el numero que he pensado del 0 al 99");
  System.out.println("Dime el numero que crees que estoy pensando:");
  
  do {
    numero=teclado.nextInt();
    if (adivino<50 && numero<50){
    
      System.out.println("El numero que he pensado es menor a 50");
      if (adivino>50 && numero<50){
      
        System.out.println("El numero que he pensado es mayor a 50");
        if (adivino>50 && numero>50){
        
          System.out.println("El numero que he pensado es mayor a 50");
          if (adivino>50 && numero<50){
          
          System.out.println("El numero que he pensado es mayor a 50");
            
          
            if (numero<adivino){  
              System.out.println("El numero que he pensado es menor que"+" " +numero);

            }
            else {
              System.out.println("El numero que he pensado es mayor que"+" " +numero);
            }
            
            
    }
      }
        }
          }
  
  } while (numero!=adivino);

  if (numero==adivino){
    System.out.println("Has adivinado el numero!!");
  }
  }
}
