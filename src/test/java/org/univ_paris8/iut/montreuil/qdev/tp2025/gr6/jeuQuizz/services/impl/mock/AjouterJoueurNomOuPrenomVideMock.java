package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl.mock;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ReponseJoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.interfaces.JoueurInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.enums.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions.NomVideException;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions.PrenomVideException;

import java.util.ArrayList;

public class AjouterJoueurNomOuPrenomVideMock implements JoueurInterface {
    @Override
    public ReponseJoueurDTO ajouterJoueurDTO(String nom, String prenom,String pseudo, int annéeNaissance, String centreInteret, Langue languePrefere) {
        ArrayList<Exception> erreurs = new ArrayList<>();
        erreurs.add(new NomVideException());
        erreurs.add(new PrenomVideException());
        return new ReponseJoueurDTO(null, erreurs);
    }
}


