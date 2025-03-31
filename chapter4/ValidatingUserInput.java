package chapter4;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pass = 0;
        int fail = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {

            System.out.print("Enter result(1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1) {
                pass += 1;
            } else if (result == 2) {
                fail += 1;
            } else {
                System.out.print("Enter a valid result : ");
                continue;
            }
            studentCounter += 1;
        }
        System.out.println("Number of passes " + pass);
        System.out.println("Number of fails " + fail);
        if (pass > 8){
            System.out.println("Bonus To The Instructor!");
        }
      }

    }