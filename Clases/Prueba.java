
public class Fraccion
{
	private int numerador;
	private int denominador;
	private String nombre;

	public Fraccion(int num, int den, String nom)
	{
		numerador = num;
		denominador = den;
		nombre = nom;
	}	


	

	public double valorDecimal()
	{
		return (double) numerador/denominador;
	}

	// La fracción original no va cambiar
      public Fraccion multiplicar(int multiplicador)
      {
	int numTercera = numerador * multiplicador;
	Fraccion tercera = new Fraccion(numTercera, denominador, "Tercera en discordia");
	return tercera;
      }
	
	// La fracción original cambia
	public void multiplicateTuMisma(int multiplicador)
	{
		numerador = numerador*multiplicador;
	}
	
	public Fraccion sumar(Fraccion laOtra)
	{
		return null;
	}

	public String toString()
	{
		return nombre +": "+numerador + "/" + denominador;
	}

}
