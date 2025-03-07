import java.util.Scanner;
public class TaskThree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		int sum = 0;
		int average = 0;
		
		for(int count = 1; count <= 10; count++){
		System.out.print("Enter the score" + count + ": ");
			int score = input.nextInt();
				 sum += score;		
				average = sum / count;
			}
			
			
		System.out.print("The sum of scores is:" + sum);
	
		System.out.println("The average of scores is:" + average);
}

}
