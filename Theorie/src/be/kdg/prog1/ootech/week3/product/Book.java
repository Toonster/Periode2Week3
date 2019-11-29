package be.kdg.prog1.ootech.week3.product;

public class Book extends Product {
    public static final double BTW_PERCENTAGE = 0.06;

    private String author;
    private String title;

    public Book(String code, String description, double price, String author, String title) {
        super(code, description, price);
        this.author = author;
        this.title = title;
    }

    @Override
    public double getBtw() {
        return BTW_PERCENTAGE;
    }
}
