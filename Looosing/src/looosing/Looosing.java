
package looosing;

import java.util.ArrayList;
import java.util.Collections;

public class Looosing {

    
    public static void main(String[] args) {
        
      int x = 0;
        for (int i = 10; i > 0; i=i-x) {
            x++;
            if (i%2==1) {
                break;
                
            }
        }
    
        System.out.println(x);
    }
    
}
