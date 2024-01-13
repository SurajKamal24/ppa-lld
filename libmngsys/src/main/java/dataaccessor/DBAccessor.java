package dataaccessor;

import book.BookCopy;

import java.awt.print.Book;
import java.lang.reflect.Member;
import java.util.List;

public class DBAccessor {

    public Results getBooksWithName(String bookName) {
    }

    public Results getBooksWithAuthorName(List<String> authors) {

    }

    public Results getMembersWithName(String memberName) {

    }

    public void insertBookCopy(BookCopy bookCopy) {

    }

    public void deleteBookCopy(BookCopy bookCopy) {

    }

    public void markAsBlocked(Member member) {

    }

    public void issueBookCopyToMember(BookCopy bookCopy, Member member) {

    }

    public void submitBookCopyFromMember(BookCopy bookCopy, Member member) {

    }

    public boolean isCopyAvailable(BookCopy bookCopy) {
        return true;
    }

    public Results getBorrower(BookCopy bookCopy) {
        return null;
    }

    public Results getBorrowedBooks(Member member) {
        return null;
    }
}
