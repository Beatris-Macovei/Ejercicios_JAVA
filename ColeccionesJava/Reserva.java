//Te proporciona una clase Reserva que representa una reserva de camping con un
//identificador de reserva, el nombre del cliente y el numero de noches

public class Reserva 
{
    private String idReserva;
    private String nombreCliente;
    private int numeroNoches;

    public Reserva(String idReserva, String nombreCliente, int numeroNoches) {
        this.idReserva = idReserva;
        this.nombreCliente = nombreCliente;
        this.numeroNoches = numeroNoches;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    @Override
    public String toString() {
        return "ID Reserva: " + idReserva + ", Cliente: " + nombreCliente + ", Noches: " + numeroNoches;
    }
}
