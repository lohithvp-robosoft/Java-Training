package Task6.Question2;

import java.util.HashMap;

public class BookDetail {
    private int id;
    String title;
    HashMap<String, Object> author = new HashMap<>();


    BookDetail(int id, String title, String authorName, int authorAge) {
        this.id = id;
        this.title = title;
        this.author.put("name", authorName);
        this.author.put("age", authorAge);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HashMap<String, Object> getAuthor() {
        return author;
    }

    public void setAuthor(HashMap<String, Object> author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "{" + "id :" + id + ", title: " + title + ", author: " + author;

    }

}
