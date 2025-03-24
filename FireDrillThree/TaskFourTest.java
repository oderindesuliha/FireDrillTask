import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskFourTest {

	@Test
	public void testThatFunctionExists() {
        int[] evenElements =  {1, 2, 3, 5, 6, 6};
        int[] expected = {1, 3, 6};
        int[] result = TaskFour.taskFour(evenElements);
        assertArrayEquals(expected, result);
   
	
	}
}
