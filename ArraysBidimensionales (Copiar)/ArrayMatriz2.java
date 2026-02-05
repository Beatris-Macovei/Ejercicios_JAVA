package ArraysBidimensionales;
import java.util.Random;
import java.util.Scanner;
public class ArrayMatriz2
{
    public static void main(String []args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero de columnas");
        int n = teclado.nextInt();
        int[][] numeros = new int[5][n];

        Random numRandom = new Random();

        for(int i=0; i<numeros.length;i++)
        {
            for(int j=0; j<numeros[i].length;j++)
            {
                int num = numRandom.nextInt(10);
                numeros[i][j] = num;
            }
        }

        for (int i=0; i<numeros.length; i++) {
  	        for (int j=0; j<numeros[i].length; j++) 
            {
  		        System.out.print(numeros[i][j]+" ");
  	        }
  	        System.out.println();
        }

    }

}