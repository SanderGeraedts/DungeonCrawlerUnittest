/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontys.time;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sander Geraedts - Code Panda
 */
class Contact {
    private String name;
    private ArrayList<Appointment> agenda;

    
    /**
     * No further requirements
     * 
     * @param name 
     */
    public Contact(String name) {
        this.name = name;
        agenda = new ArrayList<>();
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
    protected boolean addAppointment(Appointment a) {
        return false;
    }
    
    /**
     * Removes an Appointment from agenda. Throws an NoSuchElementException when the Appointment is not found in agenda.
     * 
     * @param a : Appointment
     */
    protected void removeAppointment (Appointment a) {
        
    }
    
    /**
     * Returns an Iterator of agenda.
     * 
     * @return 
     */
    public Iterator<Appointment> appointments() {
        return agenda.iterator();
    }
}
