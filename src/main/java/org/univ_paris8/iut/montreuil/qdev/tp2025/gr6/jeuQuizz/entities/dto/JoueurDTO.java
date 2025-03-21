package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.enums.Langue;

import java.util.Objects;

public class JoueurDTO {
    private static int compteur = 0;
    private int id;
    private String nom;
    private String prenom;
    private ScoreDTO score;
    private String pseudo;
    private int annéeNaissance;
    private String centreInteret;
    private Langue languePrefere;

    public JoueurDTO(String nom,String prenom,String pseudo,int annéeNaissance,String centreInteret,Langue languePrefere) {
        this.id = compteur;
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.annéeNaissance = annéeNaissance;
        this.centreInteret = centreInteret;
        this.languePrefere = languePrefere;
        this.score = new ScoreDTO();
        compteur++;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public int getAnnéeNaissance() {
        return annéeNaissance;
    }

    public ScoreDTO getScore() {
        return score;
    }

    public Langue getLanguePrefere() {
        return languePrefere;
    }

    public String getCentreInteret() {
        return centreInteret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JoueurDTO)) return false;
        JoueurDTO joueurDTO = (JoueurDTO) o;
        return id == joueurDTO.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {return super.toString();}
}
