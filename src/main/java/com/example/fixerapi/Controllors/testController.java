package com.example.fixerapi.Controllors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class testController {

    @GetMapping("")
    public ResponseEntity<String> testRequest(){
        return ResponseEntity.ok("hello world");
    }

}
