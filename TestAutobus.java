public class TestAutobus
{
  public static void main(String[]args)
  {
    Autobus inter = new Autobus();

     System.out.println("Estas son las plazas ocupadas"+plazasOcupadas());
    
     System.out.println("Estas son las plazas libres"+plazasLibres());
     
    inter.personaAsiento();
     System.out.println("Esta es la plaza que has elegido");
     
    inter.subirPersona();
     System.out.println("Esta plaza se ha ocupado");
    
    inter.bajarPersona();
     System.out.println("mdnd");
    
  }
}
