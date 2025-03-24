import java.util.Scanner;
import java.util.Arrays;
public class TaskTwelve{
	public static void main(String[] args){
				

	int[] numbers = {1, 2, 3, 5, 6, 6};
	int[] result = taskTwelve(numbers);
	System.out.print(Arrays.toString(result));	
	}
	
	public static int[] taskTwelve(int[] numbers){
	int[] result = new int[numbers.length];
	int[] evenElements = new int[numbers.length/2];
	int[] oddElements = new int[numbers.length/2];
	int even = 0;
	int odd = 0;
	int counter = 0;
	int counter1 = 0;

		for(int count = 0; count < numbers.length; count++){				
				if(count % 2 == 0){
				evenElements[even++] = numbers[count];
					
				}
				else if(count % 2 != 0){
				oddElements[odd++] = numbers[count];
							}

		}
		
		for(int count = 0; count < numbers.length; count++){				
				if(count % 2 != 0){
				result[count] = evenElements[counter];
					counter++;
				}
				else if(count % 2 == 0){ 
				result[count] = oddElements[counter1];
					counter1++;
			}
			
					
}
			
					return result;		
		

				

}
}

