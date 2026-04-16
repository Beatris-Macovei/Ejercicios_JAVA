import java.util.HashSet;

public class Equipo
{
    private String nombreEquipo;
    private HashSet<Jugador> team;

    public Equipo(String nombreEquipo)
    {
        this.nombreEquipo = nombreEquipo;
        this.team = new HashSet<>();
    }

    //insertar jugador
    public void insertarJugador(Jugador jugador)
    {
        team.add(jugador);
    }

    //poner nombre al equipo
    public void setNombre()
    {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombre()
    {
        return nombreEquipo;
    }

    

}







