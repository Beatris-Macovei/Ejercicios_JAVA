import java.util.Scanner;
public class Comisionista extends Asalariado
{
    private double salarioFijo;
    private int numClientes;
    private double monto;

    public Comisionista(double salarioFijo, int numClientes, double monto)
    {
        this.salarioFijo=750.00;
        this.numClientes=numClientes;
        this.monto=monto;
    }

    public double salarioTotal(double salarioMonto)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos clientes ha captado?");
        numClientes=teclado.nextInt();

        salarioMonto = numClientes*monto;

    }

    

}