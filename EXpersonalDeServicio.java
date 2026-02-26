public class PersonalServicio extends EmpleadoFac
{
    private String seccion;

    public PersonalServicio(String nombre, String apellido, String dni, String estadoCivil, String seccion, int añoIncor, int numeroDespa)
    {
        super(nombre, apellido, dni, estadoCivil, seccion, añoIncor, numeroDespa);

        try
        {
            if(seccion == null)
            {
                throw new NullPointerException();
            }
            this.seccion = seccion;
        }
        catch(NullPointerException e)
        {
            this.seccion = "Limpieza";
            System.out.println("El seccion esta vacio!! se le va a asginar: " +this.seccion);
        }
    }

    public PersonalServicio()
    {
        super();
        this.seccion = "Limpieza";
    }
    public String toString()
    {
        return super.toString() + " Sección: " + seccion;
    }
}
