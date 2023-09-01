
package teoria04exlaser;

/**
 *
 * @author jota
 */
public class Teoria04exLaser {

    
    public static void main(String[] args) {
        Laser l[] = new Laser[10];
        
        for(int i = 0; i< 10; i++){
            l[i] = new Laser("teste:" + i, i, (i*25), i*5 );
            System.out.println(l[i]);
            System.out.println("");
            
            
            
            
            
        }
    }
    
}
