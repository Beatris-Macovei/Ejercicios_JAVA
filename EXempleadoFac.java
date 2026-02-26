public class EmpleadoFac extends PersonaFac
{
    private int añoIncor;
    private int numeroDespa;

    public EmpleadoFac(String nombre, String apellido, String dni, String estadoCivil, String departamento, int añoIncor, int numeroDespa)
    {
        super(nombre, apellido, dni, estadoCivil);
        
        this.añoIncor = añoIncor;
        this.numeroDespa = numeroDespa;
    }

    public EmpleadoFac()
    {
        super();
        this.añoIncor = 2;
        this.numeroDespa = 134;
    }

    public String toString()
    {
        return super.toString() + " Año: " + añoIncor + " Despacho: " + numeroDespa;
    }
}
