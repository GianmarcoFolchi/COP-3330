package hw4;

public class BookstoreBook extends Book {
    private double price;
    public BookstoreBook(String author, String title, String isbn, double price, int year) {
        super(author, title, isbn, year);
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String createCode() {
        //[isbn-author-price]
        return "[" + getIsbn() + "-" + getAuthor() + "-" + getPrice() + "]";
    }

    @Override
    public String toString() {
//the above line prints: 23654585: the origin of species by emily jones published in 1965, $89.99
        return getIsbn() + ": " + getTitle() + " by " + getAuthor() + " published in " + getYear() + ",  $" + getPrice();
    }
}
