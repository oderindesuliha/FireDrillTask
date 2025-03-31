package chapter4;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();
        int sum = 0;

        while (userInput >= sum){
            System.out.print("Enter a number: ");
            int userInput2 = input.nextInt();
            sum += userInput2;
        }
        System.out.println("The sum of the numbers is " + sum);

    }
}