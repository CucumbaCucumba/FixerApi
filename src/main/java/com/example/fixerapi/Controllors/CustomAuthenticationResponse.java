package com.example.fixerapi.Controllors;

import com.example.fixerapi.Models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomAuthenticationResponse {


    private String token;
    private Optional<User> user;


}
