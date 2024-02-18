package me.dio.service;

import me.dio.model.TaskModel;
import me.dio.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskModel createTask(TaskModel taskModel){
        return taskRepository.save(taskModel);
    }

    public TaskModel getById(Long id){
        return taskRepository.getById(id);
    }
}
