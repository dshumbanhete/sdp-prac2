package sdp.prac2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SimpleFunctionsTest {
    //Task 1 tests - for Dean by Alisha
    // Test case with valid indexes within the range of array 'a'
    @Test
    public void testTask1_WithValidIndices() {
        // Arrange: Set up the input arrays and the SimpleFunctions instance
        SimpleFunctions sf = new SimpleFunctions();
        ArrayList<Integer> a =new ArrayList<>(); 
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40); 
        a.add(50); // Array 'a' with integers
        ArrayList<Integer> b = new ArrayList<>();
        b.add(0);
        b.add(2);
        b.add(4); // Array 'b' with valid indexes

        // Act: Call Task1 method with the input arrays
        int result = (int) sf.Task1(a, b);

        // Assert: Check if the result is the expected sum of elements at specified indexes
        assertEquals(90, result); // Expected result is 10 + 30 + 50 = 90
    }
    // Test case with some indexes out of range for array 'a'
    @Test
    public void testTask1_WithOutOfRangeIndices() {
        // Arrange: Set up the input arrays and the SimpleFunctions instance
        SimpleFunctions sf = new SimpleFunctions();
        ArrayList <Integer> a =new ArrayList<>(); // Array 'a' with integers
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40); 
        a.add(50);
        ArrayList <Integer> b = new ArrayList<>(); // Array 'b' with one out-of-range index (5)
        b.add(1);
        b.add(5);
        b.add(3);

        // Act: Call Task1 method with the input arrays
        int result = (int) sf.Task1(a, b);

        // Assert: Check result are expected sum of elements at valid indices
        assertEquals(60, result); // Expected result is 20 + 40 = 60 (ignores index 5)
    }
    //End of Task 1 tests - for Dean by Alisha
    //Task 2 tests - for Sandisa by Dean
    public void testTask2_WithValidInput() {
        // Arrange: Set up the input arrays 
        SimpleFunctions sf2 = new SimpleFunctions();
        ArrayList<String> a = new ArrayList<>(); // Array 'a' with strings
        a.add("Farmer");
        a.add("Fishmonger");
        a.add("Butcher");
        a.add("Baker");
        ArrayList<String> expected = new ArrayList<>(); // Array 'expected' with altered strings
        a.add("armer");
        a.add("ishmonger");
        a.add("utcher");
        a.add("aker");
        // Act: Call Task2 method with the input array
        ArrayList<String> response = sf2.task2(a);

        // Assert: Check if the result is the same as the expected array
        assertEquals(expected, response);
    }
    // Test case with some more odd inputs
    @Test
    public void testTask2_EdgeCases() {
        // Arrange: Set up the input arrays and the SimpleFunctions instance
        SimpleFunctions sf2 = new SimpleFunctions();
        ArrayList<String> a = new ArrayList<>(); // Array 'a' with strings
        a.add("!Tailor");
        a.add(" Spaceexplorer");
        a.add("  \n");
        a.add(" ");
        ArrayList<String> expected = new ArrayList<>(); // Array 'expected' with altered strings
        a.add("Tailor");
        a.add("Spaceexplorer");
        a.add("\n");
        // Act: Call Task1 method with the input arrays
        ArrayList<String> response = sf2.task2(a);

        // Assert: Check result are expected sum of elements at valid indices
        assertEquals(expected, response); // Expected result is 20 + 40 = 60 (ignores index 5)
    }
    

    //End of Task 2 tests - Sandisa

    //Task 3 tests - for Tessa
   @Test
    public void Task3Tests(){
        SimpleFunctions tasks=new SimpleFunctions();
        String data1="()))"; //input1 ,number of ( and ) not matching
        String data2="()";// input2, number of (and )  does match
        String data3="((()))"; //input3 ,number of ( and ) not matching
        String data4="(";//input4 ,number of ( and ) not matching
        // expected results of the inputs
        Boolean expected1=false; 
        Boolean expected2=true;
        Boolean expected3=true;
        Boolean expected4=false;
        // the actual results of the inputs
        Boolean result1= tasks.task3(data1);
        Boolean result2=tasks.task3(data2);
        Boolean result3=tasks.task3(data3);
        Boolean result4=tasks.task3(data4);
        
        assertEquals(expected1,result1);
        assertEquals(expected2,result2);
        assertEquals(expected3,result3);
        assertEquals(expected4,result4);

    }



    //End of Task 3 tests - for Tessa

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

    //Task 5 tests - for Yuki, by Tessa
    @Test
    public void testTask5() {
        assertEquals(
            sdp.prac2.SimpleFunctions.IsItSorted(Arrays.asList()), //empty list
            true
        );
        assertEquals(
            sdp.prac2.SimpleFunctions.IsItSorted((null)), //null
            true
        );
        assertEquals(
            sdp.prac2.SimpleFunctions.IsItSorted(Arrays.asList(1,2,3)), //sorted list
            true
        );
        assertEquals(
            sdp.prac2.SimpleFunctions.IsItSorted(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12)),//big sorted list
            true
        );
        assertEquals(
            sdp.prac2.SimpleFunctions.IsItSorted(Arrays.asList(-2,-1,0,1,2)),//sorted list with negatives
            true
        );
        assertEquals(
            sdp.prac2.SimpleFunctions.IsItSorted(Arrays.asList(1,3,2)),//unsorted list!!
            false
        );
        assertEquals(
            sdp.prac2.SimpleFunctions.IsItSorted(Arrays.asList(1,1,1,1,1,1,1,1)), //all the same!!
            true
        );
        assertEquals(
            sdp.prac2.SimpleFunctions.IsItSorted(Arrays.asList(-1,-2,-3,-4)),//backwards negatives
            true
        );

    }

    //End of Task 5 tests - for Yuki, by Tessa

    //Task 6 tests - Alisha - Done by Yuki
    @Test
    public void testTask6_WithValidInput() {
        SimpleFunctions sf = new SimpleFunctions();
        List<Integer> numbers = Arrays.asList(150,250,350,450,550);
        List<Integer> expected = Arrays.asList(200,300,400,500,600);
        List<Integer> result = sf.task6(numbers);
        assertEquals(expected, result);
    }
    //End of Task 6 tests - Alisha - Done by Yuki
}
