package firsttoone;
import java.util.Random;



/**Please note the following code was provided by 
 * Gaddis, Tony. Starting Out with Java. 3rd Edition
*/

public class Die{
    
    //Declare Fields
   private int sides;                                                      
   private int value;                                                       
   
   /**The constructor performs an initial
      roll of the die.
      @param numSides The number of sides for this die.
   */
   public Die(int numSides) {                                       
      sides = numSides;                                                
      roll();                                                                  
   }
   
   /**The roll method simulates the rolling of
      the die.
   */
   public void roll() {
      Random rand = new Random();                       
      value = rand.nextInt(sides) + 1;                         
   }
   
   /**getSides method
      @return The number of sides for this die.
   */
   public int getSides(){                                           
      return sides;                                                     
   }
   
   /**getValue method
      @return The value of the die.
   */
   public int getValue(){                                       
      return value;                                                 
   }
}
