public class Camion extends Vehicule {
    public Camion(String marque, String numeroImmat, int vitesseMax, int vitesseActuelle) {
        super(marque, numeroImmat, vitesseMax, vitesseActuelle);
    }

    int poidsChargeMax;
    int poidsChargeCourant;

    public Camion(String marque, String numeroImmat, int vitesseMax, int vitesseActuelle, int poidsChargeMax, int poidsChargeCourant) {
        super(marque, numeroImmat, vitesseMax, vitesseActuelle=0);
        this.poidsChargeMax = poidsChargeMax;
        this.poidsChargeCourant = poidsChargeCourant;
    }
    public void charger(int ajouterPoids){
        if(poidsChargeCourant+ajouterPoids>poidsChargeMax){
            poidsChargeCourant=poidsChargeMax;
        }
        else {
            poidsChargeCourant += ajouterPoids;
        }
    }

    @Override
    public String toString() {
        return "Camion{" +
                "vitesseActuelle=" + vitesseActuelle +
                ", vitesseMax=" + vitesseMax +
                ", numeroImmat='" + numeroImmat + '\'' +
                ", marque='" + marque + '\'' +
                ", poidsChargeCourant=" + poidsChargeCourant +
                ", poidsChargeMax=" + poidsChargeMax +
                '}';
    }

    public void decharger(int retraitPoids){
        if(poidsChargeMax-retraitPoids>poidsChargeCourant) {
            poidsChargeMax = poidsChargeCourant;
        }
        else {
            poidsChargeMax -= retraitPoids;
        }

    }

}
