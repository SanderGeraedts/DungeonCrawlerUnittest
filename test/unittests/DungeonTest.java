/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.Dungeon;
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
public class DungeonTest {
    private Dungeon d;

    public DungeonTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        d = new Dungeon(1, "name", "value", 2);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testDungeonConstructorGood() {
        Dungeon dungeon = null;
        dungeon = new Dungeon(1, "name", "value", 2);
        assertNotNull("dungeon object should be initialized.", dungeon);
    }

    @Test
    public void testDungeonConstructorNameTooLong() {
        Dungeon dungeon = null;
        Boolean passed = false;
        
        try {
            dungeon = new Dungeon(1, "DitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveauDitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveauDitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveau", "value", 2);
        } catch (IllegalArgumentException e) {
            passed = true;
        }
        
        assertTrue("Creation of dungeon should throw an IllegalArgumentException", passed);
    }

    @Test
    public void testDungeonConstructorTypeTooLong() {
        Dungeon dungeon = null;
        Boolean passed = false;
        try {
            dungeon = new Dungeon(1, "name", "DitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveauDitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveauDitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveau", 2);
        } catch (IllegalArgumentException e) {
            passed = true;
        }
        
        assertTrue("Creation of dungeon should throw an IllegalArgumentException", passed);
    }
    
    @Test
    public void testGetId() {
        int expected = 1;
        int result = -1;
        
        result = d.getId();
        assertEquals("Result should be 1, instead it was" + result, result, expected);
    }
    
    @Test
    public void testGetName() {
        String expected = "name";
        String result = "";
        
        result = d.getName();
        assertEquals("Result should be name, instead it was" + result, result, expected);
    }
    
    @Test
    public void testGetType() {
        String expected = "value";
        String result = "";
        
        result = d.getType();
        assertEquals("Result should be value, instead it was" + result, result, expected);
    }
    
    @Test
    public void testGetLvlRequirements() {
        int expected = 1;
        int result = -1;
        
        result = d.getLvlRequirement();
        assertEquals("Result should be 1, instead it was" + result, result, expected);
    }
    
    @Test
    public void testCheckLvlRequirements_UserLvlEquals() {
        int userLvl = 2;        
        assertTrue("checkLvlRequirements(userlvl) should return true", d.checkLvlRequirement(userLvl));
    }
    
    @Test
    public void testCheckLvlRequirements_UserLvlHigher() {
        int userLvl = 10;        
        assertTrue("checkLvlRequirements(userlvl) should return true", d.checkLvlRequirement(userLvl));
    }
    
    @Test
    public void testCheckLvlRequirements_UserLvlLower() {
        int userLvl = 0;        
        assertFalse("checkLvlRequirements(userlvl) should return false", d.checkLvlRequirement(userLvl));
    }
    
    /** TODO:
     * 
     * generateDungeon() impossible to test yet
     */
}
