package lib;

import book.BookCopy;
import dataaccessor.DBAccessor;
import dataaccessor.Results;
import dataaccessor.ResultsConverter;
import user.Member;


import java.util.List;

public class Library {

    private final DBAccessor dbAccessor;

    public Library(DBAccessor dbAccessor) {
        this.dbAccessor = dbAccessor;
    }


    public void addBookCopy(BookCopy bookCopy) {
        if (bookCopy == null) {
            //..
        }
        dbAccessor.insertBookCopy(bookCopy);
    }

    public void deleteBookCopy(BookCopy bookCopy){
        // validation
        // check if bookCopy is available
        // deletion
        if (dbAccessor.isCopyAvailable(bookCopy))
            dbAccessor.deleteBookCopy(bookCopy);
    }

    public void blockMember(Member member) {

    }

    public void issueBook(BookCopy bookCopy, Member member) {

    }

    public void submitBook(BookCopy bookCopy, Member member) {

    }

    public Member getBorrower(BookCopy bookCopy) {
        // validation
        Results results = dbAccessor.getBorrower(bookCopy);
        return ResultsConverter.convertToMember(results);

    }

    public List<BookCopy> getBorrowedBooks(Member member) {
        return null;
    }
}
