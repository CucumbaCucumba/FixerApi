package com.example.fixerapi.Services;

import com.example.fixerapi.Models.salle7;
import com.example.fixerapi.Repositories.Salle7Repo;
import com.example.fixerapi.Repositories.adminRepo;
import com.example.fixerapi.Repositories.clientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceUser implements IServiceUsers{

    private String imgsDirectory =  System.getProperty("user.dir")+"\\src\\main\\resources\\static\\photos\\";

    @Autowired
    Salle7Repo sr;


    @Override
    public byte[] getImage(String img) throws IOException {

        Path path= Paths.get(imgsDirectory+img);
        return Files.readAllBytes(path);
    }

    @Override
    public Optional<UserDetails> findUserByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<salle7> findAllUser() {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }
}
