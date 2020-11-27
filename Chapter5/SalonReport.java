import java.util.Scanner;

public class SalonReport {
    public static Scanner input = new Scanner(System.in);

    public static void main(String Args[]) {
        String[] serviceOptions = { "Cut", "Shampoo", "Manicure", "Style", "Permanent", "Trim" };
        float[] servicePrices = { 8.00f, 4.00f, 18.00f, 48.00f, 18.00f, 6.00f };
        short[] serviceTime = { 15, 10, 30, 55, 35, 5 };
        Service[] services = new Service[6];
        byte choice;
        String howTosort;

        for (int i = 0; i < services.length; i++) {
            choice = (byte) (Math.random() * 6);
            services[i] = new Service(serviceOptions[choice], servicePrices[choice], serviceTime[choice]);
        }
        System.out.print(
                "By what do you want to sort the list?\n1.Service name\n2.Service price\n3.Time for the service\n:");
        howTosort = input.nextLine();
        switch (howTosort) {
            case "name": {
                Service temp;
                for (int i = 0; i < services.length - 1; i++) {
                    for (int j = 0; j < services.length - 1; j++) {
                        if (services[j].getServiceName().compareTo(services[j + 1].getServiceName()) > 0) {
                            temp = services[j];
                            services[j] = services[j + 1];
                            services[j + 1] = temp;
                        }
                    }
                }
            }
                break;

            case "price": {
                Service temp;
                for (int i = 0; i < services.length - 1; i++) {
                    for (int j = 0; j < services.length - 1; j++) {
                        if (services[j].getServicePrice() > services[j + 1].getServicePrice()) {
                            temp = services[j];
                            services[j] = services[j + 1];
                            services[j + 1] = temp;
                        }
                    }
                }
            }

                break;

            case "time": {
                Service temp;
                for (int i = 0; i < services.length - 1; i++) {
                    for (int j = 0; j < services.length - 1; j++) {
                        if (services[j].getServiceTime() > services[j + 1].getServiceTime()) {
                            temp = services[j];
                            services[j] = services[j + 1];
                            services[j + 1] = temp;
                        }
                    }
                }
            }
                break;

            default:
                System.out.println("Invalid choice, please select name,price or time, next time");
                break;
        }

        for (int i = 0; i < services.length; i++) {
            System.out.println("Service name: " + services[i].getServiceName() + "\nService Price: "
                    + services[i].getServicePrice() + "\nServoce Time: " + services[i].getServiceTime() + "\n");
        }
    }
}