/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.NPC;
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
public class NPCTest {
    
    private NPC n;
    
    public NPCTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n = new NPC(1, "npc", 1,1,1,1,1,1,1);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testConstructor() {
        NPC npc = new NPC(1, "npc", 1,1,1,1,1,1,1);
        assertNotNull(npc);
    }
    
    @Test
    public void testGetExpDrop() {
        int expected = 1;
        int result = 0;
        
        result = n.getExpDrop();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetGoldDrop() {
        int expected = 1;
        int result = 0;
        
        result = n.getGoldDrop();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testDropLoot() {
        Boolean passed = false;
        try{
            passed = n.dropLoot();
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testStartMove() {
        Boolean passed = false;
        try{
            passed = n.startMove();
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
