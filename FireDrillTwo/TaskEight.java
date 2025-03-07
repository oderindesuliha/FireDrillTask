import java.util.Scanner;
public class TaskEight{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		int sum = 0;
		for(int count = 1; count <= 10; count++){					
		System.out.print("Enter the score" + count + ": ");
			int score = input.nextInt();
				if(score < 0 || score > 100){
					
				 sum += score;	
			}	
		}
			
			
			
		System.out.print("The sum of scores is:" + sum);
}

}
