public class Bol extends Cirkel implements Volume {
    public Bol(double straal) {
        super(straal);
    }

    @Override
    public String getNaam() {
        return "Bol";
    }

    @Override
    public double oppervlakte() {
        return 4 * Math.PI * Math.pow(getStraal(),2);
    }

    @Override
    public double volume() {
        return (4*Math.PI*Math.pow(getStraal(),3))/3;
    }
}
