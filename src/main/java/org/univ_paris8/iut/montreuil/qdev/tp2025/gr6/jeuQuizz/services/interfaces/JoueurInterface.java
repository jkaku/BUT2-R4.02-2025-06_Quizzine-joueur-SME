package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ReponseJoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto.ScoreDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.enums.Langue;

public interface JoueurInterface {


    public ReponseJoueurDTO ajouterJoueurDTO(String nom, String prenom, ScoreDTO score,int annéeNaissance,String centreInteret, Langue languePrefere);
}
