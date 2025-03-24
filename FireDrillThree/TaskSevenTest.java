import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskSevenTest {

	@Test
	public void testThatFunctionExists() {
        int[] oddElements =  {1, 2, 3, 5, 6, 6};
        int expected = 13;
        int result = TaskSeven.taskSeven(oddElements);
        assertEquals(expected, result);
   
	
	}
}

