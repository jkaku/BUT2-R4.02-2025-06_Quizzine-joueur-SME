package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto;

public class JoueurDTO {
    protected int compteur = 0;
    private int id;
    private String nom;
    private String prenom;
    private int score;
    private String pseudo;
    private int annéeNaissance;
    private String centreInteret;
    private Enum languePrefere;

    public JoueurDTO(String nom,String prenom,String pseudo,int annéeNaissance,String centreInteret,Enum languePrefere) {
        this.id = compteur;
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.annéeNaissance = annéeNaissance;
        this.centreInteret = centreInteret;
        this.languePrefere = languePrefere;
        this.score = 0;
        compteur++;
    }
}
