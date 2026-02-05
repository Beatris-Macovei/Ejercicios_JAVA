//dinero ingresado (suma), nombre, numero cuenta, dinero total, dinero gastado

import java.util.Scanner;
public class CuentaBancaria
{
  private Persona titular;
  private double saldo=0.0;
  private double ingreso;
  private boolean retiro;
  private double sacar;
  private Persona[] autorizadas = new Persona[2];
  
  
  public CuentaBancaria()
  {
    this.titular=titular;
    this.saldo=saldo;
    this.ingreso=ingreso;
    this.retiro=retiro;
  }
  
  public Persona tarjetaTitular()
  {
    return titular;
  }
  public double salarioCuenta()
  {
    return saldo;
  }
  public double ingresoCuenta()
  {
    Scanner teclado = new Scanner(System.in);
    System.out.println("¿Cuanto dinero quieres ingresar?");
    ingreso = teclado.nextDouble();
    this.ingreso=ingreso;
    if(ingreso<0)
    {
      System.out.println("Error, no puedes ingresar menos de 0 euros");
    }else 
    {
      saldo=ingreso+saldo;
    }
    return ingreso;
  }
  public boolean retiroCuenta()
  {
    
    Scanner teclado = new Scanner(System.in);    
    System.out.println("¿Cuanto dinero quiere retirar?");
    sacar=teclado.nextDouble();
    boolean retiro = sacar<=this.saldo;
    if(retiro)
    {
      saldo=saldo-sacar;
    }else
    {
      System.out.println("Error, no puedes retirar mas dinero del que tienes");
    }
    return retiro;
  }
  public double getSaldo()
  {
    return saldo;
  }
  public boolean añadirAutorizado()
  {
    boolean hePodido=false;
    for(int i=0; i<autorizadas.length && hePodido==false; i++)
    {
      if(autorizadas[i]==null)
      {
        autorizadas[i]=new Persona();
        hePodido=true;
      }
    }
    return hePodido;
  }
    
}

  
  
