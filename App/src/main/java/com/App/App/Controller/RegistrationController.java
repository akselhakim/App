package com.App.App.Controller;

import com.App.App.Dto.RegisterRequest;
import com.App.App.Service.RegistrationService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/register")
@RestController
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService){
        this.registrationService = registrationService;
    }

    //future: change return value
    @PostMapping
    public void signUp(@RequestBody RegisterRequest registerRequest){
        registrationService.signUp(registerRequest);
    }
}
