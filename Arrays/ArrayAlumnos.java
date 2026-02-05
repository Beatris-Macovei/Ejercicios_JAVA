import java.util.Scanner;
public class ArrayAlumnos{
  public static void main(String[]args){
  Scanner coshito = new Scanner(System.in);
  String[][] alumnos = new String[6][5];
  
  for (int i=0; i<alumnos.length; i++) {
  	for (int j=0; j<alumnos[i].length; j++) {
  		System.out.println("Nombre alumno"+" "+i+" "+j);
  		alumnos[i][j]=coshito.next();
  	}
  }
  for (int i=0; i<alumnos.length; i++) {
  	for (int j=0; j<alumnos[i].length; j++) {
  		System.out.print(alumnos[i][j]+" ");

    }
  System.out.println();
  }
  
  }
}

