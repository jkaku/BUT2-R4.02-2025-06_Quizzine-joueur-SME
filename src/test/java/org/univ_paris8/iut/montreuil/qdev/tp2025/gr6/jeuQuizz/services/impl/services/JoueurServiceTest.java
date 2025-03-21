package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl.services;

import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ReponseJoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl.mock.AjouterJoueurOKDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.interfaces.JoueurInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.enums.Langue;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JoueurServiceTest {

    JoueurInterface joueurService;

    @Test
    void ajouterJoueurOKDTO(){
        joueurService = new AjouterJoueurOKDTO();
        ReponseJoueurDTO res_attendu = new ReponseJoueurDTO(new JoueurDTO("Kaku","Jonathan","jkaku",2006,"Basket", Langue.fr),new ArrayList<>());
        ReponseJoueurDTO res = joueurService.ajouterJoueurDTO("Kaku","Jonathan",new ScoreDTO(),2006,"Basket", Langue.fr);
        assertEquals(res_attendu,res);

    }



}