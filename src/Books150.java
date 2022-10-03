import java.util.Arrays;

public class Books150 {
    public static final int PAGES_START_LIMIT = 150;
    Book[] books;

    public Books150(){
        this.books = new Book[0];
    }
    public void addBook(Book book){
        Book[] temp = Arrays.copyOf(books,books.length+1);
        temp[books.length] = book;
        books = temp;
    }


  /*  public Book [] More150Pages(Book[] books) {
        Book [] temp = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPages() > PAGES_START_LIMIT)
                temp[i] = books[i];
        }
        return temp;
    } */
    public Books150 More150Pages(int pages) {
        Books150 temp = new Books150();
        for (Book book: books){
            if(book.getPages() > PAGES_START_LIMIT)
                temp.addBook(book);
        }
        return temp;
    }


}
