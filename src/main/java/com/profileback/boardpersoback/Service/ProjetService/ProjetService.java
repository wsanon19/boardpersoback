package com.profileback.boardpersoback.Service.ProjetService;

import com.profileback.boardpersoback.Model.Projet;
import com.profileback.boardpersoback.Repository.ProjetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetService   {

    private final ProjetRepository projetRepository;

    public ProjetService(ProjetRepository projetRepository) {
        this.projetRepository = projetRepository;
    }


    public Projet get(Long id) {
        return projetRepository.getProjetById(id);
    }


    public Projet save(Projet projet) {
        return projetRepository.save(projet);
    }


    public List<Projet> getall() {
        return projetRepository.findAll();
    }
}
