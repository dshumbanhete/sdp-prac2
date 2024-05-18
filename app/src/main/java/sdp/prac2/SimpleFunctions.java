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
    public static int[] task4(int[] firstList, int[] secondList)
    {
        if(firstList.length != secondList.length) return null;
        for(int i = 0;i < firstList.length ;i++) firstList[i] *= secondList[firstList.length-i-1];
        return firstList; 
    }
    // End of Task 4 -Lathitha
}

//method by g18s0463 used to add up the elements in a indexed by b

