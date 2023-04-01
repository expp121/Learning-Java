package Chapter5;
/**
 * RentalDemo
 */
import java.util.Scanner;

public class LessonsWithRentalDemo {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sortChoice = new StringBuilder();
        LessonsWithRental[] rentals = new LessonsWithRental[3];
        LessonsWithRental temp;
        for (int i = 0; i < rentals.length; i++) {
            rentals[i] = instantiateObj();
        }

        do {
            System.out
                    .println("How do you want to sort them:\n1.by Contract number\n2.by Price\n3.by Equipment Type\n:");
            sortChoice.delete(0, sortChoice.length());
            sortChoice.append(input.nextLine());

            if (sortChoice.toString().equals("1") || sortChoice.toString().toLowerCase().contains("contract"))
                for (int i = 0; i < rentals.length - 1 - i; i++)
                    for (int j = 0; j < rentals.length - 1- i; j++)
                        if (rentals[j].getContractNumber().compareTo(rentals[j + 1].getContractNumber()) > 0) {
                            temp = rentals[j];
                            rentals[j] = rentals[j + 1];
                            rentals[j + 1] = temp;
                        }

            if (sortChoice.toString().equals("2") || sortChoice.toString().toLowerCase().contains("price"))
                for (int i = 0; i < rentals.length - 1; i++)
                    for (int j = 0; j < rentals.length - 1; j++)
                        if (rentals[j].getPrice() > rentals[j + 1].getPrice()) {
                                temp = rentals[j];
                                rentals[j] = rentals[j + 1];
                                rentals[j + 1] = temp;
                        }

            if (sortChoice.toString().equals("3") || sortChoice.toString().toLowerCase().contains("equipment"))
                for (int i = 0; i < rentals.length - 1 - i; i++)
                    for (int j = 0; j < rentals.length - 1 - i; j++)
                        if (rentals[j].getEquipmentType().charAt(0) > rentals[j + 1].getEquipmentType().charAt(0)) {
                            temp = rentals[j];
                            rentals[j] = rentals[j + 1];
                            rentals[j + 1] = temp;
                        }

            for (int i = 0; i < rentals.length; i++)
                displayObj(rentals[i]);

        } while (!sortChoice.toString().equals("exit"));

        input.close();

    }

    public static LessonsWithRental instantiateObj() {

        short minutes;
        String contractNumber;
        int equipmentType;

        System.out.print("Contract number:");

        contractNumber = input.nextLine();
        System.out.print("Minutes[60..7200]");

        do {
            System.out.print(":");
            minutes = input.nextShort();

        } while (minutes < 60 || minutes > 7200);
        input.nextLine();

        System.out.println(
                "Choose equipment type:\n1.Jet ski\n2.Pontoon boat\n3.Rowboat\n4.Canoe\n5.Kayak\n6.Beach chair\n7.Umbrella\n8.Other");
        do {
            System.out.print(":");
            equipmentType = input.nextShort();

        } while (equipmentType < 1 || equipmentType > 8);
        input.nextLine();
        return new LessonsWithRental(contractNumber, minutes, equipmentType - 1);
    }

    public static void displayObj(Rental rental) {
        System.out.println("\nContract Number: " + rental.getContractNumber() + "\nRental Hours: "
                + rental.getRentalHours() + "\nRental minutes: " + rental.getRentalMinutes() + "\nPrice: "
                + rental.getPrice() + "$\nEquipment Type: " + rental.getEquipmentType() + "\n");
    }
}