/**
 * TestState
 */
import java.util.Scanner;

public class TestState {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        State florida = new State();
        State texas = new State("Texas", 2746911, "Austin", 950715, "Houston", 2313000);
        State bulgaria = new State();
        bulgaria = inputData(bulgaria);
        displayState(florida);
        displayState(texas);
        displayState(bulgaria);
    }

    public static State inputData(State state){
        
        System.out.print("Enter a state name: ");
        state.setNameOfState(input.nextLine());
        
        System.out.print("Enter state population: ");
        state.setPopulation(input.nextInt());
        input.nextLine();

        System.out.print("Enter the capital of the state: ");
        state.setCapitalCityName(input.nextLine());

        System.out.print("Enter the capital city's population: ");
        state.setCapitalCityPopulation(input.nextInt());
        input.nextLine();

        System.out.print("Enter the most popular city of the state: ");
        state.setPopulousCityName(input.nextLine());

        System.out.print("Enter the population of the most popular city in the state: ");
        state.setPopulousCityPopulation(input.nextInt());
        input.nextLine();
        return state;
    }

    public static void displayState(State state){
        System.out.println("\nState name: " + state.getNameOfState() 
        + "\nState population: " + state.getPopulation() 
        + "\nCapital of " + state.getNameOfState() + " is: " + state.getCapitalCityName() 
        + "\nPopulation of capital: " + state.getCapitalCityPopulation() 
        + "\nMost popular city in " + state.getPopulousCityName() + " with population of: " + state.getPopulousCityPopulation());
    }
}