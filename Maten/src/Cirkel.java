public class Cirkel extends Figuur implements Oppervlakte,Omtrek {
    private double straal;

    public Cirkel(double straal) {
        this.straal = straal;
    }

    public double getStraal() {
        return straal;
    }

    @Override
    public String getNaam() {
        return "Cirkel";
    }

    @Override
    public double omtrek() {
        return (straal+straal)*Math.PI;
    }

    @Override
    public double oppervlakte() {
        return straal*straal*Math.PI;
    }
}
