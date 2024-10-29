//2.[
//        {
//        "id": 1,
//        "title": "Java Programming",
//        "author": {
//        "name": "Alice Smith",
//        "age": 34
//        }
//        },
//        {
//        "id": 2,
//        "title": "Python Basics",
//        "author": {
//        "name": "Bob Jones",
//        "age": 45
//        }
//        }
//        ]
//        i.write a method to filter out books by authors older than a certain age.
//        ii.Write a method that counts how many books have authors within a specific age range (e.g., 30-40 years).

package Task6.Question2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q2 {
    public static List<BookDetail> authorAgeFilter(ArrayList<BookDetail> bookList) {
        return bookList.stream().filter(book -> (int) (book.getAuthor().get("age")) > 40).toList();

    }


    public static int authorAgeRangeBooks(int startRange, int stopRange, List<BookDetail> bookList) {
        int count = 0;
        Iterator<BookDetail> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            int authorAge = (int) iterator.next().getAuthor().get("age");
            if (authorAge >= startRange && authorAge <= stopRange) count++;
        }
        return count;
    }

    public static void main(String[] args) {


        BookDetail book1 = new BookDetail(1, "Java Programming", "Alice Smith", 34);

        BookDetail book2 = new BookDetail(2, "Python Basics", "Bob Jones", 45);
        ArrayList<BookDetail> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);

        System.out.println(authorAgeFilter(bookList));
        System.out.println(authorAgeRangeBooks(30, 40, bookList));

    }
}
