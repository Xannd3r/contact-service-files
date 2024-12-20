package com.appointmentservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * This class tests for the AppointmentService class.
 */
public class AppointmentServiceTest {
    private AppointmentService service;

    @BeforeEach
    void setUp() {
        service = new AppointmentService();
    }

    @Test
    void testAddAppointment() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        Date futureDate = cal.getTime();

        Appointment appointment = new Appointment("12345", futureDate, "Meeting");
        service.addAppointment(appointment);

        assertEquals(appointment, service.getAppointment("12345"));
    }

    @Test
    void testDeleteAppointment() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        Date futureDate = cal.getTime();

        Appointment appointment = new Appointment("12345", futureDate, "Meeting");
        service.addAppointment(appointment);

        service.deleteAppointment("12345");
        assertNull(service.getAppointment("12345"));
    }

    @Test
    void testAddDuplicateAppointmentId() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        Date futureDate = cal.getTime();

        Appointment appointment1 = new Appointment("12345", futureDate, "Meeting");
        Appointment appointment2 = new Appointment("12345", futureDate, "Another Meeting");

        service.addAppointment(appointment1);
        assertThrows(IllegalArgumentException.class, () -> service.addAppointment(appointment2));
    }

    @Test
    void testDeleteNonexistentAppointment() {
        assertThrows(IllegalArgumentException.class, () -> service.deleteAppointment("99999"));
    }
}
