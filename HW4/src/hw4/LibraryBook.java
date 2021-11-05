package hw4;

public class LibraryBook extends Book {
    //Book b1 = new LibraryBook(“Emily jones”, “The OrigiN of SPEciEs”, “23654585”, 1965, “bio”),
    String subject;
    public LibraryBook(String author, String title, String isbn, int year, String subject) {
        super(author, title, isbn, year);
        this.subject = subject.toLowerCase();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String createCode() {
        return "[" + getSubject() + "-" + getAuthor() + "-" + getTitle() + "-" + getYear()+"]";
    }

    @Override
    public String toString() {
//the above line should print: the origin of species by emily jones published in 1965, biology
        String temp = "biology";
        if (subject.equals("bio")) temp = "biology";
        if (subject.equals("acc")) temp = "accounting";
        if (subject.equals("psy")) temp = "psychology";
        if (subject.equals("rel")) temp = "religion";

        return getTitle() + " by " + getAuthor() + " published in " + getYear() + ", " + temp;
    }
}
