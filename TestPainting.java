import java.util.Scanner;/**
 * TestPainting
 */
public class TestPainting {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Painting painting1 = new Painting(),
        painting2 = new Painting(),
        painting3 = new Painting();
        painting1 = instantiatePainting(painting1);
        painting2 = instantiatePainting(painting2);
        displayPainting(painting1);
        displayPainting(painting2);
        displayPainting(painting3);
        explainCommsision();
        input.close();
    }
    
    public static Painting instantiatePainting(Painting painting) {
        System.out.print("Set the painting's title: ");
        painting.setTitle(input.nextLine());
        System.out.print("Set the painting's artist: ");
        painting.setArtist(input.nextLine());
        System.out.print("Set the painting's medium: ");
        painting.setMedium(input.nextLine());
        System.out.print("Set the painting's price: ");
        painting.setPrice(input.nextFloat());
        input.nextLine();
        return painting;
    }

    public static void displayPainting(Painting painting) {
        System.out.print("\n--------------\nTitle: "+ painting.getTitle()
        + "\nArtist: " + painting.getArtist() + "\nMedium: " + painting.getMedium() 
        + "\nPrice: " + painting.getPrice() + "\nCommision: " + painting.getGalleryCommision());
        
    }

    public static void explainCommsision() {
        System.out.println("\n====================================\nPainting's commision is 20% from it's value\n====================================\n"); 
    }
}