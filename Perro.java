public class Perro extends Animal
{
    public Perro(String nombre, int edad, boolean ruido)
    {
        super(nombre, edad, ruido);
    }

    public boolean hacerSonido()
    {
        boolean ladrido = true;
        if(super.ruido.equals(true))
        {
            System.out.println("El perro ladra: ¡Guau! ¡Guau!");
        }
        else
        {
            ladrido = false;
            System.out.println("NO SE OYE!!");
        }
        return ladrido;
    }

}