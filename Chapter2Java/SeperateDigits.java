import java.util.Scanner;
public class SeperateDigits{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number:"); 
	int number = input.nextInt();

	
	int fifthNumber = number % 10;
	int fourNumbers = number / 10;

	int fourthNumber = fourNumbers % 10;
	int threeNumbers = fourNumbers / 10;

	int thirdNumber = threeNumbers % 10;
	int twoNumbers = threeNumbers / 10;

	int secondNumber = twoNumbers % 10;
	int firstNumber = twoNumbers / 10;

System.out.print(firstNumber + " " + secondNumber + " " + thirdNumber + " " + fourthNumber + " " + fifthNumber);
	
	
}
	
}