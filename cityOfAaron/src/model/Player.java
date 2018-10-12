/*
* The player() class file for the cityOfAaron project
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
public class Player implements Serializable {
    
    private String name;
    
    public Player() {
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

}