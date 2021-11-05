package hw4;

public class Main {

    public static void main(String[] args) {
        Book b1 = new LibraryBook("Emily jones", "The OrigiN of SPEciEs", "23654585", 1965, "bio");
        Book b2 = new BookstoreBook("Emily Jones", "The Origin of SPEciEs", "23654585", 89.99,1965);

        System.out.println(b1.createCode());
        System.out.println(b2.createCode());

    }

}
