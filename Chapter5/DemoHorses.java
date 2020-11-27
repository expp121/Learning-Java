
public class DemoHorses {
    public static void main(String[] args) {
        Horse horse = new Horse();
        RaceHorse raceHorse = new RaceHorse();

        horse.setBirthYear(1992);
        horse.setColor("Black");
        horse.setName("Gosho");
        
        raceHorse.setBirthYear(2001);
        raceHorse.setColor("Brown");
        raceHorse.setName("Light");
        raceHorse.setRacesCompeted((short)21);

        displayHorse(horse);
        displayHorse(raceHorse);

    }

    public static void displayHorse(Horse horse) {
        System.out.println("Name: " + horse.getName() + "\nColor: " + 
        horse.getColor() + "\nBirth Year: " + horse.getBirthYear() + "\n");
    }

    public static void displayHorse(RaceHorse horse){
        System.out.println("Name: " + horse.getName() + "\nColor: " + 
        horse.getColor() + "\nBirth Year: " + horse.getBirthYear() + "\nRaces Completed: " + horse.getRacesCompeted() + "\n");
    }
}