
package Clases;

public class Empleado extends Persona {

    //Propiedades
    private String tipoContrato;
    double sueldo;
    
    //Metodo
    public void calcularSueldo(Double sueldoBase)
    {
        if (this.getTipoContrato()=="C") 
   

    {
    this.setSueldo(sueldoBase+350);
    
    }
        else
        {
    this.setSueldo(sueldoBase+750);    
        }
    }
   
    //Metodos setter and getter
    
    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getSueldo() {
        return sueldo;
    }

   
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
