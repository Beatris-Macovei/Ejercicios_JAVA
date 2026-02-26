public class Alumno extends PersonaFac
{
    protected String curso;

    public Alumno(String nombre, String apellido, String dni, String estadoCivil, String curso)
    {
        super(nombre, apellido, dni, estadoCivil);
        try
        {
            if(curso == null)
            {
                throw new NullPointerException();
            }
            this.curso=curso;
        }
        catch(NullPointerException e)
        {
            this.curso = "1 Carrera";
            System.out.println("El estado civil esta vacio!! se le va a asginar: " +this.curso);
        }
    }
    public Alumno()
    {
        super();
        this.curso="1 Carrera";
    }
    public String toString()
    {
        return super.toString()+" "+curso;
    }
}
