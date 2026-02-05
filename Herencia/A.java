public class A
{
    private static int clase=0;

    private static int contador=0;

    private int instancia1;
    private int instancia2;

    public A(int instancia1, int instancia2)
    {
        this.instancia1=instancia1;
        this.instancia2=instancia2;
        contador++;
    }

    public int sumaObjetos()
    {
        return contador;
    }

}