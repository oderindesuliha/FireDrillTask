 import java.util.Scanner;
public class TaskFour{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		

		int sum = 0;
		for(int count = 1; count <= 10; count++){
		
		System.out.print("Enter the score" + count + ": ");

			int score = input.nextInt();

				if(count % 2 == 0){

					sum += count;

				}		
	
		}
		System.out.print("The sum of scores in even indexes:" + sum);
		
				
	}
			
		}

