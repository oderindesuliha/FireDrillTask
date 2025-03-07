public class TaskSeven{
	public static void main(String[] args){

	for(int counter = 4; counter<= 10; counter+=4){
		int number = 1;
		int total = 0;
		
			for(int count = 1;count <= 5; count ++){
				number = counter*number;
				total +=number;
			}
			
			System.out.print(total + " ");		
		

	}

	}


}