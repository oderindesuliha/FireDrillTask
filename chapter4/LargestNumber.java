package chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int number = 0;
        int largest = number;

        for (int count = 1; count <= 10; count++) {

            System.out.print("enter number " + count + ": ");
            number = input.nextInt();
            counter++;
           
            System.out.println();

            if (number > largest){
                largest = number;
            }
        }

        System.out.println("largest number is "+largest);
    }
}