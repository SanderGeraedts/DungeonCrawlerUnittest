/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontys.time;

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
public class ContactTest {
    
    private Contact c1;
    private Contact c2;
    private Contact c3;
    
    private Appointment a1;
    private Appointment a2;
    private Appointment a3;
    private Appointment a4;
    private Appointment a5;
    
    private Appointment conflict;
    
    public ContactTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c1 = new Contact("Frank");
        c2 = new Contact("Roy");
        c3 = new Contact("Sander");
        
        a1 = new Appointment("GSO Aftekenen", new TimeSpan(new Time(2016, 04, 18, 11, 0), new Time(2016, 04, 17, 12, 0)));
        a2 = new Appointment("JSF Toets", new TimeSpan(new Time(2016, 04, 18, 12, 45), new Time(2016, 04, 17, 14, 15)));
        a3 = new Appointment("GSO Toets", new TimeSpan(new Time(2016, 05, 19, 12, 45), new Time(2016, 04, 17, 16, 0)));
        a4 = new Appointment("SMPT Pitch", new TimeSpan(new Time(2016, 04, 21, 8, 45), new Time(2016, 04, 21, 12, 0)));
        a5 = new Appointment("SMTE Pitch", new TimeSpan(new Time(2016, 04, 21, 12, 45), new Time(2016, 04, 21, 16, 0)));
        
        conflict = new Appointment("SMTE Pitch", new TimeSpan(new Time(2016, 04, 18, 10, 45), new Time(2016, 04, 21, 18, 0)));
        
        a1.addContact(c1);
        a1.addContact(c2);
        a1.addContact(c3);
        
        a2.addContact(c3);
        a2.addContact(c2);
        
        a3.addContact(c1);
        a3.addContact(c2);
        a3.addContact(c3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * No further requirements
     * 
     * @param name 
     */
    
    @Test
    public void testConstructor() {
        Contact contact = new Contact("Henk");
        assertNotNull(contact);
    }
    
    /**
     * This method adds an Appointment to the array agenda, but only if the new Appointment doesn't conflict with the current Appointments in agenda.
     * If the Appointment is added and there were no errors, true is returned.
     * If the Appointment wasn't added because the Appointment conflicted with the current
     * This method should only be used by an Appointment object.
     * 
     * @param a
     * @return Boolean: If the Appointment is added and there were no errors, true is returned.
     * If the Appointment wasn't added because the Appointment conflicted with the current 
     */
    
    @Test 
    public void testAddAppointmentGood() {
        Boolean passed = false;
        Contact contact = new Contact("Test");
        passed = contact.addAppointment(a1);
        assertTrue(passed);
    }
    @Test 
    public void testAddAppointmentConflict() {
        Boolean passed = false;
        Contact contact = new Contact("Test");
        passed = contact.addAppointment(a1);
        passed = contact.addAppointment(conflict);
        assertTrue(passed);
    }
    
    /**
     * Removes an Appointment from agenda. Throws an NoSuchElementException when the Appointment is not found in agenda.
     * 
     * @param a : Appointment
     */
    @Test
    public void testRemoveAppointmentGood() {
        Boolean passed = true;
        try{
            c1.addAppointment(a5);
            c1.removeAppointment(a5);
            passed = true;
        } catch (Exception e) {
            passed = false;
        }
        
        assertTrue(passed);
    }
}
