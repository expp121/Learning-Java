public abstract class Story {
    private String storyTitle;
    private String authorName;
    private String message;
    protected short numberOfPages;

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public abstract void setNumberOfPages(short numberOfPages);

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public short getNumberOfPages() {
        return numberOfPages;
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return "Title: " + this.storyTitle + "\nAuthor: " + this.authorName + "\nNumber of Pages: " + this.numberOfPages
                + "\nMessage: " + this.message;
    }

}
