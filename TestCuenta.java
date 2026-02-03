public class TestBanco
{
    public static void main(String []args)
    {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaAhorro cuenta2 = new CuentaAhorro();

        double retirar = cuenta1.retirarSaldo(100);
        System.out.println(retirar);

        

    }
}
