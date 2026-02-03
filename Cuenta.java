import java.util.Scanner;
public  abstract class Cuenta
{
    private long numCuenta;
    private double saldo;
    private Persona1 persona;

    public Cuenta()
    {
        persona = new Persona();
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es tu numero de cuenta?");
        numCuenta = sc.nextLong();
        this.saldo=3000;
    }

    public void ingresarSaldo(double ingreso)
    {
        this.saldo = saldo + ingreso;
    }

    public abstract double retirarSaldo(double retiro); 

    public abstract double actualizarSaldo();

    public double getSaldo()
    {
        return saldo;
    }

    public String toString()
    {
        return numCuenta +" "+ saldo +" "+persona;
    }



}
