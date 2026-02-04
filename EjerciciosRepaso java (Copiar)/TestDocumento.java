public class TestDocumento
{
    public static void main(String []args)
    {
        Documento elQuijote = new Documento();
        Documento nemesis = new Documento("Nemesis", "Isaac Asimov");
        elQuijote.setTitulo("El Quijote");
        elQuijote.setAutor("Miguel de Cervantes");

        System.out.println("El autor de" +elQuijote.getTitulo() +" es "+elQuijote.getAutor());
        System.out.println("El autor de "+nemesis.getTitulo()+ "es "+nemesis.getAutor());

        System.out.println("Ahora voy a hacer que la referencia que tenia al Quijote apunte al otro libro, observa...");
        elQuijote=nemesis;
        System.out.println("Ahora voy a preguntar por la nformacion del Quijote, pero ahora la variable elQuijote esta apuntado a nemesis");
        System.out.println("El autor de" +elQuijote.getTitulo()+" es "+elQuijote.getAutor());
        System.out.println("Ahora voy a preguntar por la informacion de Nemesis, que ahora es accesibloe mediante dos referencias, mientras a la iformacion del Quijote ya nadie la apunta y sera eliminada por partes del garbage collector");

        System.out.println("El autor de" + nemesis.getTitulo()+" es "+nemesis.getAutor());
    }
}