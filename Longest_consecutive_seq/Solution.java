import java.util.* ;
import java.io.*; 
public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
         TreeSet<Integer> ts=new TreeSet<>();
        
        for(int i=0;i<arr.length;i++)
            ts.add(arr[i]);
        
        int current_count=0,max=0,previous_number=0;
        
        for(int current_number:ts){
            
            if(current_number-1==previous_number||current_count==0)
                current_count++;
            else 
                current_count=1;
            
            previous_number=current_number;//as operation finished of current number
            max=Math.max(current_count,max);
            
        }
        
        return max;
    }
}