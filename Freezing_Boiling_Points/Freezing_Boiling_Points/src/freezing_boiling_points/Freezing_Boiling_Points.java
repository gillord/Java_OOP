/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freezing_boiling_points;
import javax.swing.JOptionPane;


/**Doulgas "DJ" Gillory
 *
 * 7/1/19
 * Freezing Boiling Points
 * Java Programming 
 */



public class Freezing_Boiling_Points{
    //Declare Variables
    private int freezing;
    private int boiling;
    private int liquid;
    /** Constructor
     * 
     * @param f for freezing point
     * @param b for boiling point
     */
    public Freezing_Boiling_Points(int f, int b){
    freezing = f;
    boiling =b;
}
    //set water freezing temp
    public void setWaterF(int f){
        if(f <= 32)
        freezing = f; 
    }
    //set mercury freezing temp
    public void setMercuryF(int f){
        if(f<=-38)
            freezing = f;
    }
  //set Oxygen freezing temp
    public void setOxygenF(int f){
        if(f <= -362)
            freezing = f;
    }
    //set EthylAlcohol freezing temp
    public void setEthylF(int f){
        if(f<=-173)
            freezing = f;
    }
    /** set Boiling Point Temps
     * 
     * @param b 
     */
    //set water boiling point
     public void setWaterB(int b){
        if(b >= 212)
        boiling = b;
    } 
     //set mercury boiling point
     public void setMercuryB(int b){
        if(b >= 676)
        boiling = b;
    } 
     //set oxygen boiling point
    public void setOxygenB(int b){
        if(b >= -306)
        boiling = b;
    } 
    //set Ethyl Alcohol boiling point
    public void setEthylB(int b){
        if(b >= 172)
        boiling = b;
    }
    /**set liquid state
     * 
     * @param l for liquid state (instead of using No Change)
     */
    public void setLiquid(int l){
        liquid = l;
    }
    /**get methods return objects freezing field
     * 
     * @return the value for each object
     */
    public int getWaterF(){
        return freezing;
    }
    public int getMercuryF(){
        return freezing;
    }
    public int getOxygenF(){
        return freezing;
    }
    public int getEthylF(){
        return freezing;
    }
    
    /**get method returns objects Boiling points
     * 
     * @return the value for each object
     */
    public int getWaterB(){
        return boiling;
    }
    public int getMercuryB(){
        return boiling;
    }
    public int getOxygenB(){
        return boiling;
    }
    public int getEthylB(){
        return boiling;
    }
    /**get method returns Liquid state
     * 
     * @return the value liquid
     */
    public int getLiquid(){
        return liquid;
    }
    /**get state method returns objects state
     * 
     * @param temp = temperature
     * @return String of state
     */
    public String getState(int temp){
        if(temp <= freezing){
            return "Frozen";
        }else if (temp >= boiling){
            return "Boils";
        }else
            return "Liquid";
    }
    /**
     * 
     * @param args the main method
     */
    public static void main(String [] args){
        String input;                                                                                           // holds user input
        //create objects for each different matter
        Freezing_Boiling_Points ethyl = new Freezing_Boiling_Points(-173, 172);
        Freezing_Boiling_Points mercury = new Freezing_Boiling_Points(-38, 676);
        Freezing_Boiling_Points oxygen = new Freezing_Boiling_Points(-362, -306);
        Freezing_Boiling_Points water = new Freezing_Boiling_Points(32, 212);
   
        boolean repeat;                                                                                     //used for loop to repeat program
        int count;                                                                                              //used for user input 
        
//Program Intro & Instructions
       String msg = "<html><h2 align='center'>" + "Oxygen, Mercury, Water, and Ethyl Alcohol " + "</h2>" +
                "<h3 align='center'>" +  "All exist in different states of matter " + 
               "depending on their temperature."+ " </h3>" + 
                "<h3 align='center'>" + "This program displays their different states of matter" + 
               " based on the temperature entered!! " + "</h3></html>";
      //Request for  User input 
       String msg3 = "Please enter temperature? ";
       JOptionPane.showMessageDialog(null, msg, "User Instructions", JOptionPane.INFORMATION_MESSAGE);  //Instruction Jframe box
       do{                                                                                                                                                        //do while loop to repeat program
      input = JOptionPane.showInputDialog(null, msg3, "Please Input Temperature", JOptionPane.PLAIN_MESSAGE); //Jframe box request user input
       int temp = Integer.parseInt(input);                                                      //turns string into integer
       
       //Gather each state for each matter based on user input
       String stateEthyl = ethyl.getState(temp);
       String stateMercury = mercury.getState(temp);
       String stateOxygen = oxygen.getState(temp);
       String stateWater = water.getState(temp);
       
//Table layout for output in html form 
          String msg2 =  "<html><table><tr><td align='center' colspan='2'>" +
                   input + " Degrees Farenheit" + "<br>" + "---------------------"
                   + "</td></tr>" + "<br>" +  "<tr><td>" + "Matter" +
                  "</td><td align='right'>" + "State"  + "</td></tr>" +
                  "<tr><td align='center'  colspan ='2'>" + "---------------------" + "</td></tr>"  +
                  "<tr><td>" + "Ethyl Alcohol" + "</td><td align='right'>" +
                   stateEthyl + "</td></tr>" + "<tr><td>" +
                   "Mercury" + "</td><td align='right'>" +
                   stateMercury + "</td></tr>" + "<tr><td>" +
                   "Oxygen" + "</td><td align='right'>" + 
                   stateOxygen + "</td></tr>" + "<tr><td>" +
                   "Water" + "</td><td align='right'>" +
                   stateWater + "</td></tr></table></html>";
      
         JOptionPane.showMessageDialog(null,  msg2, "Common States of Matter", JOptionPane.PLAIN_MESSAGE);          // Display Results
          count = JOptionPane.showConfirmDialog(null, "Would you like to check another temperature?", "Please Select", JOptionPane.YES_NO_OPTION); //Request User to repeat program
        }while (repeat = (count == JOptionPane.YES_OPTION));                    //end of while loop if user chooses Yes option program repeats otherwise program exits
    }
}


