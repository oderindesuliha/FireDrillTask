package chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstInput = input.nextInt();
        System.out.print("Enter second number: ");
        int secondInput = input.nextInt();

        if (firstInput == secondInput){
            System.out.print("0");
        } else if (firstInput > secondInput) {
            System.out.print("1");
        }else {
            System.out.print("-1");
        }
    }
}