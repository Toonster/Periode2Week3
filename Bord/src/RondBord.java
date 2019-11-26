public class RondBord extends Bord {

    private double diameter;

    public RondBord(String materiaal, String kleur, double diameter) {
        super(materiaal, kleur);
        this.diameter = diameter;
    }

    @Override
    public double oppervlakte() {
        return Math.pow(diameter / 2,2) * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("%-8s %s %.0fcm²\n", "Rond", super.toString(), oppervlakte());
    }
}
