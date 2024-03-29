public abstract class Bord implements Berekenbaar {

    private String materiaal;
    private String kleur;

    public Bord(String materiaal, String kleur) {
        this.materiaal = materiaal;
        this.kleur = kleur;
    }

    @Override
    public abstract double oppervlakte();

    @Override
    public String toString() {
        return String.format("%-9s %-6s", materiaal, kleur);
    }
}
