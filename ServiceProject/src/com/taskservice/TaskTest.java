package com.taskservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * This class tests for the Task class. This is cleaned up from the previous iteration.]
 */
public class TaskTest {
    @Test
    void testTaskCreation() {
        Task task = new Task("12345", "Test Task", "This is a test description.");
        assertEquals("12345", task.getTaskId());
        assertEquals("Test Task", task.getName());
        assertEquals("This is a test description.", task.getDescription());
    }

    @Test
    void testInvalidTaskId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task(null, "Test Task", "This is a test description.");
        });
    }

    @Test
    void testInvalidTaskName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "This name is way too long for a valid task name", "Description");
        });
    }

    @Test
    void testInvalidTaskDescription() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Task("12345", "Task Name", null);
        });
    }
}

