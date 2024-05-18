package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleFunctionsTest {
    //Task 4 tests - Lathitha
    @Test
    public static void runTask4Tests()
    {
        assertEquals(new int[]{},SimpleFunctions.task4(new int[]{},new int[]{}));
        assertEquals(null,SimpleFunctions.task4(new int[]{1,2},new int[]{1}));
        assertEquals(new int[]{5,8,9,8,5},SimpleFunctions.task4(new int[]{1,2,3,4,5},new int[]{1,2,3,4,5}));
        assertEquals(new int[]{0,-60,704,-756,900,539,5},SimpleFunctions.task4(new int[]{0,-10,11,21,-50,77,1},new int[]{5,7,-18,-36,64,6,2}));
    }
    //End of Task 4 tests - Lathitha
}
