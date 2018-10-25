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
        int wheatInStore = 100;
        int population = 90;
        CropData cropData = null;
        CropControl instance = new CropControl();
        int expResult = 10;
        int result = instance.feedPeople(wheatInStore, population, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
