public class Dieren {

    private Dier[] dieren = new Dier[100];
    private int aantal;

    public void add(Dier dier) {
        if (aantal < 100) {
            dieren[aantal] = dier;
            aantal++;
        } else {
            System.out.println("Vol!");
        }
    }

    public void toon() {
        for (int i = 0; i < aantal; i++) {
            System.out.print(dieren[i]);
            System.out.println();
        }
    }
}
