public class TestPersona
{
  public static void main(String[] args)
  {
    Persona usuario = new Persona();
    
    String nombre = usuario.getNombre();
    System.out.println("Nombre usuario:"+" "+usuario.getNombre());
    
    String apellidos = usuario.getApellidos();
    System.out.println("Apellido usuario:"+" "+usuario.getApellidos());
    
    usuario.setTelefono("638714927");
    System.out.println("Telefono usuario:"+" "+usuario.getTelefono());
    
    String direccion = usuario.getDireccion();
    System.out.println("Direccion usuario:"+" "+usuario.getDireccion());
    
    int añoNacimiento = usuario.getAñoNacimiento();
    System.out.println("Año de nacimiento del usuario:"+" "+usuario.getAñoNacimiento());
  }
}
