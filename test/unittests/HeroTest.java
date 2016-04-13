/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.Hero;
import dungeoncrawlertest2.classes.Item;
import dungeoncrawlertest2.classes.Tile;
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
public class HeroTest {
    private Hero h;
    
    public HeroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        h = new Hero(1, "Test", 5, 5, 5, 5, 2, 5);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testHeroConstructor() {
        Hero hero = new Hero(1, "Test", 5, 5, 5, 5, 2, 5);
        assertNotNull(hero);
    }
    
    @Test
    public void testGetExperience() {
        int expected = 5;
        int result = 0;
        
        result = h.getExperience();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testPickUpItems() {
        Boolean passed = false;
        try{
            Tile tile = new Tile(1, 1);
            Boolean test = h.pickUpItems(tile);
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testBuyItem() {
        Boolean passed = false;
        try{
            Item item = new Item(1, "potion", "This is a potion", 20, 10);
            Boolean test = h.buyItem(item);
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testUseItems() {
        Boolean passed = false;
        try{
            Item item = new Item(1, "potion", "This is a potion", 20, 10);
            Boolean test = h.useItem(item);
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testSellItems() {
        Boolean passed = false;
        try{
            Item item = new Item(1, "potion", "This is a potion", 20, 10);
            Boolean test = h.sellItem(item);
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testDropItems() {
        Boolean passed = false;
        try{
            Item item = new Item(1, "potion", "This is a potion", 20, 10);
            Boolean test = h.dropItem(item);
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testFlee() {
        Boolean passed = false;
        try{
            Boolean test = h.flee();
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
}
