/**
 * Средний уровень. Вариант 3. Задание: Вывести данные о фильмах, начинающихся после 18:00
 * и продолжительностью сеанса более 1 часа 40 минут.
 */

import java.time.LocalDateTime;
import java.util.Arrays;

public class MoviesForCinema {
    Cinema[] movies;

    public MoviesForCinema() {
        this.movies = new Cinema[0];
    }

    public void addMovie(Cinema movie) {
        Cinema[] temp = Arrays.copyOf(movies, movies.length + 1);
        temp[movies.length] = movie;
        movies = temp;
    }

    public MoviesForCinema Sorting(int length, int hours, int minutes) {
        MoviesForCinema temp = new MoviesForCinema();
        for (Cinema movie : movies) {
            if (movie.getLength() > length && movie.getSeansDate().getHour() >= hours && movie.getSeansDate().getMinute() > minutes)
                temp.addMovie(movie);
        }
        return temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(movies) + "\n";
    }
}


