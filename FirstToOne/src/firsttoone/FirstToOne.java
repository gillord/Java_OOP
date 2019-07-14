/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttoone;
import javax.swing.*;

/**Douglas "DJ" Gillory
 * 7/1/19
 * 0525282
 * Java Programming
 * First To One Game
 *
 * @author DJ
 */
public class FirstToOne {
    
    /**Main Method 
     * @param args 
     */
   public static void main(String[] args) {
     
  //Initialize & Declare Variables & Fields
       
     final  int NUM_SIDES = 6;                                                            // Sides of Die from Die Class
      final int STARTING_POINTS = 50;                                              // Number of starting points
      String player1Name;                                                                    // First player name
      String player2Name;                                                                   // Second player name
      int round = 0;                                                                            // Initialize Accumulator for Games
      int roll1 = 0;                                                                               //Initialzie Accumulator for player1
      int roll2 = 0;                                                                               // Initialize Accumulators for player2
      
 

      // Die Constructor
      Die die = new Die(NUM_SIDES);
     

     
    // Get the player's names.
      player1Name= JOptionPane.showInputDialog(null,
                         "Enter the First Player's name: ");                                   //Get the first player name
            if (player1Name.isBlank()){                                                        //Exit if nothing entered
                 System.exit(0);
            }
            
      				
       player2Name = JOptionPane.showInputDialog(null,
                          "Enter the Second Player's name: ");                           //Get the second player name
            if (player2Name .isBlank()){                                                    //Exit if nothing entered
                System.exit(0);
            }
      
     // Constructor for both players
     Player player1 = new Player(player1Name, STARTING_POINTS);
     Player player2 = new Player(player2Name, STARTING_POINTS);
     
     
      //Play Game 
      while (gameInPlay(player1, player2)) {                                                //Plays game until a winner is declared
         
          //Accumulator
         round ++;                                                                                 
         
         if (gameInPlay(player1, player2)) {                                                                                                                   
            roll1 = takeTurn(player1, die);                                                     //Player 1 rolls die                                    
            roll2 = takeTurn(player2, die);                                                     //Player 2 rolls die             
         }
         
    //Display Output Message
     String msg = "<html><h4 align='center'>" + "Round: " + round + "<br>" +
                 player1Name+ " rolled a " + roll1 + "<br>" +
                 player2Name + " rolled a " + roll2 + "<br>" +
                 player1Name + ": " + player1.getPointP() + "<br>" +
                 player2Name + ": " + player2.getPointP() + "</h4><html>";
         
   //Displays Results  
     JOptionPane.showMessageDialog(null, msg);
      }
      determineWinner(player1, player2);                                         
      System.exit(0);
   }

   /**
      Game Continuity
      @param p1 for player 1.
      @param p2 for player 2.
      @return True if game is still played
    */

   public static boolean gameInPlay(Player p1, Player p2) {
      boolean status = false; 				// Set the flag to false.
      if (p1.getPointP() != 1 && p2.getPointP() != 1){                                             // Determine if the game is still being played.
         status = true;                                                                                             // Set the flag to true.
      }return status;                                                                                               // Return the status.
   }

   
   // Calculations 
   /**Simulates players turn
      @param p number of points for players
      @param d value of die side
      @return updates players points
    */
  public static int takeTurn(Player p, Die d) {
      d.roll();                                                                                                     //Roll die
      if (p.getPointP() - d.getValue() < 1) {                                                         //Determine players points are less than one                                                                                                                                                                                                                                           
        p.setPointP(p.getPointP() + d.getValue());                                              //If so, add to player's points                           
      } else {                                                                                                      
         p.setPointP(p.getPointP() - d.getValue());                                             //otherwise subtract the value                   
      } return d.getValue();                                                                                //return the value
   }

   /**
      Displays the Winner
      @param p1 for player 1.
      @param p2 for player 2.
    */

   public static void determineWinner(Player p1, Player p2){
      if (p1.getPointP() == 1){				// Determine if player 1 has won the game.
         JOptionPane.showMessageDialog(null,			// If so, display a message declaring player 1
         p1.getName() + " is the winner!");				// as the winner.															
      }else{
         JOptionPane.showMessageDialog(null,			// Display a message declaring player 2 
         p2.getName() + " is the winner!");				//as the winner.
      }
   }
   }

/** Please note the following code was based from  
 * Gaddis, Tony. Starting Out with Java. 3rd Edition
 * Provided by Professor
 * /
