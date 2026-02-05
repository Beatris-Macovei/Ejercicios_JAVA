public class TestRectangulo
{
  public static void main(String[] args)
  {
    Rectangulo manolo = new Rectangulo(3.0, 5.0, "verde");
    
   
    
    double area = manolo.calcularArea();
    System.out.println("El area del rectangulo es:" +area);
    
    double perimetro = manolo.calcularPerimetro();
    System.out.println("El perimetro del rectangulo es:" +perimetro);
    
    System.out.println("El color del rectangulo es:" +manolo.getColor());
    
    Rectangulo nuevo = manolo.rectanguloDoble();
    System.out.println("Este es el doble del rectangulo:"+nuevo);
  }
}
    
