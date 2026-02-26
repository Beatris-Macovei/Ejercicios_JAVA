public class PersonaFac
{
    private String nombre;
    private String apellido;
    private String dni;
    private String estadoCivil;
    protected PersonaFac(String nombre, String apellido, String dni, String estadoCivil)
    {
        try
        {
            if(nombre == null)
            {
                throw new NullPointerException();
            }
        }
        catch(NullPointerException e)
        {
            this.nombre = "Pepe";
            System.out.println("El nombre esta vacio!! se le va a asginar: " +this.nombre);
        }
        try
        {
            if(apellido == null)
            {
                throw new NullPointerException();
            }
            this.apellido=apellido;
        }
        catch(NullPointerException e)
        {
            this.apellido = "Garcia";
            System.out.println("El apellido esta vacio!! se le va a asginar: " +this.apellido);
        }
        try
        {
            if(dni == null)
            {
                throw new NullPointerException();
            }
            this.dni=dni;
        }
        catch(NullPointerException e)
        {
            this.dni = "52056349S";
            System.out.println("El dni esta vacio!! se le va a asginar: " +this.dni);
        }
        try
        {
            if(estadoCivil == null)
            {
                throw new NullPointerException();
            }
            this.estadoCivil=estadoCivil;
        }
        catch(NullPointerException e)
        {
            this.estadoCivil = "casado";
            System.out.println("El estado civil esta vacio!! se le va a asginar: " +this.estadoCivil);
        }
        
    }
    protected PersonaFac()
    {
        this.nombre="Pepe";
        this.apellido="Garcia";
        this.dni="52056349S";
        this.estadoCivil="casado";
    }
    public String toString()
    {
        return nombre+" "+apellido+" "+dni+" "+estadoCivil;
    }

}

//arithmeticexception   Ocurre cuando hay un error matemático.
//nullpointerexception  Ocurre cuando intentas usar una variable que es null
//intexoutboundsexception   Ocurre cuando intentas acceder a una posición que no existe en un arreglo o lista.
//ioexception   Ocurre cuando hay un error de entrada o salida, por ejemplo:Leer un archivo que no existe, Problemas al guardar datos
//numberformatexception    Ocurre cuando intentas convertir un texto que no es número a número.
//inputmismatchexception    Ocurre cuando el usuario ingresa un tipo de dato incorrecto usando Scanner.
