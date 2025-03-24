import java.util.Scanner;
public class Arithmetic{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int num1 = input.nextInt();
	
	System.out.print("Enter second number: ");
	int num2 = input.nextInt();

	int number1 = num1 * num1;
	int number2 = num2 * num2;

		int add = number1 + number2;
		int difference = number1 - number2;


	System.out.printf("Results are: %d, %d, %d, %d" , number1, number2, add , difference);
		
	}

}
