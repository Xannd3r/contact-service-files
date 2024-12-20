package com.appointmentservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Calendar;

/**
 * This class tests for the Appointment class.
 */
public class AppointmentTest {

    @Test
    void testAppointmentCreation() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1); // Future date
        Date futureDate = cal.getTime();

        Appointment appointment = new Appointment("12345", futureDate, "Doctor's appointment");
        assertEquals("12345", appointment.getAppointmentId());
        assertEquals(futureDate, appointment.getAppointmentDate());
        assertEquals("Doctor's appointment", appointment.getDescription());
    }

    @Test
    void testInvalidAppointmentId() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        Date futureDate = cal.getTime();

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment(null, futureDate, "Description");
        });
    }

    @Test
    void testInvalidAppointmentDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, -1); // Past date
        Date pastDate = cal.getTime();

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345", pastDate, "Description");
        });
    }

    @Test
    void testInvalidAppointmentDescription() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        Date futureDate = cal.getTime();

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345", futureDate, null);
        });
    }
}

