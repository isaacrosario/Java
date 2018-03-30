
package datos;

import java.sql.*;
import java.util.LinkedList;

public class conexionBD {
    
    Connection conexion = null; //i have no idea why
    PreparedStatement ps =null;
    ResultSet rs = null;
    
    
    public Connection conectar (){
        try{
            //conectarnos al driver de posgresql
            Class.forName("org.postgresql.Driver");
conexion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/persona","postgres","40227283047");
            System.out.println("Conectado");
            
        }
        catch(Exception ex){
            System.out.println("ERROR" + ex.getMessage());
            
        }
        return conexion;
        
    }
    //para que sirve likedlist
    public LinkedList<cliente>consultaCliente(String conSQL) { //conSQL es el select
    LinkedList<cliente>lCliente = new LinkedList<cliente>();
    try{
    ps = conectar().prepareCall(conSQL); //ps es un objecto de PreparedStatement
    rs = ps.executeQuery();  // es igual a F5 y se almacena en rs es objeto de ResultSet
    
    }
    catch(Exception ex)
    {
        System.out.println("ERROR" + ex.getMessage());
    }
    
    return lCliente;
    }
    
    public static void main (String[]args) {
    
        conexionBD c = new conexionBD();
        System.out.println(""+c.conectar() );
}

    
}
