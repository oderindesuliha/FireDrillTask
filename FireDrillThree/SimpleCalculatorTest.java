import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class SimpleCalculatorTest{
	
	//@Test
	public void testThatCalculatorCanAddTwoNumbers( ){
		//Precondition
		SimpleCalculator myCalculator = new SimpleCalculator();

		//Action
		int sum = myCalculator.add(2, 4);

		//Assert/Check
		assertEquals(6, sum);

		
}
		public void sayHello(String name){
		System.out.print("Hello  " +name);

}
	@Test
	public void testThatCalculatorCanSubtractTwoNumbers( ){
	
		SimpleCalculator myNumber = new SimpleCalculator();

		int minus = myNumber.subtract(10, 5);

		assertEquals(5, minus);

}
	@Test
	public void testThatChecksToAddAsManyNumbers(){

		SimpleCalculator myNumber = new SimpleCalculator();
		int multiplication = myNumber.multiply(10);
		assertEquals(3, multiplication);

}
	
    	@Test
	public void testThatChecksToMultiplyNumbers(){

		SimpleCalculator myNumbers = new SimpleCalculator();
		int multiplication = myNumbers.multiply(10, 10, 5);
		assertEquals(500, multiplication);
}

	@Test
	public void testThatChecksToMultiplyNumbersWithoutOperator(){

		SimpleCalculator myNumbers = new SimpleCalculator();
		int multiplication = myNumbers.multiply(10, 10);
		assertEquals(100, multiplication);
}

}