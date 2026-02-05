
public class Circulo {
  private double radio=2.0;
  private String color="Rojo";
  
  public double longitudCircunferencia() {
    final double PI=3.14;
    double circunf=2*PI*radio;
    return circunf;
  }
  public void setColor(String c) {
    color=c;
  }
  public String getColor() {
    return color;
  }
    
}
