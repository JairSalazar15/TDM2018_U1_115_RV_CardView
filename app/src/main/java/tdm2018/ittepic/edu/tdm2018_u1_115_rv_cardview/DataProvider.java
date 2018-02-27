package tdm2018.ittepic.edu.tdm2018_u1_115_rv_cardview;

/**
 * Created by Jair on 22/02/2018.
 */

public class DataProvider {
    private String title;
    private String shortdesc;
    private double rating;
    private int image;

    public DataProvider(String title, String shortdesc, double rating, int image) {
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.image = image;
    }
    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public double getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }
}
