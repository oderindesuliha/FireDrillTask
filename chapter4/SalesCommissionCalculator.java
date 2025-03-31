package chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;
        double total = 0;
        double price = 0;
        int itemPrice = 0;

        System.out.print("Salesperson's name: ");
        String name = input.nextLine();
        System.out.print("Salesperson's ID: ");
        int id = input.nextInt();
        System.out.print("item1 = 1\nitem2 = 2\nitem3 = 3\nitem4 = 4\n");
        System.out.print("Enter the item you'd like to buy: ");
        itemPrice = input.nextInt();
        while(itemPrice > 0 && itemPrice != -1) {

            System.out.print("The number of item(s) gotten: ");
            int quantity = input.nextInt();
            if (itemPrice == 1) {
                price = quantity * item1;
            } else if (itemPrice == 2) {
                price = quantity * item2;
            } else if (itemPrice == 3) {
                price = quantity * item3;
            } else if (itemPrice == 4) {
                price = quantity * item4;
            } else {
                System.out.println("Item does not exist");
            }
            System.out.println("The price for the number of item gotten is: " + price);

        }

            total += price;
            System.out.println("Total price of items gotten is: " + total);
            double commission = 0.09;
            double salary = commission + total + 200;

            System.out.println("SalesPerson Salary is: " + salary);




    }
}
