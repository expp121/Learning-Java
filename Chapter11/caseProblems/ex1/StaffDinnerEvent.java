package Chapter11.caseProblems.ex1;

import java.util.Scanner;

public class StaffDinnerEvent {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String eventNumber;
        short numberOfGuest;
        byte entree, sideDish1, sideDish2, desert;
        String phoneNumber;
        System.out.print("Enter event number: ");
        eventNumber = input.nextLine();
        System.out.print("Enter number of guests: ");
        numberOfGuest = input.nextShort();
        System.out.print("Enter the number of a entree dish you want to get:\n1.Crockets\n2.Potatoes filled with bacon and cheese\n3.Crab meat rolls\n4.Snails with pasta\n:");
        entree = (byte) (input.nextByte());
        System.out.print("Enter the number of a first side dish you want to get:\n1.Mushrooms\n2.Sturgeon\n3.Bean soup\n4.Fried eggs with bacon\n5.Ramen\n6.Baked rice\n:");
        sideDish1 = (byte) (input.nextByte());
        System.out.print("Enter the number of a second side dish you want to get\n1.Mushrooms\n2.Sturgeon\n3.Bean soup\n4.Fried eggs with bacon\n5.Ramen\n6.Baked rice\n:");
        sideDish2 = (byte) (input.nextByte());
        System.out.print("Enter the number of a desert you want to get\n1.Oreo Truffles\n2.Chocolate Pudding\n3.Confetti Squares\n4.Chess Pie\n:");
        desert = (byte) (input.nextByte());
        System.out.print("Enter a phone number: ");
        input.nextLine();
        phoneNumber = input.nextLine();

        short waitStaff = (short) ((numberOfGuest / 10) + 1),
                bartenders = (short) (numberOfGuest / 25);
        Employee[] employees = new Employee[waitStaff + bartenders + 1];
        employees[0] = new Coordinator();
        enterEmployee(employees[0]);
        for (int i = 1; i < bartenders + 1; i++) {
            employees[i] = new Bartender();
            enterEmployee(employees[i]);
        }
        for (int i = bartenders + 1; i < employees.length; i++) {
            employees[i] = new Waitstaff();
            enterEmployee(employees[i]);
        }

        DinnerEvent dinnerEvent = new DinnerEvent(eventNumber, numberOfGuest, entree, sideDish1, sideDish2, desert, phoneNumber, employees);
        displayEvent(dinnerEvent);

    }

    public static void displayEvent(DinnerEvent event) {
        System.out.println("Event Number: " + event.getEventNumber() +
                "\nEvent Type: " + event.getEventType() +
                "\nPhone Number: " + event.getPhoneNumber() +
                "\nNumber of Guests: " + event.getNumberOfGuests() +
                "\nPrice: " + event.getPrice() +
                "\n Price per guest: " + event.getPricePerGuest() +
                "\nMenu: " + event.getMenu());
        System.out.println("-----------EMPLOYEES-----------");
        for (Employee employee : event.getEmployees()) {
            if (employee != null) {
                System.out.println("ID: " + employee.getIdNumber() +
                        "\nJob: " + employee.getJobTitle() +
                        "\nFirst Name: " + employee.getFirstName() +
                        "\nLast Name: " + employee.getLastName() +
                        "\nPay Rate: " + employee.getPayRate() + "\n");
            }
        }

        System.out.println("-------------------------------");
    }

    public static void enterEmployee(Employee employee) {
        int idNumber;
        String lastName;
        String firstName;
        double payRate;
        String jobTitle;
        System.out.println("\nEntering data for " + employee.getClass().getSimpleName() + " employee");

        System.out.print("ID Number:");
        idNumber = input.nextInt();
        input.nextLine();
        System.out.print("Last Name:");
        lastName = input.nextLine();
        System.out.print("First Name:");
        firstName = input.nextLine();
        System.out.print("Pay Rate:");
        payRate = input.nextDouble();
        input.nextLine();
        employee.setJobTitle();
        employee.setIdNumber(idNumber);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setPayRate(payRate);
    }
}
