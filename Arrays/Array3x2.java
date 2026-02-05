import java.util.Scanner;
public class Array3x2 {
  public static void main(String[]args) {
  Scanner teclado = new Scanner(System.in);
  String[][] frutas = new String[3][2];
  
   for (int i=0; i<frutas.length; i++) {
  	for (int j=0; j<frutas[i].length; j++) {
  	  switch (i){
  	    case 0:
  		    System.out.println("Nompra una fruta con p"+" "+i+" "+j);
  		    frutas[i][j]=teclado.next();
  	    break;
  	    case 1:
          System.out.println("Nompra una fruta con m"+" "+i+" "+j);
  		    frutas[i][j]=teclado.next();
  	    break;
  	    case 2:
  		    System.out.println("Nompra una fruta que no empiece por p ni por m"+" "+i+" "+j);
  		    frutas[i][j]=teclado.next();
  		  break;
   	  }
   	}
  } 
  for (int i=0; i<frutas.length; i++) {
  	for (int j=0; j<frutas[i].length; j++) {
  		System.out.print(frutas[i][j]+" "+"\t"+"\t");
  	}
  	System.out.println();
  }
  }
}

