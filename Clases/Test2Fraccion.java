public class Test2Fraccion
{
	public static void main(String[] args)
	{
	  System.out.println("Dame un numerador");
	  numerador= teclado.nextInt();
	  System.out.println("Dame un denominador");
	  numerador= teclado.nextInt();
		Fraccion pepita;
		pepita = new Fraccion("Pepita");
		
		System.out.println("Pepita= "+pepita.toString());
		
		Fraccion robertita = new Fraccion("Robertita");
		
		System.out.println("Robertita= "+robertita.toString());
		
		
		double valorDec = pepita.valorDecimal();
		
		System.out.println("Valor decimal de Pepita "+valorDec);
		pepita.multiplicateTuMisma(3);
		
		System.out.println("Pepita tras multiplicarse= "+pepita.toString());
		valorDec = pepita.valorDecimal();
		
		System.out.println("Valor decimal de Pepita="+ valorDec);
		Fraccion resultado=pepita.multiplicar(3);
		
		System.out.println("Resultado= "+resultado.toString());
		System.out.println("Pepita= "+pepita.toString());
		
		Fraccion maruja = new Fraccion("Maruja");
		Fraccion kiko = new Fraccion("Kiko");
		Fraccion sumaFracciones = maruja.sumar(kiko);
		String fraccSuma = sumaFracciones.toString();
		System.out.println(fraccSuma);

	
	}
}
