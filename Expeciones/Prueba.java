package Expeciones;
import java.util.*;
public class Prueba
{
    public static void main(String []args)
    {
        Scanner teclado = new Scanner(System.in);
        int num= teclado.nextInt();
        int den = teclado.nextInt(); //podria ser 0

        if(den != 0)
        {
            //este if se ejecuta siempre, muchas veces en vano
            System.out.println(num+"/"+den+"="+(num/den));

        }
        System.out.println("seguimos la ejecucion del programa");
        //aqui mas instrucciones
    }
}