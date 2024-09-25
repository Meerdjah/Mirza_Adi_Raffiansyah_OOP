public class Movie {
    public String title;
    public String director;
    public int year;

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String toString() {
        String result = "Movie title: " + this.title + "/n" + "Director: " + this.director + "/n" + "Year: " + this.year;
        return result;
    }
}
