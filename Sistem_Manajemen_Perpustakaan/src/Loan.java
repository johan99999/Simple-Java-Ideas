import java.time.LocalDate;

public class Loan {
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Loan(Book book, Member member, LocalDate borrowDate) {
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = null;
    }

    // Getter dan Setter
    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
        this.book.returnBook();
        ;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "book = " + book +
                ", member = " + member +
                ", borrowDate = " + borrowDate +
                ", returnDate = " + returnDate +
                '}';
    }
}
