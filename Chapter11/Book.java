abstract class Book {

    private String title;
    protected double price;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString(){
        return ("Title: " + this.title + "\nPrice: " + this.price);
    }

    public abstract void setPrice();
}