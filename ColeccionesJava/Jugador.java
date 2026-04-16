package COLECCIONES;
public class Jugador
{
    private String nombre;
    private int dorsal;

    public Jugador(String nombre, int dorsal)
    {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public String getNombreJugador()
    {
        return nombre;
    }

    public int getDorsal()
    {
        return dorsal;
    }

    public boolean comprobar(Jugador j)
    {
        boolean comp=true;
        if(nombre.equals(j))
        {
            return comp;
        } 
        else
        {
            return false;
        }
    }

    
}
