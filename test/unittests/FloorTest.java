/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.Floor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sander Geraedts - Code Panda
 */
public class FloorTest {
    
    Floor f;
    
    public FloorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        f = new Floor(1, "Floor 1", 1);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testFloorConstructorGood() {
        Floor floor = new Floor(1, "Floor 1", 1);
        assertNotNull(floor);
    }
    
    @Test
    public void testFloorConstructorNameTooLong() {
        Boolean passed = false;
        try{
            Floor floor = new Floor(1, "DitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveauDitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveauDitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveau", 1);
        } catch(IllegalArgumentException e) {
            passed = true;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testGetId() {
        int expected = 1;
        int result = 0;
        
        result = f.getId();
        
        assertEquals(result, expected);
    }
    
    @Test
    public void testGetName() {
        String expected = "Floor 1";
        String result = "";
        
        result = f.getName();
        
        assertEquals(result, expected);
    }
    
    @Test
    public void testGetFloorNumber() {
        int expected = 1;
        int result = 0;
        
        result = f.getFloorNumber();
        
        assertEquals(result, expected);
    }
    
    /** TODO:
     * 
     * testGenerateFloor(). generateFloor might get deprecated.
     */
}
