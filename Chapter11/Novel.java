public class Novel extends Story {
    public static final short minimumPages = 100;

    @Override
    public void setNumberOfPages(short numberOfPages) {
        if (numberOfPages > minimumPages)
            super.numberOfPages = numberOfPages;
        else
            super.setMessage(
                    (numberOfPages < minimumPages) ? ("Please add " + (minimumPages - numberOfPages) + " pages") : "");
    }

}
