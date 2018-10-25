// The feedPeople method
// Purpose: To feed people
// Parameters: The population, the wheat in storage.
// and a reference to a CropData object
// Returns: the amount of wheat left after the sale
// Pre-conditions: population must be positive, wheat in store must be positive
// and >= the population

package control;

/**
 *
 * @author gjwsi
 */
public class feedPeople {
    
    public static int feedPeople(int wheatInStore, int population, cropData cropData){
        //if population < 0, return -1
        if (population <0) {
            return -1;
        }
        //if wheatInStore < 0 return -1
        if (wheatInStore <0) {
            return -1;
        }
        //if wheatInStore < population, return -1
        if (wheatInStore < population) {
            return -1;
        }
        //feedPeople = wheatInStore – population
        int feedPeople = wheatInStore - population;
        //return wheatInStore
        return feedPeople;
    }
}
