
package teoria03ex03;

import static java.lang.Math.sqrt;

/**
 *
 * @author jota
 */
public class Complex {
    private float parteReal, parteImaginaria;
    static int i = (int) sqrt(-1);
    
    public void setParteReal(float parteReal){
        this.parteReal = parteReal;
    }
    
    public float getParteReal(){
        return parteReal;
    }
    
    public void setParteImaginaria(float parteImaginaria){
        this.parteImaginaria = parteImaginaria;
    }
    
    public float setParteImaginaria(){
        return parteImaginaria*i;
    } 
    
}
