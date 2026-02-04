public class TestDado
{
    public static void main(String[]args)
    {
        Dado dadito = new Dado(6);
        Moneda monedita = new Moneda();

        dadito.lanzar();

        monedita.lanzar();

    }
}