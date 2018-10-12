/*
* The main() class file for the cityOfAaron project
* CIT-260
* Fall 2018
*  Team members: Gavin Siegel, Lauren Allred
*/
package cityofaaron;

import model.Game;
import model.Player;

/**
 *
 * @author gjwsi
 */
public class CityOfAaron {

    public static void main(String[] args) {
        
        Player name = new Player();
        Game thePlayer = new Game();
        
        name.setName("Gavin");
        thePlayer.setPlayer(name);
    }
    
}
