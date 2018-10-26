/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gjwsi
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int wheatInStore = 0;
        int population = 0;
        CropData cropData = null;
        CropControl instance = new CropControl();
        int expResult = 0;
        int result = instance.feedPeople(wheatInStore, population, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        int landPrice = 0;
        int acresToSell = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int acresToBuy = 0;
        CropData cropData = null;
        int landPrice = 0;
        int workers = 0;
        int expResult = 0;
        int result = CropControl.buyLand(acresToBuy, cropData, landPrice, workers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops() {
        System.out.println("plantCrops");
        int acresToPlant = 0;
        int acresOwned = 0;
        int wheatInStore = 0;
        CropData cropData = null;
        CropControl instance = new CropControl();
        int expResult = 0;
        int result = instance.plantCrops(acresToPlant, acresOwned, wheatInStore, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
