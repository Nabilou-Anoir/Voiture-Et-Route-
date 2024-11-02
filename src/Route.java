import java.util.ArrayList;

public class Route{
    ArrayList<Vehicule> vehiculesRoute;

    int capaciteMax;
    int vitesseMaxR;

    public ArrayList<Vehicule> getVehiculesRoute() {
        return vehiculesRoute;
    }

    public int getVitesseMaxR() {
        return vitesseMaxR;
    }
    public Boolean entrer (Vehicule vehicule) {
        if (capaciteMax>vehiculesRoute.size()) {
            this.vehiculesRoute.add(vehicule);
               return true;
        }
        return false;

    }
    public ArrayList<Vehicule> controleRadar () {
        ArrayList<Vehicule> voitureExces = new ArrayList<>();
        for (int i = 0; i < vehiculesRoute.size(); i++) {
            if (vitesseMaxR<vehiculesRoute.get(i).getVitesseActuelle()) {
                voitureExces.add(vehiculesRoute.get(i));
            }
        }
        return voitureExces;
    }
    public void ralentirCamion() {
        for (Vehicule vehicule : vehiculesRoute) {
            if (vehicule.equals());

        }




    }
}
