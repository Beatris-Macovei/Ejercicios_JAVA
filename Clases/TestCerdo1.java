public class TestCerdo
{
	public static void main(String[] args)
	{
		Cerdo peppa = new Cerdo();
		Cerdo porky = new Cerdo();
		Cerdo george = new Cerdo();
		
		peppa.saludar();
		int resultado = porky.sumar(7, 2);
		System.out.println("Porky dice que el resultado es: "+ resultado);
		System.out.println(porky.sumar(17, 2));
		george.saludar();
		
	    Cerdo spiderHam = new Cerdo("Dibujo", true);
		String raza = peppa.getRaza();
		System.out.println(raza);
		peppa.setRaza("Dibujo");
		System.out.println(peppa.getRaza());
		
	}
}
