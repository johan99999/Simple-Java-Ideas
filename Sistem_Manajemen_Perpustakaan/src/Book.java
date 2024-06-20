public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isBorrowed;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }

    //Getter dan Setter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN(){
        return ISBN;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return "Book {" +
                "title =  '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", ISBN = '" + ISBN + '\'' +
                ", isBorrowed = " + isBorrowed +
                '}';
    }
}
