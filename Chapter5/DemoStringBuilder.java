class DemoStringBuilder {

    public static void main(String Args[]) {
        StringBuilder str = new StringBuilder("Singing");
        print(str);

        str.append(" in the dead of ");
        print(str);

        str.insert(0, "Black");
        print(str);
        str.insert(5, "bird ");
        print(str);
        str.append("night");
        print(str);

    }

    public static void print(StringBuilder s) {
        System.out.println(s);
    }
}