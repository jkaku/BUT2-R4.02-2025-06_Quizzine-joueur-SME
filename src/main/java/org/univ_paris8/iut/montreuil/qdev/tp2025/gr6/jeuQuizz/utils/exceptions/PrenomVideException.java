package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions;

public class PrenomVideException extends Exception{

    public PrenomVideException(){
        super("Le prenom ne peux pas être vide.");
    }
}
