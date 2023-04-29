package com.example.fixerapi.Services;

import com.example.fixerapi.Config.JwtService;
import com.example.fixerapi.Controllors.AuthenticationRequest;
import com.example.fixerapi.Controllors.AuthenticationResponse;
import com.example.fixerapi.Controllors.RegisterRequest;
import com.example.fixerapi.Models.*;
import com.example.fixerapi.Repositories.TokenRepo;
import com.example.fixerapi.Repositories.UserRepository;
import com.example.fixerapi.Repositories.clientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final clientRepo clientRepo;
    private final UserRepository userRepository;
    private final TokenRepo tokenRepo;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwts;
    private final AuthenticationManager authenticationManager;



    public AuthenticationResponse register(RegisterRequest request) {
        client c = new client();
        c.setEmail(request.getEmail());
        c.setFirstname(request.getFirstname());
        c.setLastname(request.getLastname());
        c.setPassword(passwordEncoder.encode(request.getPassword()));
        c.setRole(Role.CLIENT);
        var savedUser = clientRepo.save(c);
        var jwtToken = jwts.generateToken(c);
        saveUserToken(savedUser, jwtToken);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }



    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword())
        );
        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwts.generateToken(user);
        revokeAllUserTokens(user);
        saveUserToken(user,jwtToken);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    private void revokeAllUserTokens(User user){
        var validTokens = tokenRepo.findAllValidTokensByUser(user.getId());
        if (validTokens.isEmpty())
            return;
        validTokens.forEach(t -> {
            t.setExpired(true);
            t.setRevoked(true);
        });
        tokenRepo.saveAll(validTokens);
    }

    private void saveUserToken(User User, String jwtToken) {
        var token = Token.builder()
                .user(User)
                .token(jwtToken)
                .tokenType(TokenType.BEARER)
                .expired(false)
                .revoked(false)
                .build();
        tokenRepo.save(token);
    }
}
