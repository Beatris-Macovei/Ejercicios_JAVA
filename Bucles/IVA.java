import java.util.Scanner;
public class IVA{
  public static void main(String[]args){
  Scanner teclado = new Scanner(System.in);
  System.out.println("Inserte el precio sin IVA");
  float precio= teclado.nextFloat();
  float iva=1.21f;
  float descuento=0.05f;
  float resultado=(precio*iva)*descuento;
 
  if (precio<100){
    precio=precio*iva;
    System.out.println("El precio sin descuento y con IVA será:" +precio);
  }
  else {
    precio=precio*iva;
    precio=precio-resultado;
    System.out.println("El precio con descuento y con IVA será:" +precio);
  }
  }
}