import java.time.LocalDate;
import java.util.Random;
import java.util.StringTokenizer;
public class Utilidades
{

    public void mostrarFechaAleatoria()
    {
        Random random = new Random();
        int año = random.nextInt(2000, 2026);
        int mes = random.nextInt(1, 12);
        int dia = random.nextInt(1, 30);
        LocalDate fecha = LocalDate.of(año, mes, dia);
        System.out.println(fecha.toString());
    }

    public void mostrarFechaActual()
    {
        LocalDate fechaActual();
        System.out.println(fechaActual.toString);
    }

    public String[] dividirParrafo(String parrafo)
    {
        StringTokenizer dividir = new StringTokenizer(parrafo, ".");
        int numTokens = dividir.countTokens();
        String[] resultado = new String[numTokens];
        int i = 0;
        while(dividir.hasMoreTokens())
        {
            resultado[i] = dividir.nextToken();
            i++;
        }
        return resultado;
    }

    public String iniciales(String nombre)
    {

    }

    public boolean validar(String nif)
    {

    }



}
