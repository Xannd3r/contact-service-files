package com.taskservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class tests for the TaskService class.
 */
public class TaskServiceTest {
    private TaskService service;

    @BeforeEach
    void setUp() {
        service = new TaskService();
    }

    @Test
    void testAddTask() {
        Task task = new Task("12345", "Test Task", "This is a test description.");
        service.addTask(task);
        assertEquals(task, service.getTask("12345"));
    }

    @Test
    void testDeleteTask() {
        Task task = new Task("12345", "Test Task", "This is a test description.");
        service.addTask(task);
        service.deleteTask("12345");
        assertNull(service.getTask("12345"));
    }

    @Test
    void testUpdateTask() {
        Task task = new Task("12345", "Test Task", "This is a test description.");
        service.addTask(task);
        service.updateTask("12345", "Updated Task Name", "Updated description.");
        Task updatedTask = service.getTask("12345");
        assertEquals("Updated Task Name", updatedTask.getName());
        assertEquals("Updated description.", updatedTask.getDescription());
    }
}
