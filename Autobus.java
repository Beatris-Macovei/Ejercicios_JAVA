import java.util.Scanner;
public class Autobus
{
  //Atributos
  private Persona[] autobus;
  //Constructor
  public Autobus()
  {
    Scanner teclado=new Scanner(System.in);
    System.out.println("Dime cuantas plazas tiene el autobus");
    int plazas = teclado.nextInt();
    autobus = new Persona[plazas];
  }
  //Metodos
  //recorre el array y va ocupando las plazas
  public int plazasOcupadas()
  {
    int contador=0;
    for(int i=0; i<autobus.length; i++)
    {
      if(autobus[i]!=null)
      {
        contador++;
      }
    }
    return contador;
  }
  //dice cuantas plazas hay libres
  public int plazasLibres()
  {
    return autobus.length - this.plazasOcupadas();
  }
  public Persona personaAsiento()
  {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Dime el numero de plaza que quieres ver");
    int numeroPlaza = teclado.nextInt();
    Persona pasajero = null;
      if(numeroPlaza>=0 && numeroPlaza < autobus.length)
      {
        return pasajero;
      }
    return autobus[numeroPlaza];
  }
  //sube a una persona si no esta la plaza ocupada
  public boolean subirPersona(Persona pedrito)
  {
    boolean ocupado = false;
    //recorre el array mientras sea i<al nºplazas que ponga el usuario y cuando no esté ocupado
    for(int i=0; i<autobus.length && !ocupado; i++)
    {
      if(autobus[i]==null)
      {
        autobus[i] = pedrito;
        ocupado = true;
      }
    }
    return ocupado;
  }
  public Persona bajarPersona(int plaza)
  {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Dime la plaza que quieres dejar libre");
    int dejarPlaza = teclado.nextInt();
      for(int i=0; i<autobus.length; i++)
      {
        if(autobus[i]==null)
        {
          return autobus[i];
        }
        else
        {
           System.out.println("Esta plaza esta ocupada");
        }
      }
    return autobus[dejarPlaza]
  }
    
}
