import java.util.Random;
public class Lagrima
{
  private double salinidad=3.2;
  private dobule volumen=0.5;
  private double duracion=3.3;
  private boolean esFelicidad;
  //Constructor
  
  
  //METODOS duracion, volumen, salinidad, esFelicidad
  public boolean esFelicida()
  {
    
    Random es = new Random();
    int secreto = es.nextInt(11);
      if(es<=5)
      {
        esFelicidad = true;
      }
      else
      {
        esFelicidad = false;
      }
    return boolean;
   
    }
  }
}
