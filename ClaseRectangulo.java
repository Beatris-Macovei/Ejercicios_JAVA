public class Rectangulo
{

  //Atributos
  private double largo=5.0;
  private double ancho=3.0;
  private String color="verde";
 
  //Metodos
 
public Rectangulo(double ancho, double largo, String color)
{
 this.largo=largo;
 this.ancho=ancho;
 this.color=color;
 
}
  public double calcularArea()
  {
    double area = largo*ancho;
    return area;
  }
  public double calcularPerimetro()
  {
    double perimetro= (largo*2)+(ancho*2);
    return perimetro;
  }
  public void setColor(String c)
  {
    color=c;
  }
  public String getColor()
  {
    return color;
  }
  public void doblar()
  {
    this.ancho = this.ancho*2;
    this.largo = this.largo*2;
  }
 
  public Rectangulo rectanguloDoble()
  {
    Rectangulo nuevo = new Rectangulo(this.ancho, this.largo, this.color);
    nuevo.doblar();
    return nuevo;
  }
}


