package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.entities.dto;

public class ScoreDTO {
    private int nombrePartie;
    private int nombreBonneReponses;
    private int moyenneG;
    private int duréeG;
    private int dernierePartiejouee;

    public ScoreDTO() {
        this.nombrePartie = 0;
        this.nombreBonneReponses = 0;
        this.moyenneG = 0;
        this.duréeG = 0;
        this.dernierePartiejouee = 0;
    }

}
