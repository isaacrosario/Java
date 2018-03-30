
package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
public class Uso_Empĺeado_con_interfaces {
    public static void main(String[] args) {
        
        
        Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
        jefe_RRHH.estableceIncentivo(2570);
        
        
                
    Empleado[] misEmpleados = new Empleado[6];
    
    misEmpleados[0] = new Empleado("Ana", 30000,2000, 07, 07);
    misEmpleados[1] = new Empleado("Carlos", 50000,1995, 06, 02);
     
    misEmpleados[2] = new Empleado("Paco", 25000,2005, 9, 25);
    misEmpleados[3] = new Empleado("Antonio");
    misEmpleados[4] = jefe_RRHH; //polimorfismo en accion.
                                 //principio de sustitucion
    misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);
    //ambos son validos { misEmpleados[5], misEmpleados[4]}
    //casting o refundicion
    Jefatura jefa_Finanza = (Jefatura) misEmpleados[5]; 
      
       jefa_Finanza.estableceIncentivo(55000);
       
       System.out.println(jefa_Finanza.tomar_decisiones
        ("Dar mas dias de vacaciones a los empleados"));
       
        for(Empleado e: misEmpleados)
        {
            e.subeSueldo(5);
        }
        
            Arrays.sort(misEmpleados);
        for (Empleado e: misEmpleados){
        
            System.out.println("Nombre: " + e.dameNombre() + " Sueldo: "+ 
                e.dameSueldo() + " Fecha de Alta " 
                + e.dameFechaContrato());      
        }
    }
    
    
    
    }
    
    
   
    
        
    
    
class Empleado implements Comparable
{
public Empleado(String nom, double sue, int agno, int mes, int dia)            
{
nombre = nom;
sueldo= sue;
GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
altaContrato = calendario.getTime();
++IdSiguiente;
id= IdSiguiente;

}
public Empleado(String nom)
{
    this(nom, 30000,2001,01,01);
}
public  String dameNombre()
{
    return nombre + " id: "+ id;
}
public  double dameSueldo()
{
    return sueldo;
}
public Date dameFechaContrato()
{
    return  altaContrato;
}
public void subeSueldo(double  porcentaje)
{
    double aumento =sueldo*(porcentaje/100);
    sueldo+=aumento;
}


 public int compareTo(Object miObjeto){
 //Hacemos un casting del objeto
 Empleado otroEmpleado =(Empleado)miObjeto;
 if(this.sueldo<otroEmpleado.sueldo)
 {
     return  -1;
 }
 if(this.sueldo>otroEmpleado.sueldo){
     return 1;
 }
    return  0;
    
 }
private String nombre;
private double sueldo;
private Date altaContrato;
private int id;
private static int IdSiguiente;
}



 class Jefatura extends Empleado implements Jefes{
    
    public Jefatura(String nom, double sue, int agno, int mes, int dia)
    {
         super(nom,sue,agno,mes,dia);
    }
    private double incentivo;
    public  void estableceIncentivo(double b)
    {
        incentivo = b;
    }
    
   public String tomar_decisiones(String decision){
         return "Un miembro de la direccion ha tomado la decision de: "
                 + decision;
     }
    public double dameSueldo() //Overridden
    {
        double sueldoJefe=super.dameSueldo();
        return  sueldoJefe +incentivo;
    }
   
    
}

class Director extends Jefatura{
    public Director(String nom, double sue, int agno, int mes, int dia){
        super(nom,sue,agno,mes,dia);
    }
            
}