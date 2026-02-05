import java.util.Scanner;


public class Multiplos3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x=3;
        int numeroSuerte= teclado.nextInt();       

        while(numeroSuerte <=0){
          System.out.println("Numero todo triste repite: ");
          numeroSuerte= teclado.nextInt();
        }

        for (int i=1; i<= 10; i++){
          System.out.println(x*i);
 
        }


    }
    
}
