public class Notification {
    private int id;
    private String type;
    private String message;

    // Constructeur
    public Notification(int id, String type, String message) {
        this.id = id;
        this.type = type;
        this.message = message;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // Méthodes
    public void envoyerNotification(Utilisateur utilisateur) {
        System.out.println("Notification envoyée à " + utilisateur.getNom() + " : " + message);
    }
}
