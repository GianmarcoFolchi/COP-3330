package hw4;

abstract class Book implements Codable {
    private String author;
    private String title;
    private String isbn;
    private int year;

    protected Book(String author, String title, String isbn, int year) {
        this.author = author.toLowerCase();
        this.title = title.toLowerCase();
        this.isbn = isbn.toLowerCase();
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
