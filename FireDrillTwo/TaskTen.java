import java.util.Scanner;
public class TaskTen{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		int sum = 0;
		int average = 0;
		for(int count = 1; count < 10; count++){					
		System.out.print("Enter the score" + count + ": ");
			int score = input.nextInt();
						
				if(score >= 0 && score <= 100){
				
				sum += score;
				average = sum / count;
			}	
			
		}
			System.out.print("The average of valid scores is:" + average);
			
			
			
		
}

}
