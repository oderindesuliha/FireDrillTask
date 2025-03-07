public class TaskEight{
	public static void main(String[] args){
	int total = 0;
	
	for(int counter = 4;counter <= 10; counter+=4){
		int number = 1;
		
			
			for(int count = 1;count <= 5; count ++){
				number = counter*number;
				total +=number;
			
			}
				
		
			
	}
			System.out.print(total + " ");	
	}


}