public class StoryDemo {

    public static void main(String args[]) {
        Story[] stories = new Story[6];
        for (int i = 0; i < stories.length - 2; i += 3) {
            stories[i] = new Novel();
            stories[i + 1] = new Novella();
            stories[i + 2] = new ShortStory();
        }

        for (int i = 0; i < stories.length - 1; i++) {
            stories[i].setAuthorName("Naruto" + i);
            stories[i].setStoryTitle("Boruto's dad tales" + i);
            stories[i].setNumberOfPages((short) (i + 1));
            System.out.println(stories[i].toString() + "\n");
        }

    }
}