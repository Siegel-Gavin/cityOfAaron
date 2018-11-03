/* The CropControl() class file for the cityOfAaron project
* CIT-260
* Fall 2018
* Team members: Gavin Siegel, Lauren Allred
*/
package control;

import model.CropData;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gjwsi
 */
public class CropControl { 
    
    
// The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, and a 
// reference to a CropData object
// Returns: the acres owned after the sale
// Pre-conditions: acres to sell must be positive
// and <= acresOwned
    public static int sellLand(int landPrice, int acresToSell, CropData cropData){
        //if acresToSell < 0, return -1
        if (acresToSell < 0) {
            return -1;
        }
        //if acresToSell > acresOwned, return -1
        int acresOwned = cropData.getAcresOwned();
        if (acresToSell > acresOwned) {
            return -1;

        }
        //acresOwned = acresOwned - acresToSell
        acresOwned -= acresToSell;
        cropData.setAcresOwned(acresOwned);
        //wheatInStore = wheatInStore + (acresToSell * landPrice)
        int wheat = cropData.getWheatInStore();
        wheat += (acresToSell * landPrice);
        cropData.setWheatInStore(wheat);
        //return acresOwned
        return acresOwned;
    }
    
    // The buylLand method
    // Purpose: To buy land
    // Parameters: the price of land and the number of acres to buy
    // Returns: the acres of owned land
    // Pre-conditions: acres to buy must be positive, but cannot exceed wheat in store.
    public static int buyLand(int acresToBuy, CropData cropData, int landPrice){
        int acresOwned = cropData.getAcresOwned();
        int wheatInStore = cropData.getWheatInStore();
        //if acresToBuy < 0, return -1
        if (acresToBuy < 0) {
            return -1;
        }
        //if wheatInStore < landPrice, return -1
        if (wheatInStore < landPrice) {
            return -1;
        }
        //if acresToBuy * landPrice > wheatInStore, return -1
        if (acresToBuy * landPrice > wheatInStore) {
            return -1;
        }
        //wheatInStore = wheatInStore - (acresToBuy * landPrice)
        wheatInStore -= (acresToBuy * landPrice);
        cropData.setWheatInStore(wheatInStore);
        //acresOwned = acresOwned + acresToBuy
        acresOwned += acresToBuy;
        //return acresOwned
        return acresOwned;
    }
    
    public int feedPeople(int wheatInStore, int population, CropData cropData){
        //if population < 0, return -1
        if(population < 0){
            return -1;
        }
        //if wheatInStore < 0 return -1
        if (wheatInStore < 0){
            return -1;
        }
        //if wheatInStore > population, return -1
        if(wheatInStore < population){
            return -1;
        }
        //wheatInStore = wheatInStore - population
        wheatInStore -= population;
        cropData.setWheatInStore(wheatInStore);
        //return wheatInStore
        return wheatInStore;
    }
    
    public int plantCrops(int acresToPlant, int acresOwned, int wheatInStore, CropData cropData) {

        //If acresToPlant > acresOwned then, return -1
        int owned = cropData.getAcresOwned();
        if (acresToPlant > owned*2) {
            return -1;
        }
        //Also, if acresToPlant > wheatInStore then, return -1
        if (acresToPlant > wheatInStore) {
            return -1;
        }
        return acresOwned;
    }
}
