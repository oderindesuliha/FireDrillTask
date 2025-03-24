import java.util.Scanner;
import java.util.Arrays;
public class TaskTen{
	public static void main(String[] args){
				

	int[] evenElements = {1, 2, 3, 5, 10, 9};
	int result = taskTen(evenElements);
	System.out.print(result);	
	}
	
	public static int taskTen(int[] evenElements){
	int[] result = new int[evenElements.length/2];
	int maximum = -1000;
	int counter = 0;		
		for(int count = 0; count < evenElements.length; count+=2){				
				result[counter++] = evenElements[count];
				if(evenElements[count] > maximum){
				maximum = evenElements[count];
}
			}
			
					

			
					return maximum;		
		

				

}
}

