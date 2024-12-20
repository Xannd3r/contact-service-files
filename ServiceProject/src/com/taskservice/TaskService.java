package com.taskservice;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is for managing tasks, providing methods to add, delete, and update tasks.
 */
public class TaskService {
    private final Map<String, Task> tasks = new HashMap<>();

    // Adds a new task to the service
    public void addTask(Task task) {
        if (tasks.containsKey(task.getTaskId())) {
            throw new IllegalArgumentException("Task ID already exists");
        }
        tasks.put(task.getTaskId(), task);
    }

    // Deletes a task by ID
    public void deleteTask(String taskId) {
        if (!tasks.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found");
        }
        tasks.remove(taskId);
    }

    // Updates task fields for an existing task
    public void updateTask(String taskId, String name, String description) {
        Task task = tasks.get(taskId);
        if (task == null) {
            throw new IllegalArgumentException("Task ID not found");
        }
        if (name != null) task.setName(name);
        if (description != null) task.setDescription(description);
    }

    // Retrieves a task by ID
    public Task getTask(String taskId) {
        return tasks.get(taskId);
    }
}

