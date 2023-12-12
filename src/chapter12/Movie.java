package chapter12;

public class Movie {
    private String title;
    private double rebbenue;
    private int year;

    public Movie(String title, double rebbenue, int year) {
        this.title = title;
        this.rebbenue = rebbenue;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public double getRebbenue() {
        return rebbenue;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rebbenue=" + rebbenue +
                ", year=" + year +
                '}';
    }
}
