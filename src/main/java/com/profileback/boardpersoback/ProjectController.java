package com.profileback.boardpersoback;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/projet")
public class ProjectController {

    @GetMapping("/list")
    public ResponseEntity<List<String>> getall(){
        List<String> response = new ArrayList<>();
        response.add("Développement");
        response.add("Robotique");
        response.add("Eco+ - DDRS");
        response.add("Entrepreuneuriat");
        return ResponseEntity.ok(response);
    }
}
