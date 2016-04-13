/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.Skill;
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
public class SkillTest {
    
    private Skill s;
    
    public SkillTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        s = new Skill(1, "Skill", 1);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testConstructor() {
        Skill skill = new Skill(1, "Skill", 3);
        assertNotNull(skill);
    }
    
    @Test
    public void testGetId(){
        int expected = 1;
        int result = 0;
        
        result = s.getId();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetName(){
        String expected = "Skill";
        String result = "";
        
        result = s.getName();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetCooldown(){
        int expected = 1;
        int result = 0;
        
        result = s.getCooldown();
        
        assertEquals(expected, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
