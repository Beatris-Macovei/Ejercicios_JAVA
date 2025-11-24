import java.util.Scanner;
public class Cerdo
{
//Atributos
private String raza;
private int edad;
private boolean mordedor;
private String nombre;


//Métodos
public Cerdo()
{
this.raza = "Ibérico";
this.edad = 2;
this.mordedor = false;
}

public Cerdo(String raza, boolean mordedor, String nombre)
{
this.edad = 0;
this.raza = raza;
this.mordedor = mordedor;
this.nombre= nombre;
}
public String getNombre() {
 return this.nombre;
}


public String getRaza()
{
return this.raza;
}

public void setRaza(String raza)
{
this.raza = raza;
}

public int sumar(int sumando1, int sumando2)
{
return sumando1 + sumando2;
}

public void saludar()
{
System.out.println("Oink, oink!!!!");
}
public void daVueltas() {
 Scanner teclado= new Scanner(System.in);
 System.out.println("Dime el numero de vueltas");
 int vueltas =teclado.nextInt();
 

 if (vueltas>5) {
   System.out.println("Soy el cerdo"+" "+this.getNombre()+" "+"y no me dejo marear");
 }
 else
  {
  for(int i=1;i<=vueltas;i++){
   System.out.println("vuelta"+i);
}

 }
}  

}

