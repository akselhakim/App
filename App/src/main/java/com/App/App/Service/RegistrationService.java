package com.App.App.Service;

import com.App.App.Dto.RegisterRequest;
import com.App.App.Model.User;
import com.App.App.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class RegistrationService {
    private final UserRepository userRepository;

    @Autowired
    public RegistrationService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //future improvements:
    // 1) check email syntax, password strength (in case throw custom exception)
    // 2) hash password
    // 3) send authentication email
    public void signUp(RegisterRequest registerRequest){
        User user = new User();
        user.setEmail(registerRequest.getEmail());
        user.setName(registerRequest.getName());
        user.setPassword(registerRequest.getPassword());
        userRepository.save(user);
    }
}
