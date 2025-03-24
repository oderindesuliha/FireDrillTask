import java.util.Scanner;
import java.util.Arrays;
public class TaskSix{
	public static void main(String[] args){
				

	int[] evenElements = {1, 2, 3, 5, 6, 6};
	int result = taskSix(evenElements);
	System.out.print(result);	
	}
	
	public static int taskSix(int[] evenElements){
	int[] result = new int[evenElements.length/2];
	int counter = 0;	
	int sum = 0;	
		for(int count = 0; count < evenElements.length; count+=2){				
				
			sum += evenElements[count];
}
			
			
					

			
					return sum;

				

}
}

