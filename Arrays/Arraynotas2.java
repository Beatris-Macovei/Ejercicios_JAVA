import java.util.Scanner;
public class Arraynotas2{
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
   		if (notas[i]==9) {
      		System.out.println("Enhorabuena, tienes al menos un sobresaliente!!");
	    }
	    int contador=0;
	    for (float nota[]=notas; nota[i]<5;){
	      System.out.println("Tienes:"+nota[i]+"suspensos");
	    {
  	}
}
}

  }
}
