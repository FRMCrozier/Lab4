/**
 * Базовый уровень. Вариант 3. Поля класса:
 * Автор
 * Количество страниц
 * Тираж
 * Год издания
 */
public class Book {
    public static final int MIN_PAGES = 10;
    public static final int MAX_PAGES = 4000;
    public static final int MIN_EDITION = 1;
    public static final int MIN_YEAR = 1455;
    public static final int MAX_YEAR = 2022;
    String author = "";
    String name = "";
    private int pages = 0;
    private int edition = 0;
    private int year = 0;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        if (pages < MIN_PAGES)
            this.pages = MIN_PAGES;
        else if (pages > MAX_PAGES)
            this.pages = MAX_PAGES;
        else
            this.pages = pages;
    }

    public int getEdition() {
        return this.edition;
    }

    public void setEdition(int edition) {
        if (edition < MIN_EDITION)
            this.edition = MIN_EDITION;
        else
            this.edition = edition;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < MIN_YEAR)
            this.year = MIN_YEAR;
        else if (year > MAX_YEAR)
            this.year = MAX_YEAR;
        else
            this.year = year;
    }

    public Book() {
    }

    public Book(String author, String name, int pages, int edition, int year) {
        setAuthor(author);
        setName(name);
        setPages(pages);
        setEdition(edition);
        setYear(year);
    }

    @Override
    public String toString() {
        return "Author: " + author + "\nTitle: " + name + "\nNumber of pages: " + pages + "\nEdition: " + edition + "\nRelease year: " + year + "\n";
    }
}
