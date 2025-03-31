import java.util.Scanner;
import java.util.Arrays;
public class TaskOne{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int[] result = new int[10];

		for(int count = 0; count < result.length; count ++){
		System.out.print("Enter the score: ");

				
			 result[count] = input.nextInt();
	}
		System.out.println(Arrays.toString(result));
	


}
}


