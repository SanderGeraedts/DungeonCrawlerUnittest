/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.Hero;
import dungeoncrawlertest2.classes.Player;
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
public class PlayerTest {
    
    private Player p;
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new Player(1, "Test", "Test password", 500);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetGold(){
        int expected = 500;
        int result = 0;
        
        result = p.getGold();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testBuyHero(){
        Hero h = new Hero(1, "Hero", 1, 1,1,1,1,1);
        Boolean passed = false;
        try{
            passed = p.buyHero(h);
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testSwitchHero(){
        Hero h = new Hero(1, "Hero", 1, 1,1,1,1,1);
        Boolean passed = false;
        try{
            p.switchHero(h);
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
