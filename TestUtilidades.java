public class TestUtilidades
{
    public static void main(String []args)
    {
        Utilidades metodo1 = new Utilidades();

        Utilidades metodo2 = new Utilidades();

        Utilidades metodo3 = new Utilidades();
        
        Utilidades metodo4 = new Utilidades();
        
        Utilidades metodo5 = new Utilidades();

        metodo1.mostrarFechaAleatoria();

        metodo2.mostrarFechaActual();
        
        metodo3.dividirParrafo("Deberéis tomar múltiples decisiones de diseño: qué atributos y métodos definir, tipos y nombres adecuados para los mismos…, teniendo siempre en cuenta las buenas prácticas de programación dentro del paradigma de la programación orientada a objetos, que llevamos estudiando desde el principio del curso");

        metodo4.iniciales("Beatris Maria Macovei");

        metodo5.validar("12345678D");

    }
}
