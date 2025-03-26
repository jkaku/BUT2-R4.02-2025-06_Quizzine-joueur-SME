package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ReponseJoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.interfaces.JoueurInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions.*;

import java.time.Year;
import java.util.ArrayList;

public class JoueurService implements JoueurInterface {

    @Override
    public ReponseJoueurDTO ajouterJoueurDTO(String nom, String prenom,String pseudo, int annéeNaissance, String centreInteret, Langue languePrefere) {
        ArrayList<Exception> listeExceptions = new ArrayList<>();
        JoueurDTO j1 = null;


        try {
            if (nom.isEmpty()){
                listeExceptions.add(new NomVideException());
            } else if (nom.matches(".*\\d.*")) {
                listeExceptions.add(new NomAvecNombreException());
            }
            
            if (prenom.isEmpty()){
                listeExceptions.add(new PrenomVideException());
            } else if (prenom.matches(".*\\d.*")) {
                listeExceptions.add(new NomAvecNombreException());
            }
            if (pseudo.isEmpty()){
                listeExceptions.add(new PseudoVideException());
            } else {
                for (JoueurDTO joueur : JoueurDTO){
                    if (joueur.getPseudo().equals(pseudo)){
                        listeExceptions.add(new PseudoUtiliseException());
                    }
                }
            }

            if (annéeNaissance>1950 && annéeNaissance< Year.now().getValue()){
                listeExceptions.add(new AnneeNaissanceEntre1950EtActuelleException());
            }

            if (centreInteret.isEmpty()){
                listeExceptions.add(new CentreInteretVideException());
            }

            for (Langue languePrefere : Langue) {

            }

            if (languePrefere.name().){}


        }
        return new ReponseJoueurDTO(j1,listeExceptions);
    }
}
