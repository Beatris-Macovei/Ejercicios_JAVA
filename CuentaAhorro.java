public class CuentaAhorro extends Cuenta
{
    private double interes;
    private double saldoMin;

    public CuentaAhorro()
    {
        super();
        this.interes=3.0;
        this.saldoMin=250;
    }

    public double retirarSaldo(double retiro)
    {
        double saldo = super.getSaldo();
        if(saldoMin>=retiro)
        {
            saldo = saldo - retiro;
        }
        else
        {
            System.out.println("ERROR: no puedes retirar tanto dinero");
        }
        return saldo;
    }

    public double actualizarSaldo()
    {
        double saldo = super.getSaldo();
        return saldo = saldo * interes;
    }

    public String toString()
    {
        return super.toString() +" "+interes;
    }

    public double cambioInteres()
    {
        double aumento = 2.0;
        return interes = interes + aumento; 
    }

}
