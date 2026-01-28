import java.util.Scanner;
public abstract class Empleado
{
    protected String dni;
    protected String nombre;
    protected int añoIngreso;

    public Empleado (String dni, String nombre, int añoIngreso)
    {
        this.dni=dni;
        this.nombre=nombre;
        this.añoIngreso=añoIngreso;
    }

    public double salario(double salario, int porcentaje, int añoActual,int años)
    {
        salario=2300.00;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿En que año ingreso el empleado al trabajo?");
        añoIngreso=teclado.nextInt();

        añoActual=2026;
        años=añoActual-añoIngreso;

        //if(años==2 || años ==3)
        //{
        //    int resultado = salario*0.05;
        //    salario=salario+resultado;
        //}
        //if(años >=4 || años<=7)
        //{
        //    int resultado = salario*0.1;
        //    salario=salario+resultado;
        //}
        //if(años >=8 || años <=15)
        //{
        //    int resultado = salario*0.15;
        //    salario = salario+resultado;
        //}
        //if(años>15)
        //{
        //    int resultado = salario*0.2;
        //    salario = salario+resultado;
        //}

        switch (años)
        {
            case 2:
            case 3:
                salario += salario * 0.05;
                break;

            default:
                if (años >= 4 && años <= 7)
                    salario += salario * 0.10;
                else if (años >= 8 && años <= 15)
                    salario += salario * 0.15;
                else if (años > 15)
                    salario += salario * 0.20;
                break;
        }


    }

}
