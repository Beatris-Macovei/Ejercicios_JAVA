public class CuentaCorriente extends Cuenta
{
    private final double INTERES=0.15;

    public CuentaCorriente()
    {
        super();  
    }

    public double retirarSaldo(double retiro)
    {
        double saldo = super.getSaldo();
        return saldo = saldo - retiro; 
    }

    public double actualizarSaldo()
    {
        double saldo = super.getSaldo();
        return saldo = saldo * INTERES;
    }

    public String toString()
    {
        return super.toString() +" "+INTERES;
    }


}
