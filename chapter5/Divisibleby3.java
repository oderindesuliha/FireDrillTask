package chapter5;


public class Divisibleby3 {

    public static void main(String[] args) {

        int sum = 0;
        for (int counter = 1; counter <= 30; counter++) {
            if (counter % 3 == 0) {
                sum += counter;
            }

        }
        System.out.print("The sum of numbers from 1-30 that is divisible by 3 is: " + sum);

    }
}
