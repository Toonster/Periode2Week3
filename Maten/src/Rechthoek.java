public class Rechthoek extends Figuur implements Oppervlakte, Omtrek{

    private double lengte;
    private double breedte;

    public Rechthoek(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    @Override
    public String getNaam() {
        return "Rechthoek";
    }

    @Override
    public double omtrek() {
        return (lengte+breedte)*2;
    }

    @Override
    public double oppervlakte() {
        return lengte*breedte;
    }
}
