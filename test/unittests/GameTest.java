/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.Game;
import dungeoncrawlertest2.classes.Hero;
import dungeoncrawlertest2.classes.Player;
import java.util.ArrayList;
import java.util.List;
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
public class GameTest {
    private Game g;
    private Hero p;
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new Hero(1, "Thijsinator", 10, 10, 10, 10, 10, 10);
        g = new Game(1, p);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGameConstructor() {
        Hero partyleader = new Hero(1, "Thijsinator", 10, 10, 10, 10, 10, 10);
        Game game = new Game(1, partyleader);
    }
    
    @Test
    public void testGetId() {
        int expected = 1;
        int result = 0;
        
        result = g.getId();
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetPartyLeader() {
        Hero expected = p;
        Hero result = null;
        
        result = g.getPartyLeader();
        assertEquals(expected, result);
    }
    
    @Test
    public void testStartGame() {
        Player p1 = new Player(1, "naam", "wachtwoord", 10);
        Player p2 = new Player(2, "naam", "wachtwoord", 10);
        Player p3 = new Player(3, "naam", "wachtwoord", 10);
        Player p4 = new Player(4, "naam", "wachtwoord", 10);
        
        ArrayList<Player> ps = new ArrayList<>();
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
        ps.add(p4);
        
        Game game = Game.startGame(ps);
        
        assertNotNull(game);
    }
}
