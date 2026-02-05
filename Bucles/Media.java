import java.util.Scanner;
public class Media {
    
  public double media10() {
    
    double suma=0;
    double media=0;
    Scanner teclado = new Scanner(System.in);
    int contador =0;
    
    for (int i=0; i<10; i++) {
      System.out.println("Dame un numero");
      double nuevoNum = teclado.nextDouble();
      suma=suma+nuevoNum;
    }
    return suma/10;
  }
    do {
        System.out.println("Dame un numero");
        
        
        if(nuevoNum !=-1) {
        suma= suma+nuevoNum;
        contador++;
        }
    }while (nuevoNum != -1);
      return suma/contador;

}

    

