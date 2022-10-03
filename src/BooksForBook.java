/**
 * Базовый уровень. Вариант 3. Задание: Вывести данные о книгах, в которых количество страниц больше 150.
 */

import java.util.Arrays;

public class BooksForBook {
    Book[] books;

    public BooksForBook() {
        this.books = new Book[0];
    }

    public void addBook(Book book) {
        Book[] temp = Arrays.copyOf(books, books.length + 1);
        temp[books.length] = book;
        books = temp;
    }

    public BooksForBook More150Pages(int pages) {
        BooksForBook temp = new BooksForBook();
        for (Book book : books) {
            if (book.getPages() > pages)
                temp.addBook(book);
        }
        return temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(books) + "\n";
    }
}
