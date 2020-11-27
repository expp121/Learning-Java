
class DemonstratingStringMethods {

    public static void main(String Args[]) {
        String sentence = "You can never cross the ocean until you have the courage to lose sightof the shore.";

        System.out.println("indexOf('v') = " + sentence.indexOf('v'));
        System.out.println("indexOf('x') = " + sentence.indexOf('x'));
        System.out.println("charAt(16) = " + sentence.charAt(16));
        System.out.println("endsWith(\"bus\") = " + sentence.endsWith("bus"));
        System.out.println("endsWith(\"car\") = " + sentence.endsWith("car"));
        sentence = sentence.replace('c', 'C');
        System.out.println(sentence);
    }
}