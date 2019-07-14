
package gcd;
import javax.swing.*;


/**
 * Greatest Common Divisor 
 * 7/4/19
 * @author DJ 
 */

public class GCD {

    /**Main Method 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare Variables to hold integers
        int num1, num2, count;
        String repeat, input;
        
        
      do{
        input = JOptionPane.showInputDialog("Enter an integer");                         //Dialog Box for first number
        num1 = Integer.parseInt(input);                                                                            //Stores Number as num1
        
       
        input = JOptionPane.showInputDialog("Enter another integer");                           //Dialog Box for second number
        num2 = Integer.parseInt(input);                                                                             //Stores Number as num2
        
        JOptionPane.showMessageDialog(null,"The greatest common divisor " +             //Displays Message and the GCD of the 
                "of " + num1 + " & " + num2 + "  is " +                                                                           //numbers entered 
                gcd(num1, num2));
        
        repeat = JOptionPane.showInputDialog("Would you like to enter another set? ", JOptionPane.YES_NO_OPTION);
        count = Integer.parseInt(repeat);
        }while(count == JOptionPane.YES_OPTION);
    }
    
    public static int gcd(int x, int y){                                                                                //Method used for GCD Calculation
        if(x % y == 0)                                                                                                         //If statement to calculate x divides y
            return y;                                   
        else                                                                                                                        //return statement if there is a remainder
            return gcd(y, x % y);
            
        }
    
    }

