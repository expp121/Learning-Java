import java.util.Scanner;

public class SalesPersonSort {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String sortingMethod;
        SalesPerson[] salesPersons = new SalesPerson[7];
        SalesPerson temp;
        for (int i = 0; i < salesPersons.length; i++) {
            salesPersons[i] = inifPerson(salesPersons[i]);
        }
        input.nextLine();
        System.out.println("How do want to sort them, by Id or annual sales: ");
        sortingMethod = input.nextLine();

        switch (sortingMethod) {

            case "id":
                for (int i = 0; i < salesPersons.length - 1; i++) {

                    for (int j = 0; j < salesPersons.length - 1; j++) {
                        if (salesPersons[j].getId() > salesPersons[j + 1].getId()) {
                            temp = salesPersons[j];
                            salesPersons[j] = salesPersons[j + 1];
                            salesPersons[j + 1] = temp;
                        }
                    }
                }

                break;

            case "annual sales":
                for (int i = 0; i < salesPersons.length - 1; i++) {

                    for (int j = 0; j < salesPersons.length - 1; j++) {
                        if (salesPersons[j].getAnnualSales() > salesPersons[j + 1].getAnnualSales()) {
                            temp = salesPersons[j];
                            salesPersons[j] = salesPersons[j + 1];
                            salesPersons[j + 1] = temp;
                        }
                    }
                }

                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
        for (int i = 0; i < salesPersons.length; i++) {
            displayPerson(salesPersons[i]);
        }
        input.close();

    }

    public static void displayPerson(SalesPerson person) {
        System.out.println("===================\nID: " + person.getId() + "\nAnnual Sales: " + person.getAnnualSales());
    }

    public static SalesPerson inifPerson(SalesPerson salesPerson) {
        int id;
        double annualSales;
        System.out.print("Enter ID: ");
        id = input.nextInt();
        System.out.println("Enter the annual sales: ");
        annualSales = input.nextDouble();
        salesPerson = new SalesPerson(id, annualSales);
        return salesPerson;

    }
}