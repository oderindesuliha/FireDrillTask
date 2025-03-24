import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskFiveTest {

	@Test
	public void testThatFunctionExists() {
        int[] evenElements =  {1, 2, 3, 5, 6, 6};
        int[] expected = {2, 5, 6};
        int[] result = TaskFive.taskFive(evenElements);
        assertArrayEquals(expected, result);
   
	
	}
}
