package chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int number = 0;
        int largest = number;
	int secondLargest = number;

        for (int count = 1; count <= 5; count++) {

        System.out.print("enter number " + count + ": ");
            number = input.nextInt();
            counter++;
           
            System.out.println();

            if (number > largest){
                secondLargest = largest;
		largest = number;
            }else if(number > secondLargest && number != largest){
		secondLargest = number;
        }
	}

        System.out.println("The two largest numbers are " + largest + " and " + secondLargest);
    }
}