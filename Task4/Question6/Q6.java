//6. Write a class Book that has multiple constructors to initialize the title, author, and price in different ways.

package Task4.Question6;

public class Q6 {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 4999);
        book1.display();

        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 3500.64F);
        book2.display();
    }
}
