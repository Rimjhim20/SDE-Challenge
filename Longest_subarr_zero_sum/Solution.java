import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
         int sum = 0 ; 
        int length = 0 ;  
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();                for(int i = 0 ; i < arr.size() ; i++)
        { 
        sum  = sum+arr.get(i);
        if((sum == 0) && (arr.get(i) == 0) && (arr.size() == 1)){                          length = 1;
          }
            else if(sum == 0){
                length = i + 1; }
            Integer prev = hm.get(sum); 
            if(prev != null ){ 
                length = Math.max(length , i - prev);
            }else{
                hm.put(sum , i);
            }}
        return length;   
	}
}
