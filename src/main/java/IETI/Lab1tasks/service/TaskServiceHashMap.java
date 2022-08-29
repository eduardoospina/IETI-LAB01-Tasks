package IETI.Lab1tasks.service;

import IETI.Lab1tasks.entities.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TaskServiceHashMap implements TaskService{

    private final ConcurrentHashMap<String, Task> tasks = new ConcurrentHashMap<>();

    @Override
    public Task create(Task task) {
        tasks.putIfAbsent(task.getId(),task);
        return task;
    }

    @Override
    public Task findById(String id) {
        try{
            return tasks.get(id);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Task> getAll() {
        List<Task> tareas = new ArrayList<>();
        for (String id: tasks.keySet()){
            tareas.add(tasks.get(id));
        }
        return tareas;
    }

    @Override
    public boolean deleteById(String id) {
        tasks.remove(id);
        boolean resp = !tasks.containsKey(id);
        return resp;
    }

    @Override
    public Task update(Task task, String id) {
        return tasks.put(id, task);
    }
}
