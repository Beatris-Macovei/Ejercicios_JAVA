//CAMBIAR
import java.util.Scanner;
public class RepasoArray
{
	public static void main(String[]args)
	{

		char[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int numero;
		int Guardar[] dentro = new Guardar[8];
		
		for(int i=0; i<8; i++)
		{
		  
		  Scanner teclado=new Scanner(System.in);
		  System.out.println("Dime numero de DNI");
		  do{
		    numero=teclado.nextInt();
		  }while(numero==0); 
		  
		  guardar[i]=numero;
		  
		}
		System.out.print("Numeros introducidos: ");
		for(int i=0; i<8; i++)
		{
		    System.out.print(dentro[i]);
		}
		
		int dniNumero;
		
		
		for(int i=0; i<8; i++)
		{
		  dniNumero = dniNumero * 10 + dentro[i];
		}
    
    int resto = dniNumero % 23;
    String letra = letras[resto];
    
    System.out.println("DNI completo: " + dniNumero + letra);
    
	}
}
