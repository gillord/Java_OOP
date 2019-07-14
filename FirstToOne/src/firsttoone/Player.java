/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttoone;


/**7/5/19
 *0525282
 * @author DJ
 * Java Programming
 * First To One Game
 */
public class Player {
    private String name;              // The player's name
    private int pointP;                   // The player's points
  
     // Fields

   /**
      The constructor sets 
      @param player's  name.
      @param points. 
    */
   Player (String player, int point) {
      name = player;
      pointP = point;
   }
   
   /**
      The getName method  
      @return  name of the player.
    */
   public String getName() {
      return name;
   }
   
   /**
      The getPoints method  
      @return  player's points.
    */
   public int getPointP() {
      return pointP;
   }
   
   /**
      The setName method sets
      @param player  name.
    */
   public void setName(String player) {
      name = player;
   }
   
   /**
      The setPoints method sets 
      @param point.
    */
   public void setPointP(int point){
      pointP = point;
   }
    
}

