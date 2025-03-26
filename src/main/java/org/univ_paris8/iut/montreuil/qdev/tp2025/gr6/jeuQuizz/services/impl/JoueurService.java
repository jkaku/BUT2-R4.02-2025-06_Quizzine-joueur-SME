package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ReponseJoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.interfaces.JoueurInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions.NomAvecNombreException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions.NomVideException;

import java.util.ArrayList;

public class JoueurService implements JoueurInterface {

    @Override
    public ReponseJoueurDTO ajouterJoueurDTO(String nom, String prenom,String pseudo, ScoreDTO score, int annéeNaissance, String centreInteret, Langue languePrefere) {
        ArrayList<Exception> listeExceptions = new ArrayList<>();
        JoueurDTO joueur = null;

        try {
            if (nom.isEmpty()){
                listeExceptions.add(new NomVideException());
            } else if (nom.contains(0,1,2,3,4,5,6,7,8,9)) {
                listeExceptions.add(new NomAvecNombreException());
            }
        }
        ReponseJoueurDTO rep = new ReponseJoueurDTO(null,listeExceptions);
    }
}
