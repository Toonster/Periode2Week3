public class Film {

    class Acteur {

        private String naam;

        public Acteur(String naam) {
            this.naam = naam;
        }

        public void setTitel(String titel) {
            Film.this.titel = titel;
        }
    }

    private String titel;
    private int jaar;
    private Acteur acteur;
    private Acteur actrice;

    public Film(String titel, int jaar, String acteurNaam, String actriceNaam) {
        this.titel = titel;
        this.jaar = jaar;
        acteur = new Acteur(acteurNaam);
        actrice = new Acteur(actriceNaam);
    }

    public Film(String titel, int jaar) {
        this(titel, jaar, "", "");
    }

    public Film(String titel) {
        this(titel, 0, "", "");
    }

    public Film() {
        this("", 0, "", "");
    }

    public String getTitel() {
        return titel;
    }

    public String getJaar() {
        if (jaar == 0) {
            return "onbekend";
        }
        return Integer.toString(jaar);
    }

    public String getActeurNaam() {
        if (acteur.naam.isEmpty()) {
            return "onbekend";
        }
        return acteur.naam;
    }

    public String getActriceNaam() {
        if (actrice.naam.isEmpty()) {
            return "onbekend";
        }
        return actrice.naam;
    }

    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }

    public void setActrice(Acteur actrice) {
        this.actrice = actrice;
    }

    public void setJaar(int jaar) {
        this.jaar = jaar;
    }
}
