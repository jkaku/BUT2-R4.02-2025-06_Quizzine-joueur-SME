package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.impl.mock;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ReponseJoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.interfaces.JoueurInterface;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.enums.Langue;

import java.util.ArrayList;

public class AjouterJoueurOKMock implements JoueurInterface {

    @Override
    public ReponseJoueurDTO ajouterJoueurDTO(String nom, String prenom, ScoreDTO score, int annéeNaissance, String centreInteret, Langue languePrefere) {
        ReponseJoueurDTO retour = new ReponseJoueurDTO(new JoueurDTO(nom,prenom,"jkaku",annéeNaissance,centreInteret,languePrefere),new ArrayList<>());
        retour.getJoueurRetourne().setId(0);
        return retour;
    }
}
