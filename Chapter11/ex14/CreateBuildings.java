package ex14;

import com.course.buildings.*;

public class CreateBuildings {
    public static void main(String[] args) {
        Building building = new Building();
        House house = new House();
        School school = new School();

        building.setStories(1);
        house.setStories(2);
        school.setStories(3);
        building.setSquareFooting(20.12f);
        house.setSquareFooting(10.12f);
        school.setSquareFooting(15.12f);
        house.setNumberOfBathrooms(3);
        house.setNumberOfBedrooms(3);
        school.setGradeLevel("Naruto");
        school.setNumberOfClassrooms(35);

        display(building);
        display(house);
        display(school);
    }

    public static void display(Building building) {
        System.out.println("\nStories: " + building.getStories() + "\nArea: " + building.getSquareFooting());
    }

    public static void display(House house) {
        System.out.println("\nStories: " + house.getStories() + "\nArea: " + house.getSquareFooting() + "\nBaths: "
                + house.getNumberOfBathrooms() + "\nBedrooms: " + house.getNumberOfBedrooms());
    }

    public static void display(School school) {
        System.out.println("\nStories: " + school.getStories() + "\nArea: " + school.getSquareFooting()
                + "\nClassrooms: " + school.getNumberOfClassrooms() + "\nGrade Level:" + school.getGradeLevel());
    }
}
