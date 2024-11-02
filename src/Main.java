//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Vehicule v1 =new Vehicule("Renault", "123AB81",100,0);
          System.out.println(v1.toString());
       Vehicule v2=new Vehicule("Citroen","1642BZ18",140,0);
          System.out.println(v2.toString());
       v1.accelerer(20);
          System.out.println(v1.toString());
       v2.accelerer(100);
          System.out.println(v2.toString());
       v1.freiner(30);
          System.out.println(v1.toString());
       v2.accelerer(50);
          System.out.println(v2.toString());
       Voiture vt1= new Voiture("Renault", "123AB81",190,0,"verte",5,"Berline");
         System.out.println(vt1.toString());
       Voiture vt2=new Voiture("Citroen", "1642BZ18",140,0,"Blanche",3,"Break");
          vt2.accelerer(100);
         System.out.println(vt2.toString());
       Camion c1= new Camion("Volvo","567ZA90",110,0,15000,1000);
         System.out.println(c1.toString());
         c1.charger(2000);
         c1.accelerer(80);
          System.out.println(c1.toString());
    }

}