/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.Hero;
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
public class CharacterTest {
    private Hero h;
    
    public CharacterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        h = new Hero(1, "Test", 1, 1, 1, 1, 1, 1);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetId() {
        int expected = 5;
        int result = 0;
        
        result = h.getID();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetName() {
        String expected = "Test";
        String result = "";
        
        result = h.getName();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetHealth() {
        int expected = 5;
        int result = 0;
        
        result = h.getHealth();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetDefense() {
        int expected = 5;
        int result = 0;
        
        result = h.getDefence();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetAttack() {
        int expected = 5;
        int result = 0;
        
        result = h.getAttack();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetCurrentHealth() {
        int expected = 5;
        int result = 0;
        
        result = h.getCurrentHealth();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetCurrentTurns() {
        int expected = 5;
        int result = 0;
        
        result = h.getCurrentTurns();
        
        assertEquals(expected, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
