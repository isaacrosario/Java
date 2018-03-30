
package promedio;
import javax.swing.JOptionPane;

public class Promedio {

    public static void main(String[] args) {
        
        //Declaramos variable
        
        int nota1,nota2;
        double promedio;
        
        //Entrada de datos
        
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 1"));
        nota2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese nota 2"));
        
        //Proceso
        
        promedio = (nota1+nota2)/2;
        
        //Salida de datos
        
        
        JOptionPane.showMessageDialog(null, "La nota 1 es: " + nota1  +"\n La nota 2 es: " + nota2+
                "\n El promedio es: " +promedio);
    }
    
}
