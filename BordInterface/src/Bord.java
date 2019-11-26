public class Bord implements Berekenbaar {

    private String materiaal;
    private String kleur;

    public Bord(String materiaal, String kleur) {
        this.materiaal = materiaal;
        this.kleur = kleur;
    }

    @Override
    public double oppervlakte() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("%-9s %-6s", materiaal, kleur);
    }
}
