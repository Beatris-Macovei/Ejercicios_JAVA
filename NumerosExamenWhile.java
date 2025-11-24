public numbers()
{
	Scanner teclado = new Scanner(System.in);
	int numero = teclado.nextInt()
	while(numero!=0)
	{
		if(numero>0)
     	{
        positivo=positivo+numero;
        contadorPositivo++;
      	}
		if(numero<0)
		{
			negativos=negativos+numero;
         		contadorNegativos++;
		}
	}
	system.out.printl("totalpositivo="+contadorPositivos);
    	system.out.printl("total negativos="+contadorNegativos);
  	if(contadorPositivo>0)
   	ssystem.out("media="+ positivos/contadorPositivos);
   	if(contadorNegativos>0)
   	System.out.print("media ="+ negativos/contadorNegativos);

