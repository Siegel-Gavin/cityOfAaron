* The CropControl() class file for the cityOfAaron project
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
    
    public int feedPeople(int wheatInStore, int population, CropData cropData){
        //if population < 0, return -1
        if(population < 0){
            return -1;
        }
        //if wheatInStore < 0 return -1
        if (wheatInStore < 0){
            return -1;
        }
        //if population > wheatInStore, return -1
        if(population > wheatInStore){
            return -1;
        }
        //wheatInStore = wheatInStore - wheatForPeople
        wheatInStore -= population;
        cropData.setWheatInStore(wheatInStore);
        // wheat for people
        cropData.setPopulation(population);
        //return wheatInStore
        return wheatInStore;
    }
    
    public int plantCrops(int acresToPlant, int acresOwned, int wheatInStore, CropData cropData) {

        //If acresToPlant > acresOwned then, return -1
        int owned = cropData.getAcresOwned();
        if (acresToPlant > acresOwned) {
            return -1;
        }
        //Also, if acresToPlant > wheatInStore then, return -1
        if (acresToPlant > wheatInStore) {
            return -1;
        }
        return acresOwned;
    }
}
