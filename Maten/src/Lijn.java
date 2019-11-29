public class Lijn extends Figuur implements Omtrek {
    private double lengte;

    public Lijn(double lengte) {
        this.lengte = lengte;
    }

    @Override
    public String getNaam() {
        return "Lijn";
    }

    @Override
    public double omtrek() {
        return lengte;
    }
}
