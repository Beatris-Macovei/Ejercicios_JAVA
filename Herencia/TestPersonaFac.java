public class TestPersonaFac
{
    public static void main(String[] args)
    {
        Profesor prof = new Profesor("Ana", "Sánchez", "12345678A", "Soltera", "Sistemas", 2018, 5);
        System.out.println(prof.toString());
        PersonalServicio serv = new PersonalServicio();
        System.out.println(serv.toString());
        Alumno alu = new Alumno("Luis", "Gómez", "99988877Z", "Soltero", "3º Grado");
        System.out.println(alu.toString());
    }
}