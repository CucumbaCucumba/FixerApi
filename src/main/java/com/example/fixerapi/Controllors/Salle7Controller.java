package com.example.fixerapi.Controllors;

import com.example.fixerapi.Models.salle7;
import com.example.fixerapi.Repositories.Salle7Repo;
import com.example.fixerapi.Services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/salle7/")
@RequiredArgsConstructor
public class Salle7Controller {

    private final Salle7Repo sr;
    private final AuthenticationService service;

    @PutMapping("/{email}")
    public ResponseEntity<salle7> updateProduct(@PathVariable String email, @RequestBody salle7 c) {
        salle7 finalS = sr.findByEmail(email);
        finalS.setCity(c.getCity());
        finalS.setImagePath(c.getImagePath());
        finalS.setTel(c.getTel());
        finalS.setProfession(c.getProfession());
        finalS.setRate(c.getRate());
        sr.save(finalS);
        return ResponseEntity.ok(finalS) ;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delProduct(@PathVariable Long id) {
        salle7 cl = sr.findById(id).get();
        cl.setOffers(null);
        cl.setReports(null);
        sr.save(cl);
        sr.deleteById(id);
        return ResponseEntity.ok("success");
    }
}
