package com.ajmera.infotech.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajmera.infotech.entity.Users;
import com.ajmera.infotech.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }
    
    @GetMapping("/user")
    public Users getUserById(@RequestParam("id") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("")
    public Users createUser(@RequestBody Users user) {
        return userService.createUser(user);
    }

    @PutMapping("")
    public Users updateUser(@RequestParam("id") Long id, @RequestBody Users user) {
        user.setId(id);
        return userService.updateUser(id, user);
    }

    @DeleteMapping("")
    public void deleteUser(@RequestParam("id") Long id) {
        userService.deleteUser(id);
    }
}
