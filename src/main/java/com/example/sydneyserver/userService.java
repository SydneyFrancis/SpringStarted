package com.example.sydneyserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    userRepository userRepository;

    List<User> getAllUser(){
        return userRepository.getAllUsersFromDB();
    }

    User getUser(int ID){
        return userRepository.getUserFromBD(ID);
    }

    void addUser(User user){
        userRepository.addUserToDB(user);
    }

    void addUserBody(User user){
        userRepository.addUserBodyToDB(user);
    }

    User updateUserBody(User user){
        userRepository.updateUserBodyToDB(user);
        return user;
    }

    void deleteUser(int ID){
        userRepository.deleteUserFromDB(ID);
    }
}
