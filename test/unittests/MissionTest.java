/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.Mission;
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
public class MissionTest {
    
    private Mission m;
    
    public MissionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        m = new Mission(1, "Test", "Test Description", "Test Questgiver", 500, 500);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testMissionConstructor() {
        Mission mission = new Mission(1, "Test", "Test Description", "Test Questgiver", 500, 500);
        assertNotNull(mission);
    }
    
    @Test
    public void testGetId() {
        int expected = 1;
        int result = 0;
        
        result = m.getId();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetName() {
        String expected = "Test";
        String result = "";
        
        result = m.getName();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetDeacription() {
        String expected = "Test Description";
        String result = "";
        
        result = m.getDescription();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetQuestGiver() {
        String expected = "Test Questgiver";
        String result = "";
        
        result = m.getQuestGiver();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetRewardGold() {
        int expected = 500;
        int result = 0;
        
        result = m.getRewardGold();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetRewardExp() {
        int expected = 1;
        int result = 0;
        
        result = m.getRewardExp();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testAccept(){
        Player p = new Player(1, "Henk", "password", 200);
        Boolean passed = false;
        try{
            passed = m.accept(p);
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testDecline(){
        Player p = new Player(1, "Henk", "password", 200);
        Boolean passed = false;
        try{
            passed = m.decline(p);
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testFinish(){
        Player p = new Player(1, "Henk", "password", 200);
        Boolean passed = false;
        try{
            passed = m.finish(p);
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
