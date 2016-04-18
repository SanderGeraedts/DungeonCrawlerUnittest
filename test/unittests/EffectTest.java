/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.Attribute;
import dungeoncrawlertest2.classes.Effect;
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
public class EffectTest {

    private Effect e;

    public EffectTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        e = new Effect(1, "Potion", 1, Attribute.currentHealth, 5);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testConstructorGood() {
        Effect effect = new Effect(1, "Potion", 1, Attribute.currentHealth, 5);
        assertNotNull("Object effect should be initialized", effect);
    }

    @Test
    public void testConstructorNameTooLong() {
        Boolean passed = false;

        try {
            Effect effect = new Effect(1, "DitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveauDitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveauDitIsEenLangeStringDieInIederGevalMeerDan225CharactersHeeftOmTeTestenDatDitAfgevangenWordtOpDomeinNiveau", 1, Attribute.attack, 5);
        } catch (IllegalArgumentException e) {
            passed = true;
        }
        
        assertTrue("IllegalArgumentException wasn't thrown", passed);
    }
    
    @Test
    public void testGetId(){
        int expected = 1;
        int result = 0;
        
        result = e.getId();
        assertEquals("Result should be 1. Instead result was " + result, result, expected);
    }
    
    @Test
    public void testGetName(){
        String expected = "Potion";
        String result = "";
        
        result = e.getName();
        assertEquals("Result should be Potion. Instead result was " + result, result, expected);
    }
    
    @Test
    public void testGetDuration(){
        int expected = 1;
        int result = 0;
        
        result = e.getDuration();
        assertEquals("Result should be 1. Instead result was " + result, result, expected);
    }
    
    @Test
    public void testGetAttribute(){
        Attribute expected = Attribute.currentHealth;
        Attribute result = null;
        
        result = e.getAttribute();
        assertEquals("Result should be currentHealth. Instead result was " + result.toString(), result, expected);
    }
    
    @Test
    public void testGetEffect(){
        int expected = 5;
        int result = 0;
        
        result = e.getEffect();
        assertEquals("Result should be 5. Instead result was " + result, result, expected);
    }
}
