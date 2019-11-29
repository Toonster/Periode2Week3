package be.kdg.prog1.ootech.week3.product;

public class Shirt extends Product {
    public static final double BTW_PERCENTAGE = 0.21;

    private Size size;
    private Gender gender;

    public Shirt(String code, String description, double price, Size size, Gender gender) {
        super(code, description, price);
        this.size = size;
        this.gender = gender;
    }

    @Override
    public double getBtw() {
        return BTW_PERCENTAGE;
    }
}
