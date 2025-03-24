import java.util.Scanner;
public class SmallestandLargest{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number1: ");
	int number1 = input.nextInt();

	System.out.print("Enter number2: ");
	int number2 = input.nextInt();
	
	System.out.print("Enter number3: ");
	int number3 = input.nextInt();

	
	int sum = number1 + number2 + number3;
	int average = sum / 3;
	int product = number1 * number2 * number3;

	int smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        int largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

	System.out.printf("The sum, average, product, smallest and largest are: %d %d %d %d %d", sum, average, product, smallest, largest);

System.out.println();
 System.out.println("*");
 System.out.println("***");
 System.out.println("*****");
 System.out.println("****");
 System.out.println("**");
	System.out.println();
 System.out.print("*");
 System.out.print("***");
 System.out.print("*****");
 System.out.print("****");
 System.out.println("**");
	System.out.println();
 System.out.print("*");
 System.out.println("***");
 System.out.println("*****");
 System.out.print("****");
 System.out.println("**");
	System.out.println();
 System.out.printf("%s%n%s%n%s%n%s%n", "  *", " ***", "*****", " ***", "  *");
	}

}
