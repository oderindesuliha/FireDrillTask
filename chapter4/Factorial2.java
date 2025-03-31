package chapter4;

import java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
        int userInput = input.nextInt();

        double multiply = 1;
	double divide = 1;
	double add = 1;
        for (int number = 1; number <= userInput; number++) {
            multiply *= number;
		double result = divide / multiply;
		add += result;
        }
        System.out.println(add);
    }
}