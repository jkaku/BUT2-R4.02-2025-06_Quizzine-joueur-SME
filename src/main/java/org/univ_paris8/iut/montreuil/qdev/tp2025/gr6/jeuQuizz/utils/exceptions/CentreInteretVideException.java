package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions;

public class CentreInteretVideException extends Exception {
    public CentreInteretVideException() {
        super("Le centre d interet ne doit pas être vide");
    }
}
