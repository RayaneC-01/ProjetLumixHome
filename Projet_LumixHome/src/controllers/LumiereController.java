package controllers;

import models.Lumiere;

public class LumiereController {
    private Lumiere lumiere;

    public LumiereController(Lumiere lumiere) {
        this.lumiere = lumiere;
    }

    public void allumerOuEteindreLumiere() {
        if (lumiere.verifierEtatLumiere()) {
            lumiere.eteindreLumiere();
        } else {
            lumiere.allumerLumiere();
        }
        lumiere.envoyerEtatApplication();
    }

    public void afficherEtatLumiere() {
        System.out.println("Lumière allumée : " + lumiere.verifierEtatLumiere());
    }
}
