/**
 * Painting
 */
public class Painting {

    String title;
    String artist;
    String medium;
    float price;
    float galleryCommision;

    Painting()
    {
        title = "";
        artist = "";
        medium = "";
        price = 0.0f;
        galleryCommision = 0.0f;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        galleryCommision = price * 0.2f;
    }

    public float getGalleryCommision() {
        return galleryCommision;
    }

}