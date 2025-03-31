import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter five integers: ");
		int positive = 0;
		int negative = 0;
		int zero = 0;

		for (int count = 1; count <= 5; count++) {
			System.out.print("Enter integer " + count + ": ");
			int number = input.nextInt();

			if (number > 0) {positive++;}
			else if (number < 0) {negative++;}
			else {zero++;}
		}

		System.out.println("Positive numbers: " + positive);
		System.out.println("Negative numbers: " + negative);
		System.out.println("Zeros: " + zero);

	}
}
