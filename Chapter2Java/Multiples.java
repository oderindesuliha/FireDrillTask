public class Multiples{

	public static void main(String[] args){
	
	
	int number1 = 8;
	int number2 = 64;

	
	int number1Thrice = number1 * number1 * number1;
	int number2Double = number2 * number2;
	
	if(number2Double % number1Thrice == 0){
	System.out.printf("The Multiple  of %d is %d" , number2Double, number1Thrice);
	}
}
}