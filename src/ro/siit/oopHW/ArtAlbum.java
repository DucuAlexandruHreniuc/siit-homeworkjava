package ro.siit.oopHW;

public class ArtAlbum extends Book {
    private final String paperQualityRating;

    public ArtAlbum(String name, int numberOfPages, String paperQualityRating) {
        super(name, numberOfPages);
        this.paperQualityRating = paperQualityRating;
    }
    public String toString() {
        return "Art album name: " + getName() + " ; " + "No. of pages: " + getNumberOfPages() + " ; " + "Paper quality rating: " + paperQualityRating;
    }
}
