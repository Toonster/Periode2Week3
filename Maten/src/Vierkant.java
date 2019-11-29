public class Vierkant extends Rechthoek {
    public Vierkant(double lengte) {
        super(lengte, lengte);
    }

    @Override
    public String getNaam() {
        return "Vierkant";
    }
}
