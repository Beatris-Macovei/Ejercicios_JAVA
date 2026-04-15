//Codificar una clase ListaReservas que gestione una lista dinamica de reservas
//utilizando la clase Reserva

import java.util.ArrayList;

public class ListaReservas 
{
    private ArrayList<Reserva> lista;

    //Constructor
    public ListaReservas()
    {
        lista = new ArrayList<>();
    }

    //1º metodo
    public boolean estaVacia()
    {
        return lista.isEmpty();
    }

    //2º metodo
    public void añadirReserva(Reserva reserva)
    {
        lista.add(reserva);
    }

    //3º metodo
    public Reserva sacarReserva()
    {
        if(estaVacia())
        {
            System.out.println("Vacio");
            return null;
        }
        return lista.remove(0);
    }

    //4º metodo
    public int reservasPorCliente(String cliente)
    {
        int contador = 0;
        for(Reserva r : lista)
        {
            if(r.getNombreCliente().equals(cliente))
            {
                contador++;
            }
            return contador;
        }

        //5º metodo
        
    }
}