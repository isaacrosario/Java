

package Union_Vectores_Angulos;

import Angulos.Angulos_Cos_X;
import Vectores.Vectores_X;

public class Union_X {
    
    //ya instaciamos lod angulos y los vecctores
  Vectores_X VectoresX= new Vectores_X();
    
    Angulos_Cos_X AngulosX = new Angulos_Cos_X();
    
    
  public double AlmacenamientoAX = VectoresX.vectorAX * AngulosX.cosAX;
  public double AlmacenamientoBX = VectoresX.vectorBX * AngulosX.cosAX;
  public double AlmacenamientoCX = VectoresX.vectorCX * AngulosX.cosCX;
 //Total lamacenamiento X
 public double AlmacenamientoTotalX= AlmacenamientoAX+AlmacenamientoBX+AlmacenamientoBX;
 
 
}


