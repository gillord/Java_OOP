/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word.game;      

//Imporrt Java Scanner in order to read input from keyboard
import java.util.Scanner; 
import javax.swing.JOptionPane;
/**
 *6/4/19
 *  DJ Gillory
 * 0525282
 * Assignment 2- Word Game
 * Java Programming OOP      
 */


//Define Class
public class WordGame {

    /**
     * @param args the command line arguments
     */
   
    //Main Method
    public static void main(String[] args) {
        
  //Declare Variables 
     String name, city, college, profession, animal, pName, x;                                            // grouped all String together
     int age;                                                                                                                 //only integer to declare
     
//Initialize user input
     Scanner keyboard = new Scanner(System.in);                                                        //method to initialize user input
    
//Introduction
      JOptionPane.showMessageDialog(null, "Lets Play a Word Game!!! " +                                                                //Creates Dialog Box & Introduces Word Game
                                                             "\nIn order to play the game, please answer each separate question " +    //Instructions on how to play
                                                               "\n that will appear in a pop-up window created by the game!!" +             //Instructions Continued
                                                              " \n******HINT: IT MAKES IT WAY MORE INTERESTING" +                      //Nice suggestive Hint to spice things up
                                                                "\n WHEN IMMAGINATION IS ADDED TO THE MIX******* " +                  //Hint continued         
                                                               "\nREADY??? LET'S DO IT!!!");                                                             //Ensure User is ready to play
     
  //User Input
// Asks for name
     name = JOptionPane.showInputDialog("Please enter your name");                            //Creates Dialog Box & Saves input from user to variable name 
     
//Asks for age
     x = JOptionPane.showInputDialog("Please enter how YOUNG you are");                       //Creates Dialog Box & Saves input from user to variable age as a string
     age= Integer.parseInt(x);                                                                                          //method to convert the value returned from the user into an integer
     
 //Asks for City
     city = JOptionPane.showInputDialog("Please enter a City: ");                                                 //Creates Dialog Box & Saves input from user to variable city 
     
 // Asks for College name
     college = JOptionPane.showInputDialog("Please enter a College: ");                                    //Creates Dialog Box & Saves input from user to variable  college
     
//Asks for a type of profession
     profession = JOptionPane.showInputDialog("Please enter a Profession: ");                                 //Creates Dialog Box &Saves input from user to variable profession 
     
//Asks for Animal type
    animal = JOptionPane.showInputDialog("Please enter a type of  Animal: ");                                 //Creates Dialog Box & Saves input from user to variable animal 
     
  //Asks for Pets Name
     pName = JOptionPane.showInputDialog("Please enter a Pet's Name: ");                                        //Creates Dialog Box & Saves input from user to variable pName 
   
     
//Program output based on what User in put      
     JOptionPane.showMessageDialog(null, "\nThere once was a person named " + name+ " who lived in " + city +"."            //Creates Dialog Box         
                                  + "\nAt the age of " + age + ", " + name + " went to college at " + college + ". \n"                          //Displays the Word Game Result
                                  +  name + " graduated and went to work as a " + profession + "."
                                  + "\nThen, " + name + " adopted a(n) " + animal + " named " + pName+"."
                                  + "\nThey both lived HAPPILY EVER AFTER!!!!");
     
     //END OF PROGRAM 
     JOptionPane.showMessageDialog(null, "Thanks for playing.... Hope you have a Happily Ever After like " + name+ " did!!!!");     //Creates Dialog Box & Thanks user once again for playing 
      JOptionPane.showMessageDialog(null,"Assignment 2 - Word Game"  + "\nWritten by DJ Gillory" +                                   //Creates Dialog Box with
                                                        "\n0525282" + "\n06/04/19" +  "\nJava Programming ");                                           // My info that also appears at the top as well   
    }
    
}
