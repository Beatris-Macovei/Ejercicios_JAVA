import java.util.Scanner;
public class arrayAltura {
	public static void main(String[]args) {
		Scanner teclado=new Scanner(System.in);
		Float[] altura=new Float[15];
		double suma=0;
		
		for(int i=0; i<altura.length; i++) {
		  System.out.println("Dime la altura");
		  altura[i]=teclado.nextFloat();
		  suma=suma+altura[i];
		}
		suma=suma/altura.length;
		System.out.println("La media es:"+suma);
	}
}
