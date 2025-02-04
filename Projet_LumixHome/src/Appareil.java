public class Appareil {
    private int id;
    private int etatBatterie;
    private String positionInterrupteur;

    // Constructeur
    public Appareil(int id, int etatBatterie, String positionInterrupteur) {
        this.id = id;
        this.etatBatterie = etatBatterie;
        this.positionInterrupteur = positionInterrupteur;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEtatBatterie() {
        return etatBatterie;
    }

    public void setEtatBatterie(int etatBatterie) {
        this.etatBatterie = etatBatterie;
    }

    public String getPositionInterrupteur() {
        return positionInterrupteur;
    }

    public void setPositionInterrupteur(String positionInterrupteur) {
        this.positionInterrupteur = positionInterrupteur;
    }

    // Méthodes
    public String detecterStatutLumiere() {
        return "Lumière " + (positionInterrupteur.equals("ON") ? "allumée" : "éteinte");
    }

    public void transmettreDonnees(String action) {
        if (action.equals("ON") || action.equals("OFF")) {
            this.positionInterrupteur = action;
        }
    }
}
