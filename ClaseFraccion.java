import java.util.Scanner;
public class Fraccion
{
private int numerador;
private int denominador;
private String nombre;
private int sumar;
private int numer;
private int denomin;
private Scanner teclado = new Scanner(System.in);

public Fraccion()
{
 
numerador = 1;
denominador = 1;

}

public Fraccion(int num, int den, String nom)
{
 
numerador = num;
denominador = den;
nombre = nom;

}


public double valorDecimal()
{
 System.out.println("Dame un numerador");
 numerador = teclado.nextInt();
 System.out.println("Dame un denominador");
 denominador = teclado.nextInt();
return (double) numerador/denominador;
}

public Fraccion escalarFreaccion(int esc)
{
 System.out.println("Dame un factor de escala");
 esc = teclado.nextInt();
 
}
 
  public Fraccion multiplicar(int multiplicador)
  {
   int numTercera = numerador * multiplicador;
   Fraccion tercera = new Fraccion(numTercera, denominador, "Tercera en discordia");
   return tercera;
  }

public void multiplicateTuMisma(int multiplicador)
{
 numerador = numerador*multiplicador;
}
 
public Fraccion sumar(Fraccion laOtra)
{
 int d = this.denominador * laOtra.denominador;
 int n = this.numerador * laOtra.denominador + this.denominador * laOtra.numerador;
 return new Fraccion (n,d, "Fraccion suma");
}

public String toString()
{
 return nombre +": "+numerador + "/" + denominador;
}
 

}

