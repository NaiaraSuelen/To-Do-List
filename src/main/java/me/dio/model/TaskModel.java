package me.dio.model;

import jakarta.persistence.*;
import me.dio.enuns.Priority;
import me.dio.enuns.Status;

import java.util.Date;

@Entity(name = "tb_task")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Status status;
    private Priority priority;
    private Date creationDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;

}
