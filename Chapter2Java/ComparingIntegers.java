import java.util.Scanner;
public class ComparingIntegers{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number: ");
	int number = input.nextInt();
	
	int numberSquare = number * number;

	if(number > 100){
	System.out.println("number is greater than 100");
	}

	if(number == 100){
	System.out.println("number is equal to 100");
	}

	if(number != 100){
	System.out.println("number is not equal to 100");
	}

	if(number < 100){
	System.out.println("number is less than 100");
	}


	if(numberSquare > 100){
	System.out.println("number square is greater than 100");
	}

	if(numberSquare == 100){
	System.out.println("number square is equal to 100");
	}

	if(numberSquare != 100){
	System.out.println("number square is not equal to 100");
	}

	if(numberSquare < 100){
	System.out.println("number square is less than 100");
	}



	}

}
