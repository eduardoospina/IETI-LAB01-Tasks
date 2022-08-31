package IETI.Lab1tasks.controller;


import IETI.Lab1tasks.dto.TaskDto;
import IETI.Lab1tasks.entities.Task;
import IETI.Lab1tasks.service.TaskService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "/api/task" )
public class TaskController {

    private final TaskService tasksservice;
    private ModelMapper mapeo = new ModelMapper();

    public TaskController(@Autowired TaskService taskservices){
        this.tasksservice = taskservices;}


    @GetMapping
    public ResponseEntity<List<TaskDto>> getAll() {
        List<TaskDto> DTOtareas = new ArrayList<>();
        List<Task> listatareas = tasksservice.getAll();
        for (int i = 0; i < listatareas.size(); i++){
            DTOtareas.add(mapeo.map(listatareas.get(i), TaskDto.class));
        }
        try{
            return new ResponseEntity<>(DTOtareas, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<TaskDto> findById( @PathVariable String id ) {
        try{
            return new ResponseEntity<>(mapeo.map(tasksservice.findById(id), TaskDto.class), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping
    public ResponseEntity<TaskDto> create( @RequestBody TaskDto taskDto ) {
        try {
            tasksservice.create(mapeo.map(taskDto, Task.class));
            return new ResponseEntity<>(taskDto, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<TaskDto> update( @RequestBody TaskDto task, @PathVariable String id ) {
        try {
            tasksservice.update(mapeo.map(task, Task.class), id);
            return new ResponseEntity<>(task, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete(@PathVariable String id ) {
        try {
            tasksservice.deleteById(id);
            return new ResponseEntity<>(true, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }


}
