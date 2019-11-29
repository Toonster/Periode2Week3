package rekenen.plugins;

public class Deling implements Plugin {

    @Override
    public String getCommand() {
        return "/";
    }

    @Override
    public double bereken(double x, double y) {
        return x / y;
    }
}
