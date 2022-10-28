package com.example.sydneyserver;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class userRepository {
    HashMap<Integer,User> hm = new HashMap<>();

    public List<User> getAllUsersFromDB(){
        List<User> list = new ArrayList<>();
        for(User user : hm.values()){
            list.add(user);
        }
        return list;
    }

    public User getUserFromBD(int ID){
        if(hm.containsKey(ID)){
            return hm.get(ID);
        }
        return null;
    }

    public void addUserToDB(User user){
        hm.put(user.getID(),user);
    }

    public void addUserBodyToDB(User user){
        hm.put(user.getID(),user);
    }

    public User updateUserBodyToDB(User user){
        hm.put(user.getID(),user);
        return user;
    }

    public String deleteUserFromDB(int ID){
        hm.remove(ID);
        return "Done";
    }
}
