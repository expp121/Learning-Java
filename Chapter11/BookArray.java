public class BookArray {

    public static void main(String args[]) {
        Book[] books = new Book[10];

        for (int i = 0; i < books.length - 1; i += 2) {
            books[i] = new Fiction("" + (char) (65 + i));
            books[i + 1] = new NonFiction("" + (char) (66 + i));
        }

        for (int i = 0; i < books.length; i++)
            System.out.println(books[i].toString());
    }
}