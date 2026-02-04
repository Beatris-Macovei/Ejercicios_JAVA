import java.util.Random;

public class Moneda extends Sorteo
{
    public Moneda()
    {
        super();
    }

    public int lanzar()
    {
        Random numRandom = new Random();
        int secreto = numRandom.nextInt(0,1);

        if(secreto==0)
        {
            System.out.println("Salio cara!");
        }
        else
        {
            System.out.println("Salio cruz!!");
        }

        return secreto;

    }

}