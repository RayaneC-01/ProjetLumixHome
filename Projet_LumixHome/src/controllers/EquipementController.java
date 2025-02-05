package controllers;

import models.Equipement;

public class EquipementController {
    private Equipement equipement;

    public EquipementController(Equipement equipement) {
        this.equipement = equipement;
    }

    public boolean obtenirStatut() {
        return equipement.getStatut();
    }

    public void changerStatut(boolean statut) {
        equipement.setStatut(statut);
    }

    public int verifierNiveauBatterie() {
        return equipement.obtenirNiveauBatterie();
    }

    public boolean detecterBatterieFaible() {
        return equipement.detecterBatterieFaible();
    }

    public void gererChargeBatterie() {
        equipement.gererChargeBatterie();
    }
}
