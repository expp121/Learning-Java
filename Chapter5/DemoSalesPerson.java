public class DemoSalesPerson {

    public static void main(String Args[]) {

        SalesPerson[] persons = new SalesPerson[10];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new SalesPerson(111 + i, 25000 + i * 5000);
            System.out.println("Person " + (i + 1) + "\nID:" + persons[i].getId() + "\nAnnual Sales:"
                    + persons[i].getAnnualSales() + "\n");
        }
    }
}