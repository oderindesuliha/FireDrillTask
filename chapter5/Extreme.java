package chapter5;

import java.util.Scanner;

public class Extreme {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of integers: ");
            int number = input.nextInt();

            int minimum = 100;
            int maximum = 0;

            for(int counter = 1; counter <= number; counter++) {
                System.out.print("Enter integer" + counter  + ": ");
                int integer = input.nextInt();

                if (integer < minimum) {
                    minimum = integer;
                }

                if (integer > maximum) {
                    maximum = integer;
                }
            }

            int sum = minimum + maximum;
            System.out.println("Minimum: " + minimum);
            System.out.println("Maximum: " + maximum);
            System.out.println("Sum of Extremes: " + sum);
        }
    }


