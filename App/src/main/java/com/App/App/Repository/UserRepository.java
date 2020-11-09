package com.App.App.Repository;

import com.App.App.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private static List<User> DB = new ArrayList<>();

    public int insertUser(User user){
        DB.add(user);
        return 1;
    }

    public List<User> getUsers(){
        return DB;
    }

}
