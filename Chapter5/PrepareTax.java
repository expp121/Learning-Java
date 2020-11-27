import java.util.Scanner;

public class PrepareTax {

    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        TaxReturn money;
        StringBuilder taxPayerSecurityNumber = new StringBuilder();
        StringBuilder zipCode = new StringBuilder();
        StringBuilder maritualStatus = new StringBuilder(" ");
        String name;
        String lastName;
        String streetName;
        String city;
        String state;
        float annualIncome = -1f;

        while (!taxPayerSecurityNumber.toString().matches("\\d{3}-\\d{2}-\\d{4}")) {
            taxPayerSecurityNumber.delete(0, taxPayerSecurityNumber.length());
            System.out.print("Tax Payer Number: ");
            taxPayerSecurityNumber.append(input.nextLine());
        }

        System.out.print("Last Name: ");
        lastName = input.nextLine();

        System.out.print("First Name: ");
        name = input.nextLine();

        System.out.print("Street Name: ");
        streetName = input.nextLine();

        System.out.print("City: ");
        city = input.nextLine();

        System.out.print("State: ");
        state = input.nextLine();

        while (!zipCode.toString().matches("\\d{5}")) {
            System.out.print("Zip Code: ");
            zipCode.delete(0, zipCode.length());
            zipCode.append(input.nextLine());
        }

        while (!(maritualStatus.toString().toLowerCase().charAt(0) == 'm'
                || maritualStatus.toString().toLowerCase().charAt(0) == 's')) {
            maritualStatus.delete(0, maritualStatus.length());
            System.out.print("Maritual Status: ");
            maritualStatus.append(input.nextLine());
            System.out.println(">" + maritualStatus.toString());

        }

        while (annualIncome < 0) {
            System.out.print("Annual Income: ");
            annualIncome = input.nextFloat();
        }

        money = new TaxReturn(taxPayerSecurityNumber.toString(), name, lastName, streetName, city, state,
                zipCode.toString(), maritualStatus.toString(), annualIncome);

        money.displayData();

        input.close();
    }
}