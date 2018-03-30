
package Clases;

public class Perro {
    
    //Propiedades
    
    public String nombre;
    public String raza;
    public String altura;
    
    public String comer(String carne)
    {
    
    return nombre +" mide "+ altura +" y comera " + carne;
    
    }
    
    public void dormin ()
    {
    
    }
    public void ladrar()
    {
    
    }
    
    //Constructores
    
    public  Perro()
    {
    
    
    }
   
    public  Perro(String nombre, String raza, String altura)
    {
    this.nombre=nombre;
    this.raza = raza;
    this.altura=altura;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    
    }
    
}
