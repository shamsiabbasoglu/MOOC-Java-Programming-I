public class Book {
    private final String author;
    private final String name;
    private final int pages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.name = title;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }
    
    

    @Override
    public String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
}
