import java.util.Scanner;
public class TestMain
{
    public static void main(String []args)
    {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es la marca del telefono?");
        String marcaIngresada = teclado.next();

        System.out.println("¿Cual es el precio del telefono?");
        double precioBaseIngresado = teclado.next();

        System.out.println("¿Tiene 5G o mas?");
        String respuesta = teclado.next();

        if(respuesta.equals("si"))
        {
            phone.calcularPrecioFinal();
        }
        else
        {
            System.out.println("No hay subida de precio");
        }

        phone.toString();

        Telefono phone = new Telefono(marcaIngresada, precioBaseIngresado, respuesta);

        System.out.println(phone.toString());

    }
}