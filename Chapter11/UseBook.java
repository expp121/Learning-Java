public class UseBook {

    public static void main(String args[]) {
        Fiction fictionBook = new Fiction("Naruto");
        NonFiction nonFictionBook = new NonFiction("Boruto");
        System.out.println(fictionBook.toString());
        System.out.println(nonFictionBook.toString());

    }
}