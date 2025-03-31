package chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tax = 0.0;
        double totalTax = 0.0;


        for(int counter = 1; counter <= 3; counter++) {

            System.out.print(counter + " Citizen's Name : " );
            String name = input.nextLine();

            System.out.print("Enter Citizen " + name  + " earnings: ");
            double earnings = input.nextDouble();

            if (earnings <= 30000) {
                tax = 0.15 * earnings;
            } else if (earnings > 30000) {
                tax = 0.20 * earnings;
            }
            System.out.println("Citizen " + name + "tax is " + tax);
             totalTax += tax;
        }

        System.out.println("Total tax: " + totalTax);
    }
}
