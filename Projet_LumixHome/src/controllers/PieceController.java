package controllers;

import models.Equipement;
import models.Piece;

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


/*
 * LumiereController : Gère les interactions liées aux lumières.

UtilisateurController : Gère les actions des utilisateurs comme l'inscription et l'authentification.

PieceController : Gère les interactions liées aux pièces (ajout/suppression d'équipements dans une pièce).

EquipementController : Gère les interactions liées aux équipements (statut, niveau de batterie, etc.).

CapteurController : Gère les interactions liées aux capteurs (détection d'état, envoi de données).
 */