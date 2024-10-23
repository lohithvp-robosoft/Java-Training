package Task4.Question6;

public class Book {
    String title, author;
    int price_int = -1;
    float price_float = -1f;

    Book(String title, String author, int price_int) {
        this.author = author;
        this.title = title;
        this.price_int = price_int;
    }

    Book(String title, String author, float price_float) {
        this.author = author;
        this.title = title;
        this.price_float = price_float;
    }

    void display() {
        System.out.println("{\n" +
                "Author :" + author + "\n" +
                "Title :" + title + "\n" +
                "Price :" + (price_int == -1 ? price_float : price_int) + "\n}");
    }
}
