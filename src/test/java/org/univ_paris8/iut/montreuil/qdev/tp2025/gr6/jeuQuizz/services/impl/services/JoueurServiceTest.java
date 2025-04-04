package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl.services;

import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ReponseJoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl.mock.*;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.interfaces.JoueurInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions.*;

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
        res = joueurService.ajouterJoueurDTO("Kaku","Jonathan","jkaku",new ScoreDTO(),2006,"Basket", Langue.fr);
        assertEquals(res_attendu,res);
    }

    @Test
    void ajouterJoueurNomPrenomVide(){
        joueurService = new AjouterJoueurNomOuPrenomVideMock();
        ArrayList<Exception> erreurs = new ArrayList<>();
        erreurs.add(new PrenomVideException());
        erreurs.add(new NomVideException());
        res_attendu = new ReponseJoueurDTO(null,erreurs);
        res = joueurService.ajouterJoueurDTO("","","jkaku",new ScoreDTO(),2006,"Basket", Langue.fr);
        assertEquals(res_attendu,res);
    }

    @Test
    void ajouterJoueurNomPrenomAvecChiffres(){
        joueurService = new AjouterJoueurNomPrenomAvecChiffresMock();
        ArrayList<Exception> erreurs = new ArrayList<>();
        erreurs.add(new NomAvecNombreException());
        erreurs.add(new PrenomAvecNombreException());
        res_attendu = new ReponseJoueurDTO(null,erreurs);
        res = joueurService.ajouterJoueurDTO("gg4r68","frfgr8","jkaku",new ScoreDTO(),2006,"Basket", Langue.fr);
        assertEquals(res_attendu,res);
    }

    @Test
    void ajouterJoueurPseudoVide(){
        joueurService = new AjouterJoueurPseudoVideMock();
        ArrayList<Exception> erreurs = new ArrayList<>();
        erreurs.add(new PseudoVideException());
        res_attendu = new ReponseJoueurDTO(null,erreurs);
        res = joueurService.ajouterJoueurDTO("Jo","Ka","jkaku",new ScoreDTO(),2006,"Basket", Langue.fr);
        assertEquals(res_attendu,res);
    }

    @Test
    void ajouterJoueurLangueInconnue(){
        joueurService = new AjouterJoueurLangueInconnueMock();
        ArrayList<Exception> erreurs = new ArrayList<>();
        erreurs.add(new LanguePasReconnuException());
        res_attendu = new ReponseJoueurDTO(null,erreurs);
        res = joueurService.ajouterJoueurDTO("Jo","Ka","jkaku",new ScoreDTO(),2006,"Basket", Langue.all);
        assertEquals(res_attendu,res);
    }

    @Test
    void ajouterJoueurAnneeNaissanceImpossible(){
        joueurService = new AjouterJoueurAnneeNaissanceImpossibleMock();
        ArrayList<Exception> erreurs = new ArrayList<>();
        erreurs.add(new AnneeNaissanceEntre1950EtActuelleException());
        res_attendu = new ReponseJoueurDTO(null,erreurs);
        res = joueurService.ajouterJoueurDTO("Jo","Ka","jkaku",new ScoreDTO(),2028,"Basket", Langue.all);
        assertEquals(res_attendu,res);
    }








}