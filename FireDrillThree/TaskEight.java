import java.util.Scanner;
import java.util.Arrays;
public class TaskEight{
	public static void main(String[] args){
				

	int[] evenElements = {1, 2, 3, 5, 6, 6};
	int result = taskEight(evenElements);
	System.out.print(result);	
	}
	
	public static int taskEight(int[] evenElements){
	int[] result = new int[evenElements.length/2];
	int minimum = 1000;
	int counter = 0;
			
		for(int count = 0; count < evenElements.length; count+=2){				
				
				result[counter++] = evenElements[count];
				if(evenElements[count] < minimum){			
				minimum = evenElements[count];
				
}
			}
			
					

			
					return minimum;		
		

				

}
}

