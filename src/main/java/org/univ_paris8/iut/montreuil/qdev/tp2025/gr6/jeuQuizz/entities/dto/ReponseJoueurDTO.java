package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto;

import java.util.ArrayList;

public class ReponseJoueurDTO {
    private int etat = 0;
    private JoueurDTO joueurRetourne;
    private ArrayList<Exception> listeErreurs;

    public ReponseJoueurDTO(JoueurDTO joueurRetourne, ArrayList<Exception> listeErreurs) {
        this.joueurRetourne = joueurRetourne;
        this.listeErreurs = listeErreurs;
    }

    public JoueurDTO getJoueurRetourne() {
        return joueurRetourne;
    }

    public ArrayList<Exception> getListeErreurs() {
        return listeErreurs;
    }

}
