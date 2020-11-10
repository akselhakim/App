package com.App.App.Dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String email;
    private String name;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public RegisterRequest(String email, String name, String password){
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public RegisterRequest(){
        super();
    }
}
