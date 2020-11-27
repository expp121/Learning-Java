/**
 * TestDogs
 */
public class TestDogs {

    public static void main(String[] args) {
        DogTriathlonParticipant dog1 = new DogTriathlonParticipant("Gosho", 12, 1, 1, 1);
        dog1.display();
        DogTriathlonParticipant dog2 = new DogTriathlonParticipant("Naruto", 4, 2, 2, 2);
        dog2.display();
        DogTriathlonParticipant dog3 = new DogTriathlonParticipant("Shashko", 3, 3, 3, 3);
        dog3.display();
    }
}