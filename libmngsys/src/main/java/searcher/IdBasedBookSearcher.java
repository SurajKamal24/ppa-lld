package searcher;

import book.BookCopy;

import java.util.List;

public class IdBasedBookSearcher implements BookSearcher{

    private final int Id;

    public IdBasedBookSearcher(int id) {
        Id = id;
    }

    @Override
    public List<BookCopy> search() {
        return null;
    }
}
