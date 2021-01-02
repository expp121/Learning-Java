public class Novella extends Story {
    public static final short minimumPages = 50;
    public static final short maximumPages = 100;

    @Override
    public void setNumberOfPages(short numberOfPages) {
        if (numberOfPages > minimumPages && numberOfPages < maximumPages)
            super.numberOfPages = numberOfPages;
        else
            super.setMessage(
                    numberOfPages < minimumPages ? "Please add " + (minimumPages - numberOfPages) + " more pages!"
                            : (numberOfPages > maximumPages)
                                    ? "Please remove " + (numberOfPages - maximumPages) + " more!"
                                    : "");
    }

}
