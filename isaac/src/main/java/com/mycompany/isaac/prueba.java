/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isaac;

import javax.swing.JOptionPane;

/**
 *
 * @author isaac
 */
public class prueba {
     public static void main(String[] args) {
       try{
        int entrada1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero1")) ;
                int entrada2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero 2"));
          
                suma operacion = new suma(entrada1, entrada2);
                System.out.println(operacion.result());
               
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("isaac mistake" +e.getMessage());
            
        }
                
          
             
              
        
    }
    
}
