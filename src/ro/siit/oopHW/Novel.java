package ro.siit.oopHW;

public class Novel extends Book {
    private final String genre;

    public Novel(String name, int numberOfPages, String genre) {
        super(name, numberOfPages);
        this.genre = genre;

    }

    public String toString() {
        return "Novel name: " + getName() + " ; " + "No. of pages: " + getNumberOfPages() + " ; " + "Genre: " + genre;

    }
}