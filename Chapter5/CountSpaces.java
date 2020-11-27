class CountSpaces {

    public static void main(String Args[]) {
        String sentence = "The person who says something is impossible should not interrupt theperson who is doing it.";
        int numOfSpaces = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                numOfSpaces++;
            }
        }
        System.out.println("The sentence has " + numOfSpaces + " spaces.");

    }
}