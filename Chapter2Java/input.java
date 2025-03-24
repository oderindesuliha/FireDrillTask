import java.util.Arrays
public class InputArray{
	public static void main(String...args){



int[][] input = {{1,2,3},{4,5,6}};
int[][][] result = new(input);
System.out.print(result);
}


	public static int[][] new(int[] input){
 		for(int count = 0; count < input.length; count++){
		int[][][] result = new int[input.length][input[0].length][input[0].length];

			for(counter = 0; counter < input[count].length; counter++){

			for(index = 0; index < input[count].length; index++){


				result = input[count][counter][index];
	}
			}
			return result;

		}
				



}