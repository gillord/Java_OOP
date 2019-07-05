/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;
import javax.swing.JOptionPane;
import java.util.Random;

/**Douglas "DJ" Gillory
 * 
 * 7/1/19
 * Java Programming
 * Rock_Paper_Scissors
 *
 * @author DJ
 */


public class RockPaperScissors {
     // Initialize Accumulators
    public static int user = 0;                                                 
    public static int computer = 0; 
    public static int tied = 0; 

    /**Main Method
     * 
     * @param args 
     */
    public static void main(String[] args) {
        //Declare Variables
        String replay = "Y";
    
        //Repeat the game
        while(!replay.equalsIgnoreCase("N")){                                                                                                                                                    //do loop to repeat the game
            int computerChoice = getComputerChoice();                                                                                   // Get computer's choice
            int userChoice= getUserChoice();                                                                                                 // Get user's choice
            compareChoice(computerChoice, userChoice);                                                                           // Compare to get the result
            String msg = "<html><table><tr><td><h3 font='SignPainter'> YOU WON: </td><td align='right'>" +user +"</td></tr>" +                          //Print Tallied wins, losses, and ties
                    "<tr><td><h3 font='SignPainter'> COMPUTER WON:  </td><td align='right'>" + computer + "</td></tr>" + 
                    "<tr><td><h3 font='SignPainter'> GAMES TIED:  </td><td align='right'>" + tied +"</td></tr></h3></table></html>";      
            String msg2 = "<html><h4 align='center', font='SignPainter'> Would you like to play again?" + "</h4>"  +                                                                        //Message to request user to repeat game
                                   "<h5 align='center'>(Please enter Y for Yes or N for NO)" + "</h5></html>";
            JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.PLAIN_MESSAGE);         //Display Tallied Wins
          
//Requests user input to repeat game                                                  
        replay = JOptionPane.showInputDialog(null, msg2, "Please select", JOptionPane.PLAIN_MESSAGE);   
      
        }   
        System.exit(0);
    }
    
    /**
     * Random Number Generator 
     * Method for computer choice
     * @return 1 = rock, 2 = paper, 3 = scissors
     */
    public static int getComputerChoice() {                                                                             //get Computer Choice 
        Random randomNumbers = new Random();                                                                      //   Ranodom number Generator
        int value = randomNumbers.nextInt(3) + 1;
        return value;
    }
    
    /**
     * Method to request user input 
     * value stores users choice
     * @return  1 = rock, 2 = paper, 3 = scissors
     */
    public static int getUserChoice() {
        Object[] options = {"Rock", "Paper", "Scissors"};
        //Requests User Input
        int value = JOptionPane.showOptionDialog(null, "Please choose Rock, Paper, or Scissors:",  "Input",             //Message requesting input          
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.DEFAULT_OPTION, null, options,  options[0]);
        return value + 1;
    }
    
    /**
     * Method Comparing the computers and users choices 
     * Tied game will call method itself and play game again 
     * without requesting user input.
     * @param computerChoice
     *                    
     * @param userChoice 
     *                 
     */
    public static void compareChoice(int computerChoice, int userChoice) {
        int result = computerChoice - userChoice;
        switch (result) {
            case 1:                                                                                                                                         // Computer won
            case -2:                                                                                                                                        // Computer won
                showComputerChoice(computerChoice);
                JOptionPane.showMessageDialog(null, "Better luck next time!");                                                                       //Display Message
                computer += 1;                                                                                                                         //Accumulator
                break;
            case -1:                                                                                                                                    // User won
            case 2:                                                                                                                                 // User won
                showComputerChoice(computerChoice);
                JOptionPane.showMessageDialog(null, "YOU WON!");                                                                     //Display Message
                user += 1;                                                                                                                               //accumulator
                break;
            case 0:                                                                                                                                        //tied game
                showComputerChoice(computerChoice);
                JOptionPane.showMessageDialog(null, "TIED GAME!");                                               //Display message 
                tied += 1;                                                                                                                          //accumulator
                computerChoice = getComputerChoice();
                userChoice = getUserChoice();
                compareChoice(computerChoice, userChoice);                              
                break;
        }
    }
    
    /**
     * Displays computerChoice 
     * @param computerChoice
     *                    
     */
    public static void showComputerChoice(int computerChoice){
        String computerChoiceString = "";
        switch (computerChoice) {                                                                                                       //Switch statement used to define
            case 1:
                computerChoiceString = "rock";                                                                                      //the three different choices
                break;
            case 2:
                computerChoiceString = "paper";
                break;
            case 3:
                computerChoiceString = "scissors";
                break;
        }
        JOptionPane.showMessageDialog(null, "The Computer Chose " +                                         //Displays Message
                computerChoiceString + "!"); 
    }
}
       
    
  
 
   
     
    



    
    



