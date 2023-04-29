package com.example.fixerapi.Services;

import com.example.fixerapi.Models.salle7;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface IServiceUsers {


    public Optional<UserDetails> findUserByEmail(String email) ;
    public List<salle7> findAllUser();
    public void deleteUser (String id);
    public byte[] getImage(String email) throws IOException;


}
