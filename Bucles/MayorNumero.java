import java.util.Scanner;

public class MayorNumero{
  public static void main(String[]args){
  Scanner teclado = new Scanner(System.in);
  
  System.out.println("Dame un numero");
  int numero1= teclado.nextInt();
  System.out.println("Dame otro numero");
  int numero2= teclado.nextInt();
  System.out.println("Dame otro numero");
  int numero3= teclado.nextInt();
  
  if (numero1>=numero2 && numero1>=numero3){
    System.out.println("El numero es:");
    System.out.println(numero1);
    
  }
  else if (numero2>=numero1 && numero2>=numero3) {
    System.out.println("El numero es:");
    System.out.println(numero2);
  }
  else {
    System.out.println("El numero es:");
    System.out.println(numero3);
  }
}
}


