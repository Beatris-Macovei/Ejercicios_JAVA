package Expeciones;
public class HolaMundo
{
    public static void main(String []args)
    {   
            int i=0;
            String vectorS[] = {"Hola mundo1", "Hola mundo2", "Hola mundo3"};

            while (i<4) {
                try
                {
                    System.out.println(vectorS[i]);
                }
                catch (Exception e) 
                {
                    System.out.println("ERROR");
                }
                finally 
                {
                    System.out.println("--------------");
                }
                i++;
            }
    }
}

