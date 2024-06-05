package com.jwtimplementation.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.jwtimplementation.model.User;

@Service
public class UserService {

    List<User> data=new ArrayList<>();

    public UserService() {
        data.add(new User(UUID.randomUUID().toString(),"Prashant","parshya@gmail.com"));
        data.add(new User(UUID.randomUUID().toString(),"Amit","amit@gmail.com"));
        data.add(new User(UUID.randomUUID().toString(),"Shiv","shiv@gmail.com"));
        data.add(new User(UUID.randomUUID().toString(),"Kashi","kashi@gmail.com"));
    }

    public List<User> getUserData()
    {
        return this.data;
    }
}
