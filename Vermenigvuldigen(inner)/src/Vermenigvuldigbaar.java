public interface Vermenigvuldigbaar {

    int vermenigvuldig(int eersteInteger, int tweedeInteger);

    default int kwadraat(double getal) {
        return (int)(getal*getal);
    }

    default int derdeMacht(double getal) {
        return (int) (kwadraat(getal) * getal);
    }
}
