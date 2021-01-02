public class ShortStory extends Story {
    public static final short maximumPages = 50;

    @Override
    public void setNumberOfPages(short numberOfPages) {
        if (numberOfPages > 0 && numberOfPages < maximumPages)
            super.numberOfPages = numberOfPages;
        else
            super.setMessage(
                    (numberOfPages > maximumPages) ? ("Please remove " + (numberOfPages - maximumPages) + " pages!")
                            : ("Please add " + (maximumPages - numberOfPages) + " pages!"));
    }

}
