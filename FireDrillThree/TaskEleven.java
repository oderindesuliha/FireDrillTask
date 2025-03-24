import java.util.Scanner;
import java.util.Arrays;
public class TaskEleven{
	public static void main(String[] args){
				

	int[] oddElements = {1, 2, 3, 5, 10, 9};
	int result = taskEleven(oddElements);
	System.out.print(result);	
	}
	
	public static int taskEleven(int[] oddElements){
	int[] result = new int[oddElements.length/2];
	int maximum = -1000;
	int counter = 0;		
		for(int count = 1; count < oddElements.length; count+=2){				
				result[counter++] = oddElements[count];
				if(oddElements[count] > maximum){
				maximum = oddElements[count];
}
			}
			
					

			
					return maximum;		
		

				

}
}

