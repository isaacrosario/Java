
package juego;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;
        
        

public class Juego  extends Canvas implements Runnable{
    
    private static final long serialVersionUID=1L;
    private static  final int ANCHO=800;
    private static final int ALTO =600;
    private static volatile boolean enFuncionamiento = false;
    private static final String NOMBRE ="Juego";
    
    private static JFrame ventana;
    private static Thread thread;
    
    private Juego(){
        setPreferredSize(new Dimension(ANCHO, ALTO));
        ventana = new JFrame(NOMBRE);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.add(this,BorderLayout.CENTER);
        ventana.pack();
        ventana.setLocale(null);
        ventana.setVisible(true);
        
        
        
        
        
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
     juego.Iniciar();
    }
    private synchronized  void Iniciar()
    {
     enFuncionamiento=true;
     thread = new Thread(this, "Graficos");
     thread.start();
    }

private  synchronized void detener(){
    enFuncionamiento = false;
    try{
        thread.join();
    }
catch(InterruptedException e)
        {

        e.printStackTrace();
        }

}
public void run()
{
while(enFuncionamiento)
{
    System.out.println("holoa");

}

}
}
