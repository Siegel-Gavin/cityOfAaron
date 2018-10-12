/*
* The game() class file for the cityOfAaron project
* CIT-260
* Fall 2018
*  Team members: Gavin Siegel, Lauren Allred
*/
package model;

/**
 *
 * @author gjwsi
 */
import java.io.Serializable;
public class Game implements Serializable {
    
    private Player thePlayer;
    
    public Game() {
    }
    
    public Player getPlayer() {
        return thePlayer;
    }
    
    public void setPlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

}