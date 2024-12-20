package com.appointmentservice;

import java.util.Date;

/**
 * This class represents an Appointment with a unique ID, a date, and a description.
 */
public class Appointment {
    private final String appointmentId;
    private final Date appointmentDate;
    private final String description;

    public Appointment(String appointmentId, Date appointmentDate, String description) {
        if (appointmentId == null || appointmentId.length() > 10) 
            throw new IllegalArgumentException("Invalid Appointment ID");
        if (appointmentDate == null || appointmentDate.before(new Date())) 
            throw new IllegalArgumentException("Invalid Appointment Date");        
        if (description == null || description.length() > 50) 
            throw new IllegalArgumentException("Invalid Appointment Description");        
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    // Getters
    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getAppointmentDate() {
        return new Date(appointmentDate.getTime());
    }

    public String getDescription() {
        return description;
    }
}

