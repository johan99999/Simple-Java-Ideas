import java.time.LocalDate;
import  java.util.ArrayList;
import  java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    // Methods untuk menambahkan buku, anggota, dan peminjaman
    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void loanBook(Book book, Member member) {
        if (!book.isBorrowed()) {
            Loan loan = new Loan(book, member, LocalDate.now());
            loans.add(loan);
            book.borrow();
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is already borrowed");
        }
    }

    public void returnBook(Book book) {
        for (Loan loan : loans) {
            if (loan.getBook().equals(book) && loan.getReturnDate() == null) {
                loan.returnBook();
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("This book was not borrowed from this library!");
    }

    // Methods untuk menampilkan daftar buku, anggota dan peminjaman
    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void listLoans() {
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }
}
