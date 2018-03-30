package Main;

import Angulos.*;
import Resultante.Hipotenusa;
import Tangente.tan;
import Union_Vectores_Angulos.Union_X;
import Union_Vectores_Angulos.Union_Y;
import Vectores.*;
import javax.swing.*;

public class main {
    
    public static void main(String[] args) {
       
//Vamos a darles valores a los angulos COSX
  double Entrada = Double.parseDouble
        (JOptionPane.showInputDialog("Introduzca COS AX"));
            
            
            double Entrada1 = Double.parseDouble
        (JOptionPane.showInputDialog("Introduzca COS BX"));
            
            
            double Entrada2 = Double.parseDouble
        (JOptionPane.showInputDialog("Introduzca COS CX"));           
        
        
        //El metodo setter recibe estas tres parametros
        
   Angulos_Cos_X AX = new Angulos_Cos_X();
  AX.Angulos_Cos_X(Entrada,Entrada1 ,Entrada2 );
        
 
        //Continua instanciar y recibir valores de vectores x
        
        double Entrada3 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca Vector AX"));
        
        double Entrada4 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca Vector BX"));
        
        double Entrada5 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca Vector CX"));
        
        Vectores_X vectoresAX = new Vectores_X();
        vectoresAX.estableceVectores(Entrada3, Entrada4, Entrada5);
        
        
        //Ahora  vamos con los valores del seno X
        
        
        double Entrada6 = Double.parseDouble
        (JOptionPane.showInputDialog("Introduzca SEN AY"));
            
            
            double Entrada7 = Double.parseDouble
        (JOptionPane.showInputDialog("Introduzca SEN BY"));
            
            
            double Entrada8 = Double.parseDouble
        (JOptionPane.showInputDialog("Introduzca SEN CY"));    
            
            //Introduciremos valores a los vectores de Y
            
            
        double Entrada9 = Double.parseDouble
        (JOptionPane.showInputDialog("Introduzca Vector AY"));
            
            
            double Entrada10 = Double.parseDouble
        (JOptionPane.showInputDialog("Introduzca vector BY"));
            
            
            double Entrada11 = Double.parseDouble
        (JOptionPane.showInputDialog("Introduzca vector CY"));  
        
        
        
        
        //Condiciones para los vectores
        tan mitan = new tan();
   
   
   if(mitan.EjeX > 1 && mitan.EjeY > 1)
       {
           System.out.println(mitan.PrimerCuadatrante());
          

     }
       else if(mitan.EjeX > -1 && mitan.EjeY > 1)
       {
           System.out.println(mitan.SegundoCuadrante());
          
     }
          else if(mitan.EjeX > -1 && mitan.EjeY > -1)
       {
           System.out.println(mitan.TercerCuadatrante());
          
     }
          else
          {
              System.out.println(mitan.CuartoCuadatrante());
          
          }
   
       

    
    
    
        
    

                                
        
        
        
   }

     
}
