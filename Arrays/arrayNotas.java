import java.util.Scanner;
public class arrayNotas {
  public static void main(String[] args) {
  Scanner teclado= new Scanner(System.in);
  Float[] notas= new Float[10];
  
  for(int i=0; i<10; i++) {
    System.out.println("Dime la nota");
    notas[i] = teclado.nextFloat();
    if(notas[i]<5) {
      System.out.println("Necesitas estudiar mas");
    }
    if(notas[i]>=9) {
      System.out.println("Enhorabuena, tienes al menos un aprobado");
    }    
  } 
  for(int i=0; i<notas.length; i++) {
   
      System.out.println(notas[i]);
    
  }
  }
}
