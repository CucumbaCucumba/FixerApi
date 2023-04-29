package com.example.fixerapi.Controllors;

import com.example.fixerapi.Models.client;
import com.example.fixerapi.Repositories.UserRepository;
import com.example.fixerapi.Repositories.clientRepo;
import com.example.fixerapi.Services.AuthenticationService;
import com.example.fixerapi.Services.ServiceUser;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@RestController
@RequestMapping("/api/client/")
@RequiredArgsConstructor
public class ClientController {

    private final ServiceUser us;
    private final clientRepo cr;
    private final AuthenticationService service;

    private String uploadDirectory =  System.getProperty("user.dir")+"\\src\\main\\resources\\static\\photos";




    @PutMapping("/{email}")
    public ResponseEntity<client> updateProduct(@PathVariable String email, @RequestBody client c) {

         if (cr.findByEmail(email) != null){
             client finalC = cr.findByEmail(email);
             finalC.setCity(c.getCity());
             finalC.setImagePath(c.getImagePath());
             finalC.setTel(c.getTel());
             cr.save(finalC);
         return ResponseEntity.ok(finalC) ;
         }else{
             System.out.println("error");
             return ResponseEntity.notFound().build();
         }

    }

    @PostMapping("/uploadImg")
    public ResponseEntity<String> mod(@RequestParam("file") MultipartFile mpf) {

        if (!mpf.isEmpty()) {
            String fileName = mpf.getOriginalFilename();
            Path fileNameAndPath = Paths.get(uploadDirectory, fileName);
            try {
                Files.write(fileNameAndPath, mpf.getBytes());

            } catch (IOException e) {
                return ResponseEntity.internalServerError().build();
            }
            return  ResponseEntity.ok("success");
        }else{
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping(value="/img/{img}",produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImage(@PathVariable String img) throws IOException{
        return us.getImage(img) ;

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delProduct(@PathVariable Long id) {
        client cl = cr.findById(id).get();
        cl.setOffers(null);
        cl.setReports(null);
        cr.save(cl);
        cr.deleteById(id);
        return ResponseEntity.ok("success");
    }
}
