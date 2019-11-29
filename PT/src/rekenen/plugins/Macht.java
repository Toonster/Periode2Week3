package rekenen.plugins;

public class Macht implements Plugin {

    @Override
    public String getCommand() {
        return "^";
    }

    @Override
    public double bereken(double x, double y) {
        return Math.pow(x, y);
    }
}
