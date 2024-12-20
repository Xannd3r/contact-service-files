package com.taskservice;

/**
 * This class represents a Task with a unique ID, name, and description.
 * This is a huge improvement from the first iteration, it is far cleaner
 * and easier to read. 
 */
public class Task {
    private final String taskId;
    private String name;
    private String description;

    public Task(String taskId, String name, String description) {
        if (taskId == null || taskId.length() > 10)
            throw new IllegalArgumentException("Invalid Task ID");
        if (name == null || name.length() > 20)
            throw new IllegalArgumentException("Invalid Task Name");
        if (description == null || description.length() > 50)
            throw new IllegalArgumentException("Invalid Task Description");

        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

    // Getters and Setters for fields that can be updated
    public String getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() > 20)
            throw new IllegalArgumentException("Invalid Task Name");
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.length() > 50)
            throw new IllegalArgumentException("Invalid Task Description");
        this.description = description;
    }
}
