import java.util.ArrayList;

public class ApplicationMobile {
    private String version;
    private Utilisateur utilisateurActif;
    private ArrayList<Appareil> appareils;

    // Constructeur
    public ApplicationMobile(String version) {
        this.version = version;
        this.appareils = new ArrayList<>();
    }

    // Getters et setters
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Utilisateur getUtilisateurActif() {
        return utilisateurActif;
    }

    public void setUtilisateurActif(Utilisateur utilisateurActif) {
        this.utilisateurActif = utilisateurActif;
    }

    // Méthodes
    public void afficherStatutLumiere(Appareil appareil) {
        System.out.println("Statut de l'appareil : " + appareil.detecterStatutLumiere());
    }

    public void afficherNiveauBatterie(Appareil appareil) {
        System.out.println("Niveau de batterie : " + appareil.getEtatBatterie() + "%");
    }

    public void controlerLumiere(Appareil appareil, String action) {
        appareil.transmettreDonnees(action);
        System.out.println("Commande envoyée : " + action);
    }
}
