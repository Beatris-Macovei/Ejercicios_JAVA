import java.util.Scanner;

public class PagaEdad {
  public static void main(String[]args) {
  
  Scanner nombre = new Scanner(System.in);

  System.out.println("Dame tu nombre:");
  String n= nombre.nextLine();
  
  Scanner teclado = new Scanner(System.in);

  System.out.println("Dame tu edad:");
  int a= teclado.nextInt();

  int pagaMayor=12;
  int pagaMenor=5;

    if (a>17){
    
    System.out.println(n+" "+"con"+" "+a+" "+"años"+" "+"se le pagara"+" "+pagaMayor);
  }
    else{
      System.out.println(n+" "+"con"+" "+a+" "+"años"+" "+"se le pagara"+" "+pagaMenor);
    }
    
  }
}
    
    


