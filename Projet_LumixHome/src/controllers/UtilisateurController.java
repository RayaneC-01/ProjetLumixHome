package controllers;

import models.Utilisateur;

public class UtilisateurController {
    private final Utilisateur utilisateur;
    public UtilisateurController(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void inscrireUtilisateur(String nom, String prenom, String email, String motDePasse) {
        utilisateur.inscription_utilisateur(nom, prenom, email, motDePasse);
    }

    public boolean authentifierUtilisateur(String email, String motDePasse) {
        return utilisateur.authentification_utilisateur(email, motDePasse);
    }

    public void deconnecterUtilisateur() {
        utilisateur.deconnexion();
    }

    public void reinitialiserMotDePasse(String email) {
        utilisateur.reinitialiserMotDePasse(email);
    }
}
