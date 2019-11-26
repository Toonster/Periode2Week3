public class Arend implements Dier,Eierleggend, Vliegend {

    private String naam;
    private int aantalEierenPerJaar;
    private int maxSnelheid;
    private int duiksnelheid;

    public Arend(String naam, int aantalEierenPerJaar, int maxSnelheid, int duiksnelheid) {
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
        this.maxSnelheid = maxSnelheid;
        this.duiksnelheid = duiksnelheid;
    }

    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public int getAantalEierenPerJaar() {
        return aantalEierenPerJaar;
    }

    @Override
    public int getMaxVliegsnelheid() {
        return maxSnelheid;
    }

    public int getDuiksnelheid() {
        return duiksnelheid;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s%nEieren: %d%nSnelheid: %d km/h%nDuiksnelheid: %d km/h\n", naam, aantalEierenPerJaar, maxSnelheid, duiksnelheid);
    }
}
