package ArraysBidimensionales;
import java.util.Random;
public class ArrayMonedas
{
   public static void main(String []args)
    {
        String[][] monedas = new String[2][2];
        Random numRandom = new Random();

        for(int i=0; i<monedas.length; i++)
        {
            for(int j=0; j<monedas[i].length; j++)
            {
                int secreto = numRandom.nextInt(2);
                switch (secreto) 
                {
                    case 0: 
                        monedas[i][j] = "cara";
                        
                        break;
                    case 1: 
                        monedas[i][j] = "cruz";
                        
                        break;   
                }
                
            }
        }

        for (int i=0; i<monedas.length; i++) {
  	        for (int j=0; j<monedas[i].length; j++) 
            {
  		        System.out.print(monedas[i][j]+" ");
  	        }
  	        System.out.println();
        }

    }
}