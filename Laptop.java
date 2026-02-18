public class Laptop extends Dispositivo
{
    private int memoriaRam;

    public Laptop(String marca, double precioBase, int memoriaRam)
    {
        super(marca, precioBase);
        this.memoriaRam = memoriaRam;
    }

    public String toString()
    {
        return super.toString+" "+"Tiene: "+memoriaRam+" "+"de memoria RAM"
    }

     public double calcularPrecioFinal(double porcentaje)
     {
        porcentaje = 10;
        double subida = porcentaje / 100;
        if(memoriaRam > 16)
        {
            double resultado = precioBase * subida;
            precioBase = precioBase + resultado;
        }
        return precioBase
     }
    

}