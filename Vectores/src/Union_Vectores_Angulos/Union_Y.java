
package Union_Vectores_Angulos;
import Vectores.Vectores_Y;
import Angulos.Angulos_Sen_Y;

public class Union_Y {
    
    Vectores_Y VectoresY = new Vectores_Y();
    Angulos_Sen_Y AngulosY = new Angulos_Sen_Y();
    
    
    public double AlmacenamientoAY = VectoresY.vectorAY * AngulosY.senAY;
    public double AlmacenamientoCY = VectoresY.vectorBY * AngulosY.senBY;
    public double AlmacenamientoBY = VectoresY.vectorCY * AngulosY.senCY;

    //Total almacenamiento Y
public double AlmacenamientoTotalY=  AlmacenamientoAY+AlmacenamientoAY+AlmacenamientoAY;
    
    
    
}
