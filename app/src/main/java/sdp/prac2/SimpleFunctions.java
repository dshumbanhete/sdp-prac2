package sdp.prac2;
import java.util.*;


public class SimpleFunctions {
    public SimpleFunctions() {}
    public int Task1(int[] a, int[] b){
        int ans=0;
        for (int i=0; i<b.length; i++){
            if (b[i]<a.length){
            ans+=a[b[i]];
            }
        }
        return ans;
    } 
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
    //Yuki testing something

    // Task 6 - Alisha (g22s7874)
    public static List<Integer> task6(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            int rounded = ((number + 99) / 100) * 100;
            result.add(rounded);
        }
        return result;
    }
    // End of Task 6 - Alisha
}

//method by g18s0463 used to add up the elements in a indexed by b

