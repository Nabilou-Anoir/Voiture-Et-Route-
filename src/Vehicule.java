import java.util.ArrayList;

public class Vehicule {
    String marque;
    String numeroImmat;
    int vitesseMax;
    int vitesseActuelle=0;
ArrayList<Vehicule> vehicules;

    public String getNumeroImmat() {
        return numeroImmat;
    }

    public String getMarque() {
        return marque;
    }

    public int getVitesseActuelle() {
        return vitesseActuelle;
    }

    public Vehicule(String marque, String numeroImmat, int vitesseMax, int vitesseActuelle) {
        this.marque=marque;
        this.numeroImmat=numeroImmat;
        this.vitesseMax=vitesseMax;
        this.vitesseActuelle=vitesseActuelle;


    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", numeroImmat='" + numeroImmat + '\'' +
                ", vitesseMax=" + vitesseMax +
                ", vitesseActuelle=" + vitesseActuelle +
                '}';
    }
    public void accelerer(int acceleration) {
        if (vitesseActuelle + acceleration >= vitesseMax) {
            vitesseActuelle = vitesseMax;
        } else {
            vitesseActuelle = vitesseActuelle+acceleration;
        }

    }
    public void freiner(int freine) {
        if (vitesseActuelle-freine < 0) {
            vitesseActuelle=0;
        } else {
            vitesseActuelle = vitesseActuelle-freine;
        }
    }
}
