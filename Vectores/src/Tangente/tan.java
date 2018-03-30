
package Tangente;

import Union_Vectores_Angulos.*;

public class tan {
    
    Union_X x = new Union_X();
    Union_Y y = new Union_Y();
    //good
    
    public double tang = y.AlmacenamientoTotalY/x.AlmacenamientoTotalX;
    //good
   
    public double EjeY= y.AlmacenamientoTotalY;
    public double EjeX= x.AlmacenamientoTotalX;
    
    public double archTang = Math.atan(tang);
   
public String PrimerCuadatrante()
{
   
                         
return "El vector esta en el primer cuadrante "+"\n"+
                "El vector arcotangente es igual a "+archTang;       
}

public String SegundoCuadrante()
        {
            
 return "El vector esta en el segundo cuadrante " + (180-archTang);
        
        }

public String TercerCuadatrante()
        {
            
 return "El vector esta en el tercer cuadrante " + (270+archTang);
        
        }
public String CuartoCuadatrante()
        {
            
 return "El vector esta en el cuarto cuadrante " + (360-archTang);
        
        }

}




    


