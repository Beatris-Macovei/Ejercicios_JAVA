package ArraysBidimensionales;
import java.util.Random;
public class ArrayMatriz3
{
    public static void main(String []args)
    {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizSuma = new int[2][2];

        Random numRandom = new Random();

        for(int i=0; i<matriz1.length;i++)
        {
            for(int j=0; j<matriz1[i].length;j++)
            {
                int num = numRandom.nextInt(10);
                matriz1[i][j] = num;
            }
        }

        for(int i=0; i<matriz2.length;i++)
        {
            for(int j=0; j<matriz2[i].length;j++)
            {
                int num = numRandom.nextInt(10);
                matriz2[i][j] = num;
            }
        }

        for(int i=0; i<matrizSuma.length;i++)
        {
            for(int j=0; j<matrizSuma[i].length;j++)
            {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        //imprimir
        
        for (int i=0; i<matriz1.length; i++) {
  	        for (int j=0; j<matriz1[i].length; j++) 
            {
  		        System.out.print(matriz1[i][j]+" ");
                System.out.print(matriz2[i][j]+" ");
                System.out.print("Suma de las matrices:" +matrizSuma[i][j]+" ");
  	        }
  	        System.out.println();
        }
        
    }
}