import java.util.Scanner;
public class LargestAndSmallest{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number1: ");
	int number1 = input.nextInt();

	System.out.print("Enter number2: ");
	int number2 = input.nextInt();
	
	System.out.print("Enter number3: ");
	int number3 = input.nextInt();

	System.out.print("Enter number4: ");
	int number4 = input.nextInt();

	System.out.print("Enter number5: ");
	int number5 = input.nextInt();
	
	
	int smallest = number1;
		
	if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
	if (number4 < smallest) {
            smallest = number5;
        }
	if (number5 < smallest) {
            smallest = number5;
        }


        int largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        if (number4 > largest) {
            largest = number4;
        }
        if (number5 > largest) {
            largest = number5;
        }

	System.out.printf("The Largest is %d%n:" , largest);
	System.out.printf("The Smallest is %d:" , smallest);
	}

}
