package chapter5;

import java.util.Scanner;

public class Triangle {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();

            for (int count = 1; count <= userInput; count++) {
                for (int counter = 1; counter <= count; counter++) {
                    System.out.print('*');
                }
                System.out.println();
            }

            System.out.println();

            for (int count = userInput; count >= 1; count--) {
                for (int counter = 1; counter <= count; counter++) {
                    System.out.print('*');
                }
                System.out.println();
            }

            System.out.println();

            for (int count = 1; count <= userInput; count++) {
                for (int counter = 1; counter <= userInput - count; counter++) {
                    System.out.print(' ');
                }
                for (int index = 1; index <= count; index++) {
                    System.out.print('*');
                }
                System.out.println();
            }

            System.out.println();

            for (int count = userInput; count >= 1; count--) {
                for (int counter = 1; counter <= userInput - count; counter++) {
                    System.out.print(' ');
                }
                for (int index = 1; index <= count; index++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }


