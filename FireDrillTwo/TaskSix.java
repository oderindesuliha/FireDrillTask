 import java.util.Scanner;
public class TaskSix{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		
		int average = 0;
		int sum = 0;
		for(int count = 1; count <= 10; count++){
		
		System.out.print("Enter the score" + count + ": ");

			int score = input.nextInt();
				
					sum += score;
					average = sum / count;		
						
			}
			System.out.print("The average scores of even numbers:" + average);
			
				
	}
			}
