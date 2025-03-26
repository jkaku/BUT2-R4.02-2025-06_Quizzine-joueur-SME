package org.univ_paris8.iut.montreuil.qdev.tp2025.gr6.jeuQuizz.utils.exceptions;

public class PrenomAvecNombreException extends Exception{

    public PrenomAvecNombreException(){
        super("Le prenom de doit pas contenir de nombre.");
    }
}
