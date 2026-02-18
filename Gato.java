public class Gato extends Animal
{
    public Gato(String nombre, int edad, boolean ruido)
    {
        super(nombre, edad, ruido);
    }

    public boolean hacerSonido()
    {
        boolean maullido = true;
        if(super.ruido.equals(true))
        {
            System.out.println("El gato maúlla: ¡Miau!");
        }
        else
        {
            maullido = false;
            System.out.println("NO SE OYE");
        }
        return maullido;
    }

}