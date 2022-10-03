import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Main {

    /**
     * Базовый уровень. Вариант 3. Задание: Вывести данные о книгах, в которых количество страниц больше 150.
     */
    public static final int PAGES_START_LIMIT = 150;
    public static final int FILM_LENGHT_START_LIMIT = 100;
    public static final int HOURS_START_LIMIT = 18;
    public static final int MINUTES_START_LIMIT = 0;

    public static void More150Pages(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPages() > PAGES_START_LIMIT)
                System.out.println("\n" + books[i].ToString());
        }
    }

    /**
     * Средний уровень. Вариант 3. Задание: Вывести данные о фильмах, начинающихся после 18:00
     * и продолжительностью сеанса более 1 часа 40 минут.
     */
    public static void GetMovies(Cinema[] movies) {
        LocalDateTime dt;
        int lenght;
        var yesno = false;
        for (int i = 0; i < movies.length; i++) {
            lenght = movies[i].getLength();
            dt = movies[i].getSeansDate();
            if (lenght > FILM_LENGHT_START_LIMIT && dt.getHour() >= HOURS_START_LIMIT && dt.getMinute() > MINUTES_START_LIMIT) {
                System.out.println("\n" + movies[i].ToString());
                yesno = true;
            }
        }
        if (!yesno) {
            System.out.print("None");
        }
    }


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
            System.out.println("\n" + books[i].ToString());
        }
        System.out.println("\nBooks with more than 150 pages:");
        More150Pages(books);

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
            System.out.println("\n" + movies[i].ToString());
        }
        System.out.print("\n1 h 40 min long films starting after 18:00: ");
        GetMovies(movies);

        Books150 books150 = new Books150();
           books150.addBook(books[2]);
           books150.addBook(books[3]);
        System.out.println(books150.More150Pages(PAGES_START_LIMIT));
    }
}
