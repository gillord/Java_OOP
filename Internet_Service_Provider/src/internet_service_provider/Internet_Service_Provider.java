package internet_service_provider;

import javax.swing.JOptionPane;
/**
 * Douglas Gillory
 * 0525282
 * Assignment 3 
 * Internet Service Provider
 *6/7/19
 * Java Programming - Online
 * 
 */
public class Internet_Service_Provider {

    /**
     * This program calculates a customers monthly bill.
     * And displays to the CSR Agent how much the bill is.
     * And based on certain parameters if we could have saved them money 
     */
    public static void main(String[] args) { 
        
        //Declare Variables
        char A, a, b, B, c, C, repeat, deal;                                        //For use in if else and swing statements
        String pack, x, cont;                                                           //Used as objects in Input Dialog boxes 
        double  tttl, ttl1, ttl2, costA, costB, costC, hrs;                     // For all the lovely calculations
        
        //Instructions 
        do{                                                                                 //First part of do loop 
        pack = JOptionPane.showInputDialog(" Please enter choice of package (A, B, or C):  " );         //Dialog box requests package choice
        deal = pack.charAt(0);                                                                                                        //converts pack to deal and from string to char
        x = JOptionPane.showInputDialog(" Please enter amount of hours used: ");                               //Dialog box requests amount of hours in put
         hrs = Double.parseDouble(x);                                                                                               //converts x from string to double and to hrs
         
        costA = 9.95;                                                                                                                   //named constant
        costB = 13.95;                                                                                                                  //named constant
        costC = 19.95;                                                                                                                  //named constant
         ttl1 = costA  + ((hrs-10)*2.00);                                                                                           //calculation for total of package A based on hrs entered
         ttl2 = costB + ((hrs-20)*1.00);                                                                                            //calculation for total of package B based on hrs entered
         
        //Nested If-else if else Statements
        //Package A
        if (deal == 'A' || deal == 'a') {                                       //Overrides  user error when inputting 
                    if (hrs <= 10 ) {                                               // if less or equal to 10 print the following Dialog box
                            JOptionPane.showMessageDialog(null, String.format("The monthly bill for the customer using package A is $%.2f", costA));        //Displays cost of pack A
                    } else if (hrs >=11){                                           //if greater than or equal to 11 then print the following
                            JOptionPane.showMessageDialog(null, String.format("The monthly bill for the customer using package A is $%.2f",  ttl1));        //Displays cost of pack A
                             } if ( ttl1 >= costB ){                                //compares total of packA to pack B 
                                    tttl = ttl1 - costB;                            //calculation for amount saved
                                   JOptionPane.showMessageDialog(null, String.format("The monthly bill for the customer using package A is $%.2f"  +        //Displays cost of pack A
                                                                                             "\nIf the customer switched to package B, we could save them $%.2f",  ttl1, tttl));  //Displays amount saved
                             } else if (ttl1 >= costC) {                    //compares to pack C 
                                    tttl = ttl1 -costC;                         //calculation for amount saved 
                                    JOptionPane.showMessageDialog(null, String.format("The monthly bill for the customer using package A is $%.2f" +        //Displays cost of pack A
                                                                                                "\nIf the customer switched to package C, we could save them $%.2f", ttl1, tttl));  //Displays amount saved
                     }
        }
        //Package B
          if(deal == 'b' || deal == 'B'){                                                   //Looks out for user error       
                 if (hrs <= 20 ) {                                                             // if less or equal to 20 print the following Dialog box
                        JOptionPane.showMessageDialog(null, String.format("The monthly bill for the customer using pacakge B $%.2f" , costB)); //Displays cost of pack B
                    }else  if (hrs >= 21){                                                  // if greateror equal to 21 print the following Dialog box
                            JOptionPane.showMessageDialog(null, String.format("The monthly bill for the customer using package B is $%.2f", ttl2)); //Displays cost of pack B
                          if( ttl2 >= costC){                                                //Compares to Package C
                                 tttl = ttl2 - costC;                                          //calculation comparing package B and C and prints out the diff 
                                 JOptionPane.showMessageDialog(null,  String.format("The monthly bill for the customer using package B is $%.2f" +  //Displays cost of Pack B
                                                                                    "\nIf the customer switched to package C, we could save them $%.2f",  ttl2, tttl)); //Displays amount saved
                          }
                    }
          }
          //Package C
          if (deal == 'c' || deal == 'C') {                                                 //Overrides user error
                        JOptionPane.showMessageDialog(null, String.format("The monthly bill for the customer using package C is $%.2f" , costC));  //Displays the cost of pack C
          }
          
          //End of do-while loop
         cont = JOptionPane.showInputDialog(" Are there more monthly bills to  calculate? Y/N " );      //requests if user like to continue
        repeat = cont.charAt(0);                                                                                                     //converts cont from string to char and into repeat
         }while ( repeat == 'Y' || repeat == 'y');                                                                                  //Overrides user error and continues program if Y is entered
    }
}

    
    
