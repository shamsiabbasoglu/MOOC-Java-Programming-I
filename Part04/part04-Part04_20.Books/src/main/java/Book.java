public class Book {
    private String title;
    private int pages;
    private String year;

    public Book(String title, int pages, String year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + year;
    }
    
    
}
