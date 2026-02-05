import java.util.Scanner;
public class Arraynotas{
  public static void main(String[]args){
  Scanner teclado = new Scanner(System.in);
  
  float[] notas = new float [10];
   
   	for (int i=0; i<10; i++){
   		
   			System.out.println("Nota:");
   			notas [i]= teclado.nextFloat();
   	 	while (notas[i]<=0 || notas[i]>10){
				System.out.println("Ingresa nuevamente");
				notas[i]=teclado.nextInt();
			
   	  	}
    	if (notas[i]<5) {
      		System.out.println("Necesitas estudiar mas");
   	
   		}
	for (; i < notas.length; i++) {
    System.out.println("Índice " + i + ": " + notas[i]);
  }
  }
}

}
