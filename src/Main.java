import java.time.LocalDateTime;
import java.time.Month;

public class Main {


    public static void main(String[] args) {
        Book[] books = new Book[6];
        /**
         * Пример с количеством страниц меньше 150
         */
        books[0] = new Book("H.P.Lovecraft", "Reanimator", 100, 3000, 1922);
        /**
         * Пример с подходящими книгами
         */
        books[1] = new Book("Herman Melville", "Moby-Dick", 654, 5000, 1851);
        books[2] = new Book("Charles Maturin", "Melmoth the Wanderer", 659, 2000, 1820);
        /**
         * Пример с значением тиража меньше минимума и года издания больше максимума
         */
        books[3] = new Book("Victor Hugo", "Les Miserables", 1462, 0, 2023);
        /**
         * Пример з количеством страниц больше максимума и с годом издания меньше минимума.
         */
        books[4] = new Book("Unknown", "Unknown", 5000, 1, 1000);
        /**
         * Пример, когда значения не заданы (кроме названия)
         */
        books[5] = new Book();
        books[5].setName("Something Without Values");
        System.out.println("ALL BOOKS:");
        for (int i = 0; i < books.length; i++) {
            System.out.println("\n" + books[i]);
        }
        System.out.println("\nBooks with more than 150 pages:");
        BooksForBook books2 = new BooksForBook();
        for (int i = 0; i < books.length; i++) {
            books2.addBook(books[i]);
        }
        System.out.println(books2.More150Pages(150));

        Cinema[] movies = new Cinema[9];
        /**
         * Пример с подходящим к условию времени, но меньшей продолжительностью
         */
        movies[0] = new Cinema("Frankenstein 1931", LocalDateTime.of(2022, Month.OCTOBER, 3, 18, 30, 0), 71, FilmGenres.horror, 262007);
        movies[1] = new Cinema("Bride of Frankenstein", LocalDateTime.of(2022, Month.OCTOBER, 3, 19, 40, 0), 75, FilmGenres.horror, 397000);
        /**
         * Пример с подходящей продолжительностью, но не подходящим временем
         */
        movies[2] = new Cinema("Bride of Reanimator", LocalDateTime.of(2022, Month.OCTOBER, 4, 18, 0, 0), 101, FilmGenres.horror, 3000000);
        /**
         * Подходящие примеры
         */
        movies[3] = new Cinema("Les Miserables", LocalDateTime.of(2022, Month.OCTOBER, 4, 18, 20, 0), 158, FilmGenres.musical, 61000000);
        movies[4] = new Cinema("King of Devil's Island", LocalDateTime.of(2022, Month.OCTOBER, 4, 22, 30, 0), 115, FilmGenres.drama, 6400000);
        /**
         * Пример с бюджетом и длительностью больше максимума
         */
        movies[5] = new Cinema("Avatar", LocalDateTime.of(2022, Month.OCTOBER, 5, 12, 30, 0), 201, FilmGenres.scifi, 400000001);
        /**
         * Пример с бюджетом и длительностью меньше минимума
         */
        movies[6] = new Cinema("Minimum", LocalDateTime.of(2022, Month.OCTOBER, 5, 17, 30, 0), 20, FilmGenres.arthouse, 120);
        /**
         * Пример с датой ранее текущей
         */
        movies[7] = new Cinema("WrongDate", LocalDateTime.of(2021, Month.OCTOBER, 6, 17, 30, 0), 110, FilmGenres.comedy, 120000);
        /**
         * Пример с незадаными значениями (кроме названия)
         */
        movies[8] = new Cinema();
        movies[8].setTitle("Movie Without Values");
        System.out.println("\nALL MOVIES:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println("\n" + movies[i]);
        }
        System.out.print("\n1 h 40 min long films starting after 18:00: ");
        MoviesForCinema cinemas = new MoviesForCinema();
        for (int i = 0; i < movies.length; i++) {
            cinemas.addMovie(movies[i]);
        }
        System.out.println(cinemas.Sorting(100, 18, 0));

    }
}
