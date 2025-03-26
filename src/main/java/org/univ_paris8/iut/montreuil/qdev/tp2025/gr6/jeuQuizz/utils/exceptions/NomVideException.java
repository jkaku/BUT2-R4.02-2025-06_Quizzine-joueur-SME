package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions;

public class NomVideException extends Exception {
    public NomVideException () {
        super("Le nom ne peux pas être vide.");
    }
}
