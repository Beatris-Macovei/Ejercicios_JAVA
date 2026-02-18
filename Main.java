public class Main
{
    public static void main(String []args)
    {
        Animal lolo = new Animal();
        Perro bobby = new Perro("Bobby", 5, respuesta);
        Gato luna = new Gato("Luna", 3, respuesta);

        lolo.hacerRuido();
        System.out.println(lolo.toString());

        bobby.hacerRuido();
        System.out.println(bobby.toString());

        luna.hacerRuido();
        System.out.println(luna.toString());

    }
}

//regular