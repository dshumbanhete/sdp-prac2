package sdp.prac2;
import java.util.*;
import java.util.ArrayList;


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

    // Task 4 - Lathitha
    public static List<Integer> task4(List<Integer> firstList, List<Integer> secondList)
    {
        var newList = new ArrayList<Integer>();
        if(firstList.size() != secondList.size()) return null;
        for(int i = 0;i < firstList.size() ;i++) newList.add(firstList.get(i)*secondList.get(firstList.size()-i-1));
        return newList; 
    }
    // End of Task 4 -Lathitha

    //Task5 - Yeukai - sorted list
    public static boolean IsItSorted(List<Integer> list) {
        if (list.isEmpty() || list == null) {
            return true; //if the list is empty then return true
        }

        for (int i = 0; i < list.size() -1; i++) {
            if (list.get(i) > list.get(i+1)) {
                return false; //if any element is greater than the element after it, return false
            }    
        }
        return true; //if elemnets are all in order then return true
    }

}

//method by g18s0463 used to add up the elements in a indexed by b

