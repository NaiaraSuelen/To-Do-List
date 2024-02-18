package me.dio.controller;

import me.dio.model.TaskModel;
import me.dio.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/task")
public class TaskController {
    private TaskService taskService;

    @GetMapping("/{id}")
    public ResponseEntity<TaskModel> findTask(@PathVariable long id) {
        var task = taskService.getById(id);
        return ResponseEntity.ok(task);
    }

    @PostMapping()
    public ResponseEntity<TaskModel> createTask(@RequestBody TaskModel task) {
        var taskCreate = taskService.createTask(task);

        return ResponseEntity.status(HttpStatus.CREATED).body(taskCreate);
    }
}