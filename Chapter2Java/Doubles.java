import java.util.Arrays;
public class Doubles{
	public static void main(String... args){



int[] numbers = {1,5,2,6,10};
int[] result = multiples(numbers);
System.out.print(Arrays.toString(result));

	}
	public static int[] multiples(int[] numbers){
		for(int count = 0; count < numbers.length; count++){

			if(numbers[count] % 2 == 0)
			numbers[count] = numbers[count] * numbers[count];
			else 
			numbers[count] = numbers[count] * 2;
		}

		return numbers;
}

}