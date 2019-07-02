/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoteloccupancy;                                                                                  
import javax.swing.JOptionPane;   
/**@author
 *  Douglas Gillory
 * 0525252
 * 6/8/19
 * Java Programming
 * Assignment 4
 * Hotel Occupancy
 */
                                                        
public class HotelOccupancy {                                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
      //Declare Variable
      int floors, rPF, occR;                                                                                    
      String input;
       
      //Initialize Accumulators                                    
       int totalRooms = 0, aRooms=0;                                                                           
       int totalOccR= 0, floorNum=0;                                                                         
       int OccupancyRate = 0;
       
//User Input
//Get Number of Floors in Hotel
input = JOptionPane.showInputDialog("Enter the number of floors in hotel");                                                                                
floors = Integer.parseInt(input);    
//Validate User Input Cant be less than 1
while (floors < 1) {   
            input= JOptionPane.showInputDialog("Invalid Entry. \nNumber of Floors must be greater than 1 "  +                       //Error Message 
                                                                  "\nand less than 8!! "
                                                                 + "\nPlease re-enter the Correct Number of Floors of Hotel ");                                 
                floors = Integer.parseInt(input);                                                                                                          
} 
while(floors > 8) {
         input= JOptionPane.showInputDialog("Invalid Entry. \nNumber of Floors must be greater than 1 "  +                       //Error Message 
                                                                  "\nand less than 8!! "
                                                                 + "\nPlease re-enter the Correct Number of Floors of Hotel ");                                 
                floors = Integer.parseInt(input);     
}

//Get Number of Rooms per floor
for ( int x = 1; x  <= floors; x++){
    floorNum++;
    input = JOptionPane.showInputDialog("Enter the Total Number of Rooms for Floor " + floorNum );            
    rPF = Integer.parseInt(input);    
    //Validate User Input *Can't be less than 10 Rooms entered*
                while (rPF < 10) {                                                                                                                              
                    input = JOptionPane.showInputDialog("Invalid Entry. \nNumber of Rooms must be between 10 and 30.");    //Displays Error Message
                     rPF = Integer.parseInt(input);                                                                                                           
                 }
                while (rPF > 30) {
                      input = JOptionPane.showInputDialog("Invalid Entry. \nNumber of Rooms must be between 10 and 30.");    //Displays Error Message
                     rPF = Integer.parseInt(input);  
                }
                //Get Number of Occupied Rooms per Floor
        input= JOptionPane.showInputDialog("Enter the Total Number of Occupied Rooms for Floor " + floorNum);    
        occR = Integer.parseInt(input);         
        //Validate User Input *Can't enter more that the Total Rooms per Floor Occupied*
                while ( occR > rPF  ) {
                      input= JOptionPane.showInputDialog("Invalid Entry! \nNumber of Occupied Rooms should be equal or less to the Available Rooms for the Floor. " //Displays Error Message
                                                                            + "\nPlease re-enter number of Occupied Rooms for Floor " + floorNum);
                      occR= Integer.parseInt(input);  
                            }
                
          //Running Totals
         totalRooms += rPF;                                                                                                                         //Total Rooms
         totalOccR += occR;                                                                                                                        //Total Occupied Rooms
         
         //Calculations
         aRooms = totalRooms - totalOccR;                                                                                               //Available Rooms Calc
         OccupancyRate = (totalOccR/totalRooms) *100 ;                                                                          //Occupancy Calculation
}
         
      //Output
      //Display All Totals and Calcs to User 
   JOptionPane.showMessageDialog(null, "There are a Total of " + totalRooms + " Rooms in the Hotel "          // Display Total # of Rooms in Hotel
                                                     +  "\nOf which " + totalOccR+ " Rooms are Occupied. "                       //Display Total # of Rooms Occupied in Hotel
                                                     + "\nLeaving  " + aRooms + " Rooms Available! "                               //Display Total # of Rooms Vacant in Hotel
                                                     +  "\nMaking The Occupancy Rate " + (OccupancyRate) + "%.");        //Display Percentage of Rooms Occupied
     
      //EOP ( End of Program)
    }
}
 