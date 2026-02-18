public class Telefono extends Dispositivo
{
    private boolean tiene5G;

    public Telefono(String marca, double precioBase, boolean tiene5G)
    {
        super(marca, precioBase);
        this.tiene5G = tiene5G;
    }

    public double calcularPrecioFinal()
    {
        if(tiene5G.equals("si"))
        {
            precioBase = precioBase + 50;
        }
        return precioBase;
    }

}