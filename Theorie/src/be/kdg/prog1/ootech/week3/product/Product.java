package be.kdg.prog1.ootech.week3.product;

public abstract class Product {
    protected String code;
    protected String description;
    protected double price;

    protected Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public final double getPrice() {
        return price * (1.0 + getBtw());
    }

    abstract double getBtw();
}
