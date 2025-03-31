package chapter4;

import java.util.Scanner;
public class Factorial3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Enter the value of x: ");
        double xValue = input.nextDouble();
	System.out.print("Enter a number: ");
        int userInput = input.nextInt();

	double add = 1; 
        for (int number = 1; number <= userInput; number++) {
		double result = xValue / number;
		add += result;
        }
        System.out.println(add);
    }
}