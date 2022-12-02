package com.profileback.boardpersoback.Controleur;

import com.profileback.boardpersoback.Model.Projet;
import com.profileback.boardpersoback.Service.ProjetService.ProjetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Api("API pour les opérations CRUD sur les projets.")

@RestController
@RequestMapping("/api/projet")
public class ProjectController {

    private final ProjetService projetService;

    public ProjectController(ProjetService projetService) {
        this.projetService = projetService;
    }

    @ApiOperation(value = "Récupère la liste des projets !")
    @GetMapping("/list")
    public ResponseEntity<List<Projet>> getall(){
        return ResponseEntity.ok(projetService.getall());
    }

    @ApiOperation(value = "Crée un nouveau projet !")
    @PostMapping("/save")
    public ResponseEntity<Projet> saveUser(@RequestBody Projet projet){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("api/projet/save").toUriString());
        return  ResponseEntity.created(uri).body(projetService.save(projet));
    }






}
