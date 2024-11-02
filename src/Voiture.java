import java.util.ArrayList;

public class Voiture extends Vehicule{
    public enum Modele{
        Berline,Break,Cabriole;
    }
    String couleur="Blanche";
    int nbPorte=3;
    Modele modele=Modele.Berline;
    ArrayList< String> voitures=new ArrayList<>();

    public Voiture(String marque, String numeroImmat, int vitesseMax, int vitesseActuelle) {
        super(marque, numeroImmat, vitesseMax, vitesseActuelle);
    }


    public Voiture(String marque, String numeroImmat, int vitesseMax, int vitesseActuelle, String couleur, int nbPorte, String modele) {
        super(marque, numeroImmat, vitesseMax, vitesseActuelle);
        this.couleur = couleur;
        this.nbPorte = nbPorte;
        this.modele = Modele.valueOf(modele);
    }
    public void customiser(String couleur,int vitesseMax) {
        this.couleur = couleur;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "couleur='" + couleur + '\'' +
                ", nbPorte=" + nbPorte +
                ", modele=" + modele +
                ", marque='" + marque + '\'' +
                ", numeroImmat='" + numeroImmat + '\'' +
                ", vitesseMax=" + vitesseMax +
                ", vitesseActuelle=" + vitesseActuelle +
                '}';
    }
}
