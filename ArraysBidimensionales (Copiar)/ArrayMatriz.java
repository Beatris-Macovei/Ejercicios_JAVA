package ArraysBidimensionales;
public class ArrayMatriz
{
    public static void main(String []args)
    {
        int[][] matriz = new int[5][4];
        int contador=1;

        for(int i=0; i<matriz.length; i++)
        {
            for(int j=0; j<matriz[i].length; j++)
            {
                matriz[i][j]=contador++;

            }
        }
        for (int i=0; i<matriz.length; i++) {
  	        for (int j=0; j<matriz[i].length; j++) 
            {
  		        System.out.print(matriz[i][j]+" ");
  	        }
  	        System.out.println();
        }

    }
}