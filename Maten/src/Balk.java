public class Balk extends Rechthoek implements Volume {
    private double hoogte;

    public Balk(double lengte, double breedte, double hoogte) {
        super(lengte, breedte);
        this.hoogte = hoogte;
    }

    public double getHoogte() {
        return hoogte;
    }

    @Override
    public String getNaam() {
        return "Balk";
    }

    @Override
    public double omtrek() {
        return super.omtrek();
    }

    @Override
    public double oppervlakte() {
        return 2*(getLengte()*getBreedte() + getLengte()*hoogte + hoogte*getBreedte());
    }

    @Override
    public double volume() {
        return getLengte() * getBreedte() * hoogte;
    }
}
