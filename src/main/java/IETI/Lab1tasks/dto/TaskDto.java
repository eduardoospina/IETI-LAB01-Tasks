package IETI.Lab1tasks.dto;

import IETI.Lab1tasks.entities.enums.Status;

import java.time.LocalDate;

public class TaskDto {

    private String id;
    private String name;
    private String description;
    private Status status;
    private String AssignedTo;
    private String dueDate;
    private String createdAt;

    public TaskDto(String name, String description, Status status, String AssignedTo, String dueDate){
        this.id = String.valueOf((int)(Math.random()*9));
        this.name = name;
        this.description = description;
        this.status = status;
        this.AssignedTo = AssignedTo;
        this.dueDate = dueDate;
        this.createdAt = LocalDate.now().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return AssignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        AssignedTo = assignedTo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}