/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.Item;
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
public class ItemTest {
    
    private Item i;
    
    public ItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        i = new Item(1, "potion", "This is a potion", 20, 10);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetId(){
        int expected = 1;
        int result = 0;
        
        result = i.getID();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetName(){
        String expected = "potion";
        String result = "";
        
        result = i.getName();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetDescription(){
        String expected = "This is a potion";
        String result = "";
        
        result = i.getDescription();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetCost(){
        int expected = 20;
        int result = 0;
        
        result = i.getCost();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetLvlRequirement(){
        int expected = 10;
        int result = 0;
        
        result = i.getLvlRequirement();
        
        assertEquals(expected, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
