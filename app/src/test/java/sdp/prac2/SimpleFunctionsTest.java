package sdp.prac2;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SimpleFunctionsTest {
    //Task 1 tests - for Dean by Alisha
    // Test case with valid indexes within the range of array 'a'
    @Test
    public void testTask1_WithValidIndices() {
        // Arrange: Set up the input arrays and the SimpleFunctions instance
        SimpleFunctions sf = new SimpleFunctions();
        int[] a = {10, 20, 30, 40, 50}; // Array 'a' with integers
        int[] b = {0, 2, 4}; // Array 'b' with valid indexes

        // Act: Call Task1 method with the input arrays
        int result = sf.Task1(a, b);

        // Assert: Check if the result is the expected sum of elements at specified indexes
        assertEquals(90, result); // Expected result is 10 + 30 + 50 = 90
    }
    // Test case with some indexes out of range for array 'a'
    @Test
    public void testTask1_WithOutOfRangeIndices() {
        // Arrange: Set up the input arrays and the SimpleFunctions instance
        SimpleFunctions sf = new SimpleFunctions();
        int[] a = {10, 20, 30, 40, 50}; // Array 'a' with integers
        int[] b = {1, 5, 3}; // Array 'b' with one out-of-range index (5)

        // Act: Call Task1 method with the input arrays
        int result = sf.Task1(a, b);

        // Assert: Check result are expected sum of elements at valid indices
        assertEquals(60, result); // Expected result is 20 + 40 = 60 (ignores index 5)
    }
    //End of Task 1 tests - for Dean by Alisha

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
