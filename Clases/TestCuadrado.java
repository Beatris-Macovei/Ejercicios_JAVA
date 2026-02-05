public class TestCuadrado {
  public static void main(String[]args) {
  Cuadrado santiago = new Cuadrado();
  Cuadrado yuca = new Cuadrado();
  Circulo felipe = new Circulo();
  
  
  double peri = santiago.calcularPerimetro();
    System.out.println("Este es el perimetro del cuadrado1:"+peri);
    System.out.println("Este es el perimetro del cuadrado2:" +yuca.CalcularArea());

    double are = santiago.calcularArea();
      System.out.println("Este es el area del cuadrado1:"+are);
      System.out.println("Este es el area del cuadrado2:" +yuca.CalcularPerimetro());
  
      System.out.println("Este es el color del cuadrado1:"+santiago.getColor());
      System.out.println("Este es el color del cuadrado2:"+yuca.getColor());
    
    double longitud = felipe.longitudCircunferencia();
      System.out.println("Esta es la longitud del circulo1:"+longitud);
      System.out.println("Este es el color del circulo1:"+felipe.getColor());
    
    yuca.setLado(7);
  
    double perim=yuca.CalcularArea();
      System.out.println("Este es el nuevo perimetro del cuadrado2:"+yuca.CalcularPerimetro());
    yuca.setLado(8);
      System.out.println(yuca.calcularArea());
    
    
  }
}
