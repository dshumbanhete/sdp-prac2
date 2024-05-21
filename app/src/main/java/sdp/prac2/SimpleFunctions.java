package sdp.prac2;
import java.util.*;

//Task 1
public class SimpleFunctions {
    public SimpleFunctions() {}
    public int Task1(ArrayList<Integer> a, ArrayList<Integer> b){
        Integer ans=0;
        for (int i=0; i<b.size(); i++){//iterate through the list using lists size as terminating condition
            if (b.get(i)<a.size()){//check that the index is in bounds
            ans+=a.get(b.get(i));//add the element to the accumulator
            }
        }
        return ans;//return the accumulator
    } 
    //method by g18s0463 used to add up the elements in a indexed by b
    //TASK2
    public static ArrayList<String> task2(ArrayList<String> input){ // by g21s1812

        ArrayList<String>output = new ArrayList<>();// create a new arraylist 
        
        for(int i=0;i<input.size();i++){
            String element = input.get(i);// get one element at a time
            if(element.length()>0){ // if length of element is greater than 0
                output.add(element.substring(1)); // add element in the arraylist starting from character 2
            }
        }
       
        return output; 
    }

    // Task 4 - Lathitha
    public static List<Integer> task4(List<Integer> firstList, List<Integer> secondList)
    {
        var newList = new ArrayList<Integer>();
        if(firstList.size() != secondList.size()) return null;
        for(int i = 0;i < firstList.size() ;i++) newList.add(firstList.get(i)*secondList.get(firstList.size()-i-1));
        return newList; 
    }
    // End of Task 4 -Lathitha 

    //Task5 - Yeukai g22r8653 - sorted list
    public static boolean IsItSorted(List<Integer> list) { //returns a boolean - true or false
        if (list.isEmpty() || list == null) { //if the list is empty
            return true; //if the list is empty then return true
        }

        for (int i = 0; i < list.size() -1; i++) { //for loop
            if (list.get(i) > list.get(i+1)) { //if statement
                return false; //if any element is greater than the element after it, return false
            }    
        }
        return true; //if elemnets are all in order then return true
    } //End of task 5 -Yeukai
    
    // Task 6 - Alisha (g22s7874)
    public List<Integer> task6(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            int rounded = ((number + 99) / 100) * 100;
            result.add(rounded);
        }
        return result;
    }
    // End of Task 6 - Alisha


}



