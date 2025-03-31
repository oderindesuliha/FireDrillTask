package chapter4;

import java.util.Scanner;

public class Palindrome {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            System.out.print("enter a 5-digit number: " );
            int number = input.nextInt();

            while(number < 10000 || number > 99999) {
                System.out.print("Error!.... Please enter a 5-digit number: ");
                number = input.nextInt();
                break;
            }

            int fifthDigit = number / 10000;
            int fourthDigit = number / 1000 % 10;
            int secondDigit = number / 10 % 10;
            int firstDigit = number % 10;

            if(firstDigit == fifthDigit && secondDigit == fourthDigit){
                System.out.print("Number is Palindrome");
            }else{
                System.out.print("Number is not Palindrome");
            }




        }

    }

