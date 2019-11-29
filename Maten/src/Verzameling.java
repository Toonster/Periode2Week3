import java.util.Random;

public class Verzameling {

    private Random random = new Random();
    private Figuur[] figuren;

    public Verzameling(int aantal) {
        figuren = new Figuur[aantal];
        maakFiguren();
    }

    private void maakFiguren() {

        Figuur.Soort[] soortFiguren = Figuur.Soort.values();

        for (int i = 0; i < figuren.length; i++) {
            Figuur.Soort figuur = soortFiguren[random.nextInt(soortFiguren.length)];
            double lengte = random.nextDouble() * 10;
            double breedte = random.nextDouble() * 10;
            double hoogte = random.nextDouble() * 10;
            switch (figuur) {
                case Punt:
                    this.figuren[i] = new Punt();
                    break;
                case Lijn:
                    this.figuren[i] = new Lijn(lengte);
                    break;
                case Rechthoek:
                    this.figuren[i] = new Rechthoek(lengte, breedte);
                    break;
                case Vierkant:
                    this.figuren[i] = new Vierkant(lengte);
                    break;
                case Cirkel:
                    this.figuren[i] = new Cirkel(lengte);
                    break;
                case Balk:
                    this.figuren[i] = new Balk(lengte, hoogte, breedte);
                    break;
                case Kubus:
                    this.figuren[i] = new Kubus(lengte);
                    break;
                default:
                    this.figuren[i] = new Bol(lengte);
            }
        }
    }

    public double totaleOmtrek() {
        double somTotaleOmtrek = 0;
        for (Figuur figuur : figuren) {
            if (figuur instanceof Omtrek) {
                somTotaleOmtrek += ((Omtrek) figuur).omtrek();
            }
        }
        return somTotaleOmtrek;
    }

    public double totaleOppervlakte() {
        double somTotaleOppervlakte = 0;
        for (Figuur figuur: figuren) {
            if (figuur instanceof Oppervlakte) {
                somTotaleOppervlakte += ((Oppervlakte) figuur).oppervlakte();
            }
        }
        return somTotaleOppervlakte;
    }
    public double totaalVolume() {
        double somTotaalVolume = 0;
        for (Figuur figuur : figuren) {
            if (figuur instanceof Oppervlakte) {
                somTotaalVolume += ((Oppervlakte) figuur).oppervlakte();
            }
        }
        return somTotaalVolume;
    }
}
