public class Profesor extends EmpleadoFac
{
    private String departamento;

    public Profesor(String nombre, String apellido, String dni, String estadoCivil, String departamento, int añoIncor, int numeroDespa)
    {
        super(nombre, apellido, dni, estadoCivil, departamento, añoIncor, numeroDespa);
        try
        {
            if(departamento == null)
            {
                throw new NullPointerException();
            }
            this.departamento = departamento;
        }
        catch(NullPointerException e)
        {
            this.departamento = "Informatica";
            System.out.println("El departamento esta vacio!! se le va a asginar: " +this.departamento);
        }
    }

    public Profesor()
    {
        super();
        this.departamento = "Informatica";
    }
    public String toString()
    {
        return super.toString() + " Departamento: " + departamento;
    }
}
