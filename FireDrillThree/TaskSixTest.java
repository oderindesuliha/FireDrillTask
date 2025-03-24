import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskSixTest {

	@Test
	public void testThatFunctionExists() {
        int[] evenElements =  {1, 2, 3, 5, 6, 6};
        int expected = 10;
        int result = TaskSix.taskSix(evenElements);
        assertEquals(expected, result);
   
	
	}
}
