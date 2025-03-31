package chapter5;

public class SumOfASeries {

        public static void main(String[] args) {
            long sum = 0;
            System.out.println("number\t\t\tsum");
            for (int number = 1; number <= 100; number++) {
                sum += number;
                System.out.println(number+ "\t\t\t\t"+ sum);

            }

        }


}
