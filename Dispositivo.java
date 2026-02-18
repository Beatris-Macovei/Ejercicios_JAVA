public class Dispositivo
{
    protected String marca;
    protected double precioBase;

    public Dispositivo(String marca, double precioBase)
    {
        this.marca = marca;
        this.precioBase = precioBase;
    }

    public String toString()
    {
        return "La marca es: "+marca+" "+"y el precio base es: "+precioBase;
    }

    public double calcularPrecioFinal(double iva)
    {
        iva = 1.21;
        precioBase = precioBase * iva;

        return precioBase;
    }

}