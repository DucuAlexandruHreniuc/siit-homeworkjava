package ro.siit.oopHW;

public class Book {

    private final String name;
    private final int numberOfPages;

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }
}
