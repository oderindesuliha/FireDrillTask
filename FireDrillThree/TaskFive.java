import java.util.Scanner;
import java.util.Arrays;
public class TaskFive{
	public static void main(String[] args){
				

	int[] elements = {1, 2, 3, 5, 6, 6};
	int[] result = taskFive(elements);
	System.out.print(Arrays.toString(result));	
	}
	
	public static int[] taskFive(int[] elements){
	int[] result = new int[elements.length/2];
	int counter = 0;		
		for(int count = 0; count < elements.length; count++){				
					if(count % 2 != 0){
				result[counter++] = elements[count];
}
			}
			
					

			
					return result;		
		

				

}
}

