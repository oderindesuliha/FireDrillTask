import java.util.Arrays;
public class InputArray{
	public static void main(String...args){



int[][] input = {{1,2,3},{4,5,6}};
int[][] result = array(input);
System.out.print(result);
}


	public static int[][] array(int[][] input){
 		for(int count = 0; count < input.length; count++){
		int[][] result = new int[input.length][input[0].length];

			for(counter = 0; counter < input[count].length; counter++){

			
				int[] newArray = input[0][count][counter];
				int[] newArray1 = input[1][count][counter];
				int[] newArray2 = input[2][count][counter];

			int[][] result = [newArray][newArray1][newArray];
}
	}
			
			return result;

		}
				



}