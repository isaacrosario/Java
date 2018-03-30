package poo;

import java.util.Scanner;



public class Uso_Tallas 
{
    //La clase enum no puede ser declara en el metodo main
    //Puede estar dentro de la clase o del paquete

    /*enum Talla{ MINI,MEDIANO,GRANDE, MUY_GRANDE
        
    };    */
    
    enum Talla{
        MINI("S"),MEDIANA("M"),GRANDE("L"), MUY_GRANDE("XL");
        
        //EL constructor tiene que ser private obligatoriamente
        private Talla(String abreviatura)
        {
            this.abreviatura= abreviatura;
        }
    
   
     public String dameabreviatura(){
        return abreviatura;
    }
       private String abreviatura;
    }
    
    
   
    
     
    
 public static void main (String [] args)   {
    //Wao es como instanciar una variable
     //Es extraño right?
    
     Scanner entrada = new Scanner(System.in);
     System.out.println("Escribe una talla: MINI, MEDIANA, GRANDE, MUY GRANDE");
     
     String entrada_datos=entrada.nextLine().toUpperCase();
     //para detectar a que tipo pertenese este String
     Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
     
     System.out.println("Talla=" + la_talla);
     System.out.println("Abreviatura=" + la_talla.dameabreviatura());
     
     
     
     
}
}