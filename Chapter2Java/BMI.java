 import java.util.Scanner;
public class BMI{
	public static void main(String... args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter weightInKilograms: ");
	
int weightInKilograms  = input.nextInt();

	System.out.print("Enter heightInMeters: ");
	
int heightInMeters  = input.nextInt();

	
	int bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);
	System.out.print("BMI: " + bodyMassIndex);
}
}