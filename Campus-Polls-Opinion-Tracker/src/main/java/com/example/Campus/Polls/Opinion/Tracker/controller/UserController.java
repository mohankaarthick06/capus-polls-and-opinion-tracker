package com.example.Campus.Polls.Opinion.Tracker.controller;
import com.example.Campus.Polls.Opinion.Tracker.entity.User;
import com.example.Campus.Polls.Opinion.Tracker.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserController {
private final UserService service;
public UserController(UserService service){
    this.service = service;
}
@PostMapping
public User addUser(@RequestBody User user) {
    return service.addUser(user);
}
@GetMapping
public List<User> getAll() {
    return service.getAllUsers();
    }
}
