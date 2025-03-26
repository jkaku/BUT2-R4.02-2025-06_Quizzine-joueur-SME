package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions;

public class PseudoVideException extends Exception{

    public PseudoVideException(){
        super("Le pseudo ne peut pas être vide.");
    }
}
