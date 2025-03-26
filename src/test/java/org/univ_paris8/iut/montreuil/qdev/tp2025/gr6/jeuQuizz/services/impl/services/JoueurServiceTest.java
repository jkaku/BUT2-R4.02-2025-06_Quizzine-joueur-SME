package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl.services;

import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ReponseJoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl.mock.*;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.interfaces.JoueurInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.enums.Langue;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JoueurServiceTest {

    JoueurInterface joueurService;
    ReponseJoueurDTO res_attendu;
    ReponseJoueurDTO res;

    @Test
    void ajouterJoueurOKDTO(){
        joueurService = new AjouterJoueurOKMock();
        res_attendu = new ReponseJoueurDTO(new JoueurDTO("Kaku","Jonathan","jkaku",2006,"Basket", Langue.fr),new ArrayList<>());
        res = joueurService.ajouterJoueurDTO("Kaku","Jonathan",new ScoreDTO(),2006,"Basket", Langue.fr);
        assertEquals(res_attendu,res);
    }

    @Test
    void ajouterJoueurNomPrenomVide(){
        joueurService = new AjouterJoueurNomOuPrenomVideMock();
        ArrayList<String> erreurs = new ArrayList<>();
        erreurs.add("Nom ou prénom vide");
        res_attendu = new ReponseJoueurDTO(null,erreurs);
        res = joueurService.ajouterJoueurDTO("","",new ScoreDTO(),2006,"Basket", Langue.fr);
        assertEquals(res_attendu,res);
    }

    @Test
    void ajouterJoueurNomPrenomAvecChiffres(){
        joueurService = new AjouterJoueurNomPrenomAvecChiffresMock();
        ArrayList<String> erreurs = new ArrayList<>();
        erreurs.add("Nom ou prénom contient des chiffres");
        res_attendu = new ReponseJoueurDTO(null,erreurs);
        res = joueurService.ajouterJoueurDTO("gg4r68","frfgr8",new ScoreDTO(),2006,"Basket", Langue.fr);
        assertEquals(res_attendu,res);
    }

    @Test
    void ajouterJoueurPseudoVide(){
        joueurService = new AjouterJoueurPseudoVideMock();
        ArrayList<String> erreurs = new ArrayList<>();
        erreurs.add("Pseudo vide");
        res_attendu = new ReponseJoueurDTO(null,erreurs);
        res = joueurService.ajouterJoueurDTO("Jo","Ka",new ScoreDTO(),2006,"Basket", Langue.fr);
        assertEquals(res_attendu,res);
    }

    @Test
    void ajouterJoueurLangueInconnue(){
        joueurService = new AjouterJoueurLangueInconnueMock();
        ArrayList<String> erreurs = new ArrayList<>();
        erreurs.add("Langue préférée pas dans dictionnaire");
        res_attendu = new ReponseJoueurDTO(null,erreurs);
        res = joueurService.ajouterJoueurDTO("Jo","Ka",new ScoreDTO(),2006,"Basket", Langue.all);
        assertEquals(res_attendu,res);
    }

    @Test
    void ajouterJoueurAnneeNaissanceImpossible(){
        joueurService = new AjouterJoueurAnneeNaissanceImpossibleMock();
        ArrayList<String> erreurs = new ArrayList<>();
        erreurs.add("La date de naissance doit être entre 1950 et l'année actuelle");
        res_attendu = new ReponseJoueurDTO(null,erreurs);
        res = joueurService.ajouterJoueurDTO("Jo","Ka",new ScoreDTO(),2028,"Basket", Langue.all);
        assertEquals(res_attendu,res);
    }








}