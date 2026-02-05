
import java.util.Scanner;
public class Arrayedades{
   public static void main(String[]args){
   Scanner teclado = new Scanner(System.in);

   	int[] edades = new int [3];
   
   	for (int i=0; i<3; i++){
   		
   			System.out.println("Escribe la edad");
   			edades [i]= teclado.nextInt();
			while (edades[i]<=0 || edades[i]>130){
				System.out.println("Ingresa nuevamente");
				edades[i]=teclado.nextInt();
			
   		}

   	
   	}
	
   	}

}
