package com.profileback.boardpersoback.Controleur;

import com.profileback.boardpersoback.Model.Projet;
import com.profileback.boardpersoback.Service.ProjetService.ProjetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;



@RestController
@RequestMapping("/api/projet")
public class ProjectController {

    private final ProjetService projetService;

    public ProjectController(ProjetService projetService) {
        this.projetService = projetService;
    }


    @GetMapping("/list")
    public ResponseEntity<List<Projet>> getall(){
        return ResponseEntity.ok(projetService.getall());
    }


    @PostMapping("/save")
    public ResponseEntity<Projet> saveUser(@RequestBody Projet projet){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/projet/save").toUriString());
        return  ResponseEntity.created(uri).body(projetService.save(projet));
    }
    


}
