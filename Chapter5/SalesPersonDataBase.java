import java.util.ArrayList;
import java.util.Scanner;

public class SalesPersonDataBase {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        ArrayList<SalesPerson> salesPersons = new ArrayList<SalesPerson>();
        byte people = 0;
        byte choice;

        do {

            System.out.print("\nPlease select option\n1.Add a record\n2.Delete a record\n3.Change Record\n4.Exit\n:");
            choice = input.nextByte();

            switch (choice) {
                case 1:

                    if (people < 20) {
                        salesPersons = addPerson(salesPersons);
                        people++;
                        displayDatabase(salesPersons);
                    } else
                        System.out.println("The Database is Full!");
                    break;

                case 2:

                    if (salesPersons.isEmpty()) {
                        System.out.println("The Database if empty");
                        break;
                    } else {
                        salesPersons = removePerson(salesPersons);
                        people--;
                        displayDatabase(salesPersons);
                    }

                    break;

                case 3:

                    if (salesPersons.isEmpty())
                        break;
                    else {
                        salesPersons = changePerson(salesPersons);
                        displayDatabase(salesPersons);
                    }
                    break;

                case 4:

                    if (!salesPersons.isEmpty())
                        displayDatabase(salesPersons);

                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;

            }

        } while (choice != 4);
        input.close();
    }

    public static ArrayList<SalesPerson> addPerson(ArrayList<SalesPerson> salesPersons) {
        int id;
        boolean alreadyInDatabase = false;
        System.out.print("Please enter an ID: ");
        id = input.nextInt();

        for (int i = 0; i < salesPersons.size(); i++) {
            if (id == salesPersons.get(i).getId()) {
                System.out.println("That ID is already in the Database.");
                alreadyInDatabase = true;
                break;
            }
        }

        if (!alreadyInDatabase) {
            double annualSales;
            System.out.print("Please enter also the annual sales: ");
            annualSales = input.nextDouble();
            salesPersons.add(new SalesPerson(id, annualSales));
        }
        return salesPersons;
    }

    public static ArrayList<SalesPerson> removePerson(ArrayList<SalesPerson> salesPersons) {
        System.out.print("Please enter the ID of the person:");
        int id;
        id = input.nextInt();

        for (int i = 0; i < salesPersons.size(); i++) {
            if (id == salesPersons.get(i).getId()) {
                salesPersons.remove(i);
            }
        }
        return salesPersons;
    }

    public static ArrayList<SalesPerson> changePerson(ArrayList<SalesPerson> salesPersons) {
        System.out.print("Please enter the ID of the person you want to change:");
        int id;
        boolean isInDatabease = true;
        id = input.nextInt();

        for (int i = 0; i < salesPersons.size(); i++) {
            if (id == salesPersons.get(i).getId()) {
                System.out.print("Please also enter the new value of the annual sales: ");
                double annualSales;
                annualSales = input.nextDouble();
                salesPersons.get(i).setAnnualSales(annualSales);
                isInDatabease = true;
                break;
            } else
                isInDatabease = false;
        }
        if (!isInDatabease)
            System.out.println("The entered ID isn't in the database.");

        return salesPersons;

    }

    public static void displayDatabase(ArrayList<SalesPerson> salesPersons) {
        for (int i = 0; i < salesPersons.size(); i++) {
            System.out.println("======================\nID: " + salesPersons.get(i).getId() + "\nAnnual Sales: "
                    + salesPersons.get(i).getAnnualSales());
        }
    }
}