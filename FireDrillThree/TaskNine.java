import java.util.Scanner;
import java.util.Arrays;
public class TaskNine{
	public static void main(String[] args){
				

	int[] oddElements = {1, 2, 3, 5, 10, 9};
	int result = taskNine(oddElements);
	System.out.print(result);	
	}
	
	public static int taskNine(int[] oddElements){
	int[] result = new int[oddElements.length/2];
	int minimum = 1000;
	int counter = 0;		
		for(int count = 1; count < oddElements.length; count+=2){				
				result[counter++] = oddElements[count];
				if(oddElements[count] < minimum){
				minimum = oddElements[count];
}
			}
			
					

			
					return minimum;		
		

				

}
}

