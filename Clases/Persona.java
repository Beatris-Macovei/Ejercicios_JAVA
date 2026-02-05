import java.util.Scanner;
import java.util.Random;

public class Persona
{
	private String nombre;
	private String apellidos;
	private String telefono;
	private String dni;
	private String direccion;
	

	/*public Persona()
	{
		String[] datos = {"Nombre", "Apellidos", "Teléfono", "DNI","Dirección"};
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<datos.length; i++)
		{
			System.out.print(datos[i]+": ");
			datos[i]=sc.next();
		}
		sc.close();
		this.nombre=datos[0];
		this.apellidos=datos[1];
		this.telefono=datos[2];
		this.dni=datos[3];
		this.direccion=datos[4];

		
	}*/

	public Persona()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre: ");
		this.nombre=sc.next();
		System.out.print("Apellidos: ");
		this.apellidos=sc.next();
		System.out.print("Telefono: ");
		this.telefono=sc.next();
		System.out.print("Dni: ");
		this.dni=sc.next();
		System.out.print("Dirección: ");
		this.direccion=sc.next();
		

		
	}


        public Persona(String nombre, String dni)
	{
		this.nombre = nombre;
		this.dni = dni;
		this.apellidos = "";
		this.telefono = "";
		this.direccion = "";
	}

	public Persona(String nombre, String apellidos, String tel, String dni, String direc)
	{
		//usar this para diferenciar atributo de parámetro
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = tel;
		this.dni = dni;
		this.direccion = direc;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nuevoNombre)
	{
		this.nombre = nuevoNombre;
	}
	
	public void adivina()
	{
		Random generadorAleatorio = new Random();
		int secreto = generadorAleatorio.nextInt(10)+1;
		int numero = 0;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("A cuántos intentos quieres jugar? ");
		int intentos = sc.nextInt();
		do
		{
			System.out.print("Numero? ");
			numero = sc.nextInt();
			contador++;
			
		}while(numero != secreto && contador < intentos);
		System.out.println("Has hecho "+ contador + " intentos");
		if(contador == intentos)
		{
			System.out.println("El número secreto era: "+secreto);
		}
		
		
	}
}







