public abstract class Vehiculo
{
    private int peso;
    
    public final void setPeso(int p)
    {
        this.peso=p;
    }
    public abstract int getVelocidadActual();
}


//¿Podra tener descendencia esta clase?
//Si puede tener descendencia

//¿Se pueden sobreescribir todos sus metodos?
//Solo se puede sobreescribir el metodo getVelocidadActual(), no setPeso por el fianl

