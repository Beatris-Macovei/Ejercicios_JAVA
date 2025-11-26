//titular-> nombre, apellidos, telefono, DNI, direccion, fecha_nac
import java.util.Scanner;
public class Persona
{
  private String nombre;
  private String apellidos;
  private int telefono;
  private String dni;
  private String direccion;
  private int fechaNacimiento;
  
  
  public Persona()
  {
    Scanner teclado = new Scanner(System.in);
    this.nombre=teclado.next();
    this.apellidos=teclado.next();
    this.telefono=telefono;
    this.dni=dni;
    this.direccion=teclado.next();
    this.fechaNacimiento=teclado.nextInt();
   
  }

  public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
	  Scanner teclado = new Scanner(System.in);
	  System.out.println("Dime tu nombre");
	  nombre= teclado.next();
		this.nombre = nombre;
		
	}
	public String getApellidos()
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
	  Scanner teclado = new Scanner(System.in);
	  System.out.println("Dime tu apellido");
	  apellidos= teclado.next();
		this.apellidos = apellidos;
	}
	public int getTelefono()
	{
		return telefono;
	}

	public void setTelefono(int telefono)
	{	  
		this.telefono = telefono;
	}
	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
	
		this.dni = dni;
	}
	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
	  Scanner teclado = new Scanner(System.in);
	  System.out.println("Dime tu direccion");
	  direccion= teclado.next();
		this.direccion = direccion;
	}
	public int getAñoNacimiento()
	{
		return fechaNacimiento;
	}

	public void setAñoNacimiento(int fechaNacimiento)
	{
	  Scanner teclado = new Scanner(System.in);
	  System.out.println("Dime tu año de nacimiento");
	  fechaNacimiento= teclado.nextInt();
		this.fechaNacimiento = fechaNacimiento;
	}
}
