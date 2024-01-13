package book;

public class BookCopy {

    //Composition instead of inheritance. Inside a class, we have a reference to other class
    private final BookDetails bookDetails;
    private final int id;

    public BookCopy(BookDetails bookDetails, int id) {
        this.bookDetails = bookDetails;
        this.id = id;
    }
}
