package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl.mock;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ReponseJoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.interfaces.JoueurInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions.NomAvecNombreException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions.PrenomAvecNombreException;

import java.util.ArrayList;

public class AjouterJoueurNomPrenomAvecChiffresMock implements JoueurInterface {
    @Override
    public ReponseJoueurDTO ajouterJoueurDTO(String nom, String prenom, String pseudo,ScoreDTO score, int annéeNaissance, String centreInteret, Langue languePrefere) {
        ArrayList<Exception> erreurs = new ArrayList<>();
        erreurs.add(new NomAvecNombreException());
        erreurs.add(new PrenomAvecNombreException());
        return new ReponseJoueurDTO(null,erreurs);
    }
}
