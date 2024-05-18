package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;


public class SimpleFunctionsTest {
    //Task 1 tests - Dean
    //End of Task 1 tests - Dean

    //Task 2 tests - Sandisa
    //End of Task 2 tests - Sandisa

    //Task 3 tests - Tessa
    //End of Task 3 tests - Tessa

    //Task 4 tests - Lathitha
    @Test
    void runTask4Tests()
    {
        // Test lists with different lengths
        assertEquals(null, SimpleFunctions.task4(Arrays.asList(1, 2), Arrays.asList(1)));

        // Test empty lists
        assertEquals(Arrays.asList(), SimpleFunctions.task4(Arrays.asList(), Arrays.asList()));

        // Test when list a is the same as list b
        assertEquals(Arrays.asList(5, 8, 9, 8, 5),SimpleFunctions.task4(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(1, 2, 3, 4, 5)));

        // Test uncommon lists
        assertEquals(Arrays.asList(0, -60, 704, -756, 900, 539, 5),SimpleFunctions.task4(Arrays.asList(0, -10, 11, 21, -50, 77, 1), Arrays.asList(5, 7, -18, -36, 64, 6, 2)));
    }
    //End of Task 4 tests - Lathitha

    //Task 5 tests - Yuki
    //End of Task 5 tests - Yuki

    //Task 6 tests - Alisha
    //End of Task 6 tests - Alisha
}
