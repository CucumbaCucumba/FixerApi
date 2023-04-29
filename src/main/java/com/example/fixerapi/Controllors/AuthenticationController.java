package com.example.fixerapi.Controllors;

import com.example.fixerapi.Models.User;
import com.example.fixerapi.Repositories.UserRepository;
import com.example.fixerapi.Repositories.clientRepo;
import com.example.fixerapi.Services.AuthenticationService;
import com.example.fixerapi.Services.Mail.mailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final mailService ms;
    private final AuthenticationService service;
    private final UserRepository userRepository;
    private final clientRepo  cR;

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @RequestBody RegisterRequest request
    ) {

        try {
            ms.sendEmail(request.getEmail(), "Sign Up Last Step", "SomeBody is using your mail for signing up in our sit \n In order to finish the step pls check this link: http://localhost:4200/validate/" + request.getEmail());
            service.register(request);
        }catch (Exception e){
        return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("");
    }


    @PostMapping("/authenticate")
    public ResponseEntity<CustomAuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request

    ){
        AuthenticationResponse authenticationResponse = service.authenticate(request);
        CustomAuthenticationResponse customResponse = new CustomAuthenticationResponse();
        customResponse.setToken(authenticationResponse.getToken());
        customResponse.setUser(userRepository.findByEmail(request.getEmail()));
        if (cR.findByEmail(request.getEmail()).getCity() != null){
        return ResponseEntity.ok(customResponse);
        }else{
        return ResponseEntity.badRequest().build();
        }
    }

}
