package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto;

import java.util.ArrayList;
import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReponseJoueurDTO)) return false;
        ReponseJoueurDTO that = (ReponseJoueurDTO) o;
        return etat == that.etat && Objects.equals(joueurRetourne, that.joueurRetourne) && Objects.equals(listeErreurs, that.listeErreurs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(etat, joueurRetourne, listeErreurs);
    }
}
