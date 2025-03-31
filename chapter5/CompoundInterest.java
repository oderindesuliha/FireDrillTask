package chapter5;

public class CompoundInterest {

        public static void main(String[] args) {
            double principal = 1000.0;

            for (int rate = 5; rate <= 10; rate++) {
                System.out.println("Interest Rate: " + rate + "%");
                for (int year = 1; year <= 10; year++) {
                    double amount = principal * (1 + rate / 100.0) * year *year ;
                    System.out.printf("Year %d: %.2f%n", year, amount);
                }
            }
        }


}
