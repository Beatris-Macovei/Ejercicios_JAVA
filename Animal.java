import java.util.Scanner;
public class Animal 
{
    protected String nombre;
    protected int edad;
    protected boolean ruido;

    public Animal(String nombre, int edad, boolean ruido)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.ruido = ruido;
    }

    public boolean hacerSonido()
    {
        ruido = true;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Oyes ruido? RESPONDE CON SI O NO");
        String respuesta = teclado.next();
        
        if(respuesta.equalsIgnoreCase("si"))
        {
            System.out.println("El animal hace ruido");
        }
        else
        {
            System.out.println("El animal no hace ruido");
        }
        return ruido;
    }

    public String toString()
    {
        return "Este es el nombre: "+nombre+" "+"y tiene: "+edad+" anios";
    }

}