package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions;

public class AnneeNaissanceEntre1950EtActuelleException extends Exception{

    public AnneeNaissanceEntre1950EtActuelleException(){
        super("L'année de naissance doit être entre 1950 et l'année actuelle");
    }

}
