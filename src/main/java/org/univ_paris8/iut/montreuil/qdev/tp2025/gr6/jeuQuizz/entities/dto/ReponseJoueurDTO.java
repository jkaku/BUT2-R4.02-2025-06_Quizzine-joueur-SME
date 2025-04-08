package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReponseJoueurDTO {
    private int etat = 0;
    private JoueurDTO joueurRetourne;
    private List<Exception> listeErreurs;

    public ReponseJoueurDTO(JoueurDTO joueurRetourne, List<Exception> listeErreurs) {
        this.joueurRetourne = joueurRetourne;
        this.listeErreurs = listeErreurs != null ? new ArrayList<>(listeErreurs) : new ArrayList<>();
    }

    public JoueurDTO getJoueurRetourne() {
        return joueurRetourne;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReponseJoueurDTO)) return false;
        ReponseJoueurDTO that = (ReponseJoueurDTO) o;

        // Comparer joueurRetourne
        if (!Objects.equals(joueurRetourne, that.joueurRetourne)) {
            return false;
        }

        // Comparer listeErreurs en vérifiant le contenu indépendamment de l'ordre
        if (listeErreurs.size() != that.listeErreurs.size()) {
            return false;
        }
        return listeErreurs.containsAll(that.listeErreurs) && that.listeErreurs.containsAll(listeErreurs);
    }


    @Override
    public int hashCode() {
        return Objects.hash(joueurRetourne, listeErreurs);
    }
}
