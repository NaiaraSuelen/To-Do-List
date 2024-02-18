package me.dio.controller;

import me.dio.model.UserModel;
import me.dio.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> findUser(@PathVariable long id) {
        var user = userService.getById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping()
    public ResponseEntity<UserModel> createUser(@RequestBody UserModel user) {
        var userCreate = userService.createUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreate.getId())
                .toUri();

        return ResponseEntity.created(location).body(userCreate);
    }
}
