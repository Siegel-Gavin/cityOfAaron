/*
* The game() class file for the cityOfAaron project
* CIT-260
* Fall 2018
*  Team members: Gavin Siegel, Lauren Allred
* Author: Gavin Siegel
*/
package model;

/**
 *
 * @author gjwsi
 */
import java.io.Serializable;
public class Location implements Serializable {
    
    private String description;
    private String symbol;
    
    public Location() {
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public String getSymbol() {
        return symbol;
    }

}
