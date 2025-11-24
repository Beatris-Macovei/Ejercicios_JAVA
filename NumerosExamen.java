public    numbers()
{
   Scanner teclado = new Scanner(System.in);
   
   do
   {
       int numero,positivos,negativos, contadorPositivos,contadoNegativos=0;
      System.out.println("Dame un numero");
      numero=teclado.next.int;
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
      
    }
    while(numero!=0);
    system.out.printl("total positivo=" +contadorPositivos);
    system.out.printl("total negativos=" +contadorNegativos);
   if(contadorPositivo>0)
   ssystem.out("media="+ positivos/contadorPositivos);
   if(contadorNegativos>0)
   System.out.print("media ="+ negativos/contadorNegativos);

