import java.util.Scanner;

public class RecordingSort {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String sortingField;
        Recording[] recordings = new Recording[5];
        Recording temp = new Recording();
        for (int i = 0; i < recordings.length; i++) {
            recordings[i] = new Recording();
            recordings[i] = initRec(recordings[i]);
        }

        for (int i = 0; i < recordings.length; i++) {
            displaySong(recordings[i]);
        }
        System.out.println("How do you want your songs to be sorted, by artist, title or length:");
        sortingField = input.nextLine();

        switch (sortingField) {

            case "artist":
                for (int i = 0; i < recordings.length - 1; i++) {
                    for (int j = 0; j < recordings.length - 1; j++) {
                        if (recordings[j].getArtist().compareTo(recordings[j + 1].getArtist()) > 0) {
                            temp = recordings[j];
                            recordings[j] = recordings[j + 1];
                            recordings[j + 1] = temp;
                        }
                    }
                }
                break;

            case "title":
                for (int i = 0; i < recordings.length - 1; i++) {
                    for (int j = 0; j < recordings.length - 1; j++) {
                        if (recordings[j].getTitle().compareTo(recordings[j + 1].getTitle()) > 0) {
                            temp = recordings[j];
                            recordings[j] = recordings[j + 1];
                            recordings[j + 1] = temp;
                        }
                    }
                }

                break;

            case "length":
                for (int i = 0; i < recordings.length - 1; i++) {
                    for (int j = 0; j < recordings.length - 1; j++) {
                        if (recordings[j].getPlayingTime() > recordings[j + 1].getPlayingTime()) {
                            temp = recordings[j];
                            recordings[j] = recordings[j + 1];
                            recordings[j + 1] = temp;
                        }
                    }
                }
                break;

            default:
                System.out.println("Invalid Choice.");
                break;
        }

        for (int i = 0; i < recordings.length; i++) {
            displaySong(recordings[i]);
        }

        input.close();
    }

    public static Recording initRec(Recording recording) {
        String title, artist;
        int songLenght;

        System.out.print("Enter the song title: ");
        title = input.nextLine();
        System.out.print("Enter the song's artist: ");
        artist = input.nextLine();
        System.out.print("Enter the song's lenght in seconds: ");
        songLenght = input.nextInt();
        input.nextLine();

        recording.setArtist(artist);
        recording.setPlayingTime(songLenght);
        recording.setTitle(title);
        return recording;
    }

    public static void displaySong(Recording rec) {

        System.out.print("=======================\nArtist:" + rec.getArtist() + "\nTitle: " + rec.getTitle()
                + "\nLength: " + rec.getPlayingTime() + "\n=======================\n");
    }
}