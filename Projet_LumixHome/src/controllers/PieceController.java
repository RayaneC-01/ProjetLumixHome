package controllers;

import models.Piece;
import models.Equipement;

public class PieceController {
    private Piece piece;

    public PieceController(Piece piece) {
        this.piece = piece;
    }

    public void ajouterEquipement(Equipement equipement) {
        piece.ajouterEquipement(equipement);
    }

    public void supprimerEquipement(Equipement equipement) {
        piece.supprimerEquipement(equipement);
    }
}
