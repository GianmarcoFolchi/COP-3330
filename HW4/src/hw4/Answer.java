//public class Main {
//
//    public static void main(String[] args) {
//        Book b1 = new LibraryBook("Emily jones", "The OrigiN of SPEciEs", "23654585", 1965, "bio");
//        Book b2 = new BookstoreBook("Emily Jones", "The Origin of SPEciEs", "23654585", 89.99,1965);
//
//        System.out.println(b1.createCode());
//        System.out.println(b2.createCode());
//
//    }
//
//}
//
//abstract class Book implements Codable {
//    private String author;
//    private String title;
//    private String isbn;
//    private int year;
//
//    protected Book(String author, String title, String isbn, int year) {
//        this.author = author.toLowerCase();
//        this.title = title.toLowerCase();
//        this.isbn = isbn.toLowerCase();
//        this.year = year;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//}
//
//
//public class BookstoreBook extends hw4.Book {
//    private double price;
//    public BookstoreBook(String author, String title, String isbn, double price, int year) {
//        super(author, title, isbn, year);
//        this.price = price;
//    }
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    @Override
//    public String createCode() {
//        //[isbn-author-price]
//        return "[" + getIsbn() + "-" + getAuthor() + "-" + getPrice() + "]";
//    }
//
//    @Override
//    public String toString() {
////the above line prints: 23654585: the origin of species by emily jones published in 1965, $89.99
//        return getIsbn() + ": " + getTitle() + " by " + getAuthor() + " published in " + getYear() + ",  $" + getPrice();
//    }
//}
//
//public interface Codable {
//    String createCode();
//}
//
//public class LibraryBook extends hw4.Book {
//    //Book b1 = new LibraryBook(“Emily jones”, “The OrigiN of SPEciEs”, “23654585”, 1965, “bio”),
//    String subject;
//    public LibraryBook(String author, String title, String isbn, int year, String subject) {
//        super(author, title, isbn, year);
//        this.subject = subject.toLowerCase();
//    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }
//
//    @Override
//    public String createCode() {
//        return "[" + getSubject() + "-" + getAuthor() + "-" + getTitle() + "-" + getYear()+"]";
//    }
//
//    @Override
//    public String toString() {
//        String temp = "biology";
//        if (subject.equals("bio")) temp = "biology";
//        if (subject.equals("acc")) temp = "accounting";
//        if (subject.equals("psy")) temp = "psychology";
//        if (subject.equals("rel")) temp = "religion";
//
//        return getTitle() + " by " + getAuthor() + " published in " + getYear() + ", " + temp;
//    }
//}