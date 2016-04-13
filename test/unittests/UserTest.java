/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import dungeoncrawlertest2.classes.User;
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
public class UserTest {
    private User u;
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        u = new User(1, "Username", "Password");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetID() {
        int expected = 1;
        int result = 0;
        
        result = u.getID();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testGetName() {
        String expected = "Username";
        String result = "";
        
        result = u.getName();
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testRegisterCorrect() {
        try{
            String username = "Username";
            String password = "Password";
            
            User newUser = User.register(username, password);
            
            User result = User.login(username, password);
            
            assertEquals(newUser, result);
        } catch (Exception e){
            fail();
        }
    }
    
    @Test
    public void testRegister_UsernameTooLong() {
        Boolean passed = false;
        
        try{
            String username = "UsernameButThisTimeTheUsernameIsWayLongerThan32CharactersSoItShouldThrowAnExceaption";
            String password = "Password";
            
            User newUser = User.register(username, password);
            
            passed = false;
        } catch (IllegalArgumentException e){
            passed = true;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testRegister_PasswordTooLong() {
        Boolean passed = false;
        
        try{
            String password = "UsernameButThisTimeTheUsernameIsWayLongerThan32CharactersSoItShouldThrowAnExceaption";
            String username = "Password";
            
            User newUser = User.register(username, password);
            
            passed = false;
        } catch (IllegalArgumentException e){
            passed = true;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testRegister_PasswordTooShort() {
        Boolean passed = false;
        
        try{
            String password = "hoi";
            String username = "Password";
            
            User newUser = User.register(username, password);
            
            passed = false;
        } catch (IllegalArgumentException e){
            passed = true;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testLogin() {
        Boolean passed = false;
        
        try{
            String username = "Username";
            String password = "Password";
            
            User user = User.login(username, password);
            
            passed = true;
        } catch (Exception e){
            passed = false;
        }
        
        assertTrue(passed);
    }
    
    @Test
    public void testLogout() {
        Boolean passed = false;
        
        try{
            String username = "Username";
            String password = "Password";
            
            User user = User.login(username, password);
            user.logout();
            
            passed = true;
        } catch (UnsupportedOperationException e){
            passed = false;
        } catch (Exception e){
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
