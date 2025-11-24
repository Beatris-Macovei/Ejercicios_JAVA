package Ejercicioss;
import java.util.Scanner;

public class PagaEdad {
  public static void main(String[]args) {
  Scanner teclado = new Scanner(System.in);
    System.out.println("Dame una edad");

  int a= teclado.nextInt();
  int pagaMayor=12;
  int pagaMenor=5;
  
    if (a>17){
   
    System.out.println(a+" "+"se le pagara"+" "+pagaMayor);
  }
    else{
      System.out.println(a+" "+"se le pagara"+" "+pagaMenor);
    }
   
  }
}