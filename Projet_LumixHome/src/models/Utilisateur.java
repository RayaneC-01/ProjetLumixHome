package models;

public class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private boolean estConnecte;

    public void inscription_utilisateur(String nom, String prenom, String email, String motDePasse) {
        // Implementation here
    }

    public boolean authentification_utilisateur(String email, String motDePasse) {
        // Implementation here
        return false;
    }

    public void deconnexion() {
        // Implementation here
    }

    public void reinitialiserMotDePasse(String email) {
        // Implementation here
    }
}
