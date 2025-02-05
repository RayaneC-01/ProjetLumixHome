package controllers;

import models.Capteur;

public class CapteurController {
    private Capteur capteur;

    public CapteurController(Capteur capteur) {
        this.capteur = capteur;
    }

    public void detecterEtat() {
        capteur.detecterEtat();
    }

    public void envoyerDonnees(String donnees) {
        capteur.envoyerDonnees(donnees);
    }
}
