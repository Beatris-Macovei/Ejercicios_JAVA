public class Base
{
    public Base(b1, b2, b3)
    {
        this.bPublic = b1;
        this.bProtegido = b2;
        this.bPrivado = b3;
    }

}

public class Derivada extends Base
{
    public Derivada(int b1, int b2, int b3, int d1, int d2)
    {
        super(b1, b2, b3);
        this.dPublico = d1;
        this.dPrivado = d2;
    }
}