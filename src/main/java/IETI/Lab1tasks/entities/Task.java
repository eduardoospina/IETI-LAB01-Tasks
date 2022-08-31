package IETI.Lab1tasks.entities;

import IETI.Lab1tasks.entities.enums.Status;

import java.time.LocalDate;

public class Task {

    private String id;
    private String name;
    private String description;
    private Status status;
    private String AssignedTo;
    private String dueDate;
    private String createdAt;

    public Task(){
        this.id = String.valueOf((int)(Math.random()*9));
        this.createdAt = LocalDate.now().toString();

    }

    public Task(String name, String description, Status status, String AssignedTo, String dueDate){
        this();
        this.name = name;
        this.description = description;
        this.status = status;
        this.AssignedTo = AssignedTo;
        this.dueDate = dueDate;
    }

    public Task(String id, String name, String description, Status status, String assignedTo, String dueDate, String createdAt){
        this(name, description, status, assignedTo, dueDate);
        this.id = id;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}

