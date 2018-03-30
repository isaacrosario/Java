
package poo;

//HERENCIA
public class Furgoneta  extends Coche{
   
   private int capacida_carga;
   private int plazas_extra;
   
   public Furgoneta(int plazas_extra, int capacida_carga){
       
       super(); //llamar al contructor de la clase padre
       this.capacida_carga = capacida_carga;
       this.plazas_extra = plazas_extra;
       
   }
public String dimeDatosFurgoneta()
{
return "La capacidad de carga es: " + capacida_carga+ " y las plaza son:" 
        + plazas_extra;
            
            
}
}
