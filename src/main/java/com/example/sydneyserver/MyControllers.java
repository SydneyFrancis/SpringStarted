package com.example.sydneyserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController // denotes this class will be the controller
public class MyControllers {
@Autowired
userService userService;


//    http://localhost:8080/get_users
    @GetMapping("/get_users")
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.FOUND);
    }

    @GetMapping("/get_user")
    public ResponseEntity<User> getUser(@RequestParam("ID")int ID){
        return new ResponseEntity<>(userService.getUser(ID),HttpStatus.FOUND);
    }

//    http://localhost:8080/add_user?ID=36&Name=Sydney&Age=23&Country=India
    @PostMapping("/add_user")
    public ResponseEntity<String> addUser(@RequestParam("ID") int ID, @RequestParam("Name") String name, @RequestParam("Age") int age, @RequestParam("Country")String country){
        User user = new User(ID,name,age,country);
        userService.addUser(user);
        return new ResponseEntity<>("Added",HttpStatus.ACCEPTED);
    }

//    http://localhost:8080/add_user_body
    @PostMapping("/add_user_body")
    public void addUserBody(@RequestBody(required = true) User user){
        userService.addUserBody(user);
    }


//    http://localhost:8080/update_user_body
    @PutMapping("/update_user_body")
    public User updateUser(@RequestBody() User user){
        return userService.updateUserBody(user);
    }

//    http://localhost:8080/delete_user
    @DeleteMapping("/delete_user")
    public ResponseEntity<String> deleteUser(@RequestParam("ID") int ID){
        userService.deleteUser(ID);
        return new ResponseEntity<>("Done",HttpStatus.ACCEPTED);
    }

}
