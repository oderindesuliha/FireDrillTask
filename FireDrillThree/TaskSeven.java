import java.util.Scanner;
import java.util.Arrays;
public class TaskSeven{
	public static void main(String[] args){
				

	int[] oddElements = {1, 2, 3, 5, 6, 6};
	int result = taskSeven(oddElements);
	System.out.print(result);	
	}
	
	public static int taskSeven(int[] oddElements){
	int[] result = new int[oddElements.length/2];
	int counter = 0;	
	int sum = 0;	
		for(int count = 1; count < oddElements.length; count+=2){				
				
			sum += oddElements[count];
}
			
			
					

			
					return sum;

				

}
}

