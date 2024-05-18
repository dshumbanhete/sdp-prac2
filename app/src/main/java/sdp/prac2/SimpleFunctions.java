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
}

//method by g18s0463 used to add up the elements in a indexed by b

