import java.util.Scanner;
import java.util.Arrays;
public class Tasks{
	public static void main(String[] args){
				Scanner input = new Scanner(System.in);

	int[] result = new int[10];
	int[] scores = taskFour(result);
	System.out.print(Arrays.toString(scores));	
	}
	
	public static int[] taskFour(int[] result){
	int counter = 0;		
		for(int count = 0; count < result.length; count+=2){
				System.out.println("Enter the score" + (count + 1) + ": ");
			
					result[count] = input.nextInt();
					result[counter++] = result[count];

			
}				
		

		return result;
				

}
}

