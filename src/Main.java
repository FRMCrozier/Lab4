import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    /**
     * Базовый уровень. Вариант 3. Задание: Вывести данные о книгах, в которых количество страниц больше 150.
     */
    public static final int PAGES_START_LIMIT = 150;
    public static final int FILM_LENGHT_START_LIMIT = 100;
    public static final int HOURS_START_LIMIT = 18;
    public static final int MINUTES_START_LIMIT = 0;
    public static void More150Pages(Books [] book){
        for (int i = 0; i < book.length; i++){
            if(book[i].getPages() > PAGES_START_LIMIT)
                System.out.println("\n" + book[i].ToString());
        }
        }
    /**
     * Средний уровень. Вариант 3. Задание: Вывести данные о фильмах, начинающихся после 18:00
     * и продолжительностью сеанса более 1 часа 40 минут.
     */
    public static void GetMovies(Cinema [] movie){
        LocalDateTime dt;
        int lenght;
        var yesno = false;
        for (int i = 0; i < movie.length; i++){
            lenght = movie[i].getLength();
            dt = movie[i].getSeansDate();
            if(lenght > FILM_LENGHT_START_LIMIT && dt.getHour() >= HOURS_START_LIMIT && dt.getMinute() > MINUTES_START_LIMIT){
                System.out.println("\n" + movie[i].ToString());
                yesno = true;
            }
        }
        if(!yesno){
            System.out.print("None");
        }
    }


    public static void main(String[] args) {
        Books [] book = new Books[6];
        /**
         * Пример с количеством страниц меньше 150
         */
        book[0] = new Books("H.P.Lovecraft", "Reanimator", 100, 3000, 1922);
        /**
         * Пример с подходящими книгами
         */
        book [1] = new Books("Herman Melville", "Moby-Dick", 654, 5000, 1851);
        book[2] = new Books("Charles Maturin", "Melmoth the Wanderer", 659, 2000, 1820);
        /**
         * Пример с значением тиража меньше минимума и года издания больше максимума
         */
        book[3] = new Books("Victor Hugo", "Les Miserables", 1462, 0, 2023);
        /**
         * Пример з количеством страниц больше максимума и с годом издания меньше минимума.
         */
        book[4] = new Books("Unknown", "Unknown", 5000, 1, 1000);
        /**
         * Пример, когда значения не заданы (кроме названия)
         */
        book[5] = new Books();
        book[5].setName("Something Without Values");
        System.out.println("ALL BOOKS:");
        for (int i = 0; i < book.length; i++){
                System.out.println("\n" + book[i].ToString());
        }
        System.out.println("\nBooks with more than 150 pages:");
        More150Pages(book);

        Cinema [] movie = new Cinema[9];
        /**
         * Пример с подходящим к условию времени, но меньшей продолжительностью
         */
        movie[0] = new Cinema("Frankenstein 1931",LocalDateTime.of(2022, Month.OCTOBER,3,18,30,0), 71, FilmGenres.horror,262007);
        movie[1] = new Cinema("Bride of Frankenstein", LocalDateTime.of(2022, Month.OCTOBER,3,19,40,0),75, FilmGenres.horror,397000);
        /**
         * Пример с подходящей продолжительностью, но не подходящим временем
         */
        movie[2] = new Cinema("Bride of Reanimator", LocalDateTime.of(2022, Month.OCTOBER,4,18,0,0),101, FilmGenres.horror,3000000);
        /**
         * Подходящие примеры
         */
        movie[3] = new Cinema("Les Miserables", LocalDateTime.of(2022, Month.OCTOBER,4,18,20,0),158, FilmGenres.musical,61000000);
        movie[4] = new Cinema("King of Devil's Island", LocalDateTime.of(2022, Month.OCTOBER,4,22,30,0),115, FilmGenres.drama,6400000);
        /**
         * Пример с бюджетом и длительностью больше максимума
         */
        movie[5] = new Cinema("Avatar", LocalDateTime.of(2022, Month.OCTOBER,5,12,30,0),201, FilmGenres.scifi,400000001);
        /**
         * Пример с бюджетом и длительностью меньше минимума
         */
        movie[6] = new Cinema("Minimum", LocalDateTime.of(2022, Month.OCTOBER,5,17,30,0),20, FilmGenres.arthouse,120);
        /**
         * Пример с датой ранее текущей
         */
        movie[7] = new Cinema("WrongDate", LocalDateTime.of(2021, Month.OCTOBER,6,17,30,0),110, FilmGenres.comedy,120000);
        /**
         * Пример с незадаными значениями (кроме названия)
         */
        movie[8] = new Cinema();
        movie[8].setTitle("Movie Without Values");
        System.out.println("\nALL MOVIES:");
        for (int i = 0; i < movie.length; i++){
            System.out.println("\n" + movie[i].ToString());
        }
        System.out.print("\n1 h 40 min long films starting after 18:00: ");
        GetMovies(movie);
    }
}
