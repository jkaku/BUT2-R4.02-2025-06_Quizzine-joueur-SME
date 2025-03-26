package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions;

public class PseudoUtiliseException extends Exception{

    public PseudoUtiliseException(){
        super("Le pseudo ne peux etre similaire à un autres.");
    }
}
