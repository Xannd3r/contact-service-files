package com.appointmentservice;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is service for managing appointments, providing methods to add and delete appointments.
 */
public class AppointmentService {
    private final Map<String, Appointment> appointments = new HashMap<>();

    // Adds a new appointment
    public void addAppointment(Appointment appointment) {
        if (appointments.containsKey(appointment.getAppointmentId())) {
            throw new IllegalArgumentException("Appointment ID already exists");
        }
        appointments.put(appointment.getAppointmentId(), appointment);
    }

    // Deletes an appointment by ID
    public void deleteAppointment(String appointmentId) {
        if (!appointments.containsKey(appointmentId)) {
            throw new IllegalArgumentException("Appointment ID not found");
        }
        appointments.remove(appointmentId);
    }

    // Retrieves an appointment by ID
    public Appointment getAppointment(String appointmentId) {
        return appointments.get(appointmentId);
    }
}
