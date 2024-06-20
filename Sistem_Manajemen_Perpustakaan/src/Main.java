import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        Library library = new Library();

        // Menambahkan buku
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "12345678");
        Book book2 = new Book("1984", "George Orwell", "987654321");
        library.addBook(book1);
        library.addBook(book2);

        // Menambahkan anggota
        Member member1 = new Member("1", "Alice", "123 Wonderland",  "123-456-7890");
        Member member2 = new Member("2", "Bob", "456 Nowhere", "098-765-4321");
        library.addMember(member1);
        library.addMember(member2);

        // Meminjam buku
        library.loanBook(book1, member1);

        // Daftar buku, anggota, dan peminjaman
        System.out.println("Books in the library : ");
        library.listBooks();
        System.out.println("\nMembers of the library : ");
        library.listMembers();
        System.out.println("\nLoans in the library : ");
        library.listLoans();

        //Mengembalikan buku
        library.returnBook(book1);

        // Daftar peminjaman setelah pengembalian
        System.out.println("\nLoans in the library after returning the book: ");
        library.listLoans();
    }
}