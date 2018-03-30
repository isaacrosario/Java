package Resultante;
import Union_Vectores_Angulos.*;

public class Hipotenusa {
    
//hay que necontral la hipotenusa
    
    //invocamos los totales
    
    Union_X x = new Union_X();
    Union_Y y = new Union_Y();
    
    //medtodo math declaramos variable
    
    
    private double resultante =
            Math.sqrt(Math.pow(x.AlmacenamientoTotalX, 2) + 
            Math.pow(y.AlmacenamientoTotalY, 2));
   
    
//getter Resultante
    public String dameResultante(){
        return "La resultante es: " + resultante;
    }
    
    //obtuve la resultante y ahora que
    private double Tan = x.AlmacenamientoTotalX/y.AlmacenamientoTotalY;
    
   
    
    private double archTan = Math.atan(Tan);
    //getter arcTan
    
   
    public String dameArcTan(){
  
        return"El valor de la ArchTang es " + archTan;
    }
            
    

    

            


}
