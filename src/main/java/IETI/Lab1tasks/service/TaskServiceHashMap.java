package IETI.Lab1tasks.service;

import IETI.Lab1tasks.entities.Task;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TaskServiceHashMap implements TaskService{

    private final ConcurrentHashMap<String, Task> tasks = new ConcurrentHashMap<>();

    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public Task findById(String id) {
        return null;
    }

    @Override
    public List<Task> getAll() {
        return null;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public Task update(Task task, String id) {
        return null;
    }
}
