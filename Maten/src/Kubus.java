public class Kubus extends Balk {
    public Kubus(double lengte) {
        super(lengte, lengte, lengte);
    }

    @Override
    public double omtrek() {
        return super.omtrek();
    }

    @Override
    public double oppervlakte() {
        return getLengte() * getLengte() * 6;
    }

    @Override
    public double volume() {
        return getLengte() * getLengte() * getLengte();
    }
}
