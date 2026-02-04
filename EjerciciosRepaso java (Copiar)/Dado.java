import java.util.Random;
public class Dado extends Sorteo
{
    public Dado(int posibilidades)
    {
        this.posibilidades = posibilidades;
    }

    public int lanzar()
    {

        Random numRandom = new Random();
        return numRandom.nextInt(1, this.posibilidades);
    }

}