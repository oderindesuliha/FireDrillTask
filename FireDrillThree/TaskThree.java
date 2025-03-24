import java.util.Scanner;
import java.util.Arrays;
public class TaskThree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
			System.out.println("Enter the scores: ");


	int[] result = new int[10];

		for(int count = 0; count < result.length; count ++){

			result[count] = input.nextInt();
	
	}

		for(int count = 0; count < result.length; count++){

				

			System.out.print(result[count] + " ");
	}
}
}


