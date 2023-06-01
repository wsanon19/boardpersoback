package com.profileback.boardpersoback.Repository;

import com.profileback.boardpersoback.Model.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,Long> {
    Projet getProjetById(Long id);
}
