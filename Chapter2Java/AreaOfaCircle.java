import java.util.Scanner;
public class AreaOfaCircle{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your radius: ");
	
	float radius = input.nextInt(); 
		
	System.out.printf("The Diameter is %.2f%n" , 2 * radius);
	System.out.printf("The Circumference is %.2f%n" , 2 * 3.14159 * radius);
	System.out.printf("The Area is %.2f" , 2 * radius * radius);


}
}