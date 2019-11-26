public class VierkantBord extends Bord {

    private double zijde;

    public VierkantBord(String materiaal, String kleur, double zijde) {
        super(materiaal, kleur);
        this.zijde = zijde;
    }

    @Override
    public double oppervlakte() {
        return zijde*zijde;
    }

    @Override
    public String toString() {
        return String.format("%-8s %s %.0fcm²\n", "Vierkant", super.toString(), oppervlakte());
    }
}
