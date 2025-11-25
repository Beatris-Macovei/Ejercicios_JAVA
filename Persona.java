//titular-> nombre, apellidos, telefono, DNI, direccion, fecha_nac
import java.util.Scanner;
public class Persona
{
  private String nombre;
  private String apellidos;
  private String telefono;
  private String dni;
  private String direccion;
  private int fechaNacimiento;
  
  
  public Persona()
  {
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.telefono=telefono;
    this.dni=dni;
    this.direccion=direccion;
    this.fechaNacimiento=fechaNacimiento;
  }
  
  public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
	  Scanner teclado = new Scanner(System.in);
	  nombre= teclado.next();
	  System.out.println("Dime tu nombre");
		this.nombre = nombre;
		
	}
	public String getApellidos()
	{
		return apellidos;
	}

	public void setApellidos(String apellidos)
	{
	  Scanner teclado = new Scanner(System.in);
	  apellidos= teclado.next();
	   System.out.println("Dime tu apellido");
		this.apellidos = apellidos;
	}
	public String getTelefono()
	{
		return telefono;
	}

	public void setTelefono(String telefono)
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
	  direccion= teclado.next();
	   System.out.println("Dime tu direccion");
		this.direccion = direccion;
	}
	public int getAñoNacimiento()
	{
		return fechaNacimiento;
	}

	public void setAñoNacimiento(int fechaNacimiento)
	{
	  Scanner teclado = new Scanner(System.in);
	  fechaNacimiento= teclado.nextInt();
	   System.out.println("Dime tu año de nacimiento");
		this.fechaNacimiento = fechaNacimiento;
	}
}
