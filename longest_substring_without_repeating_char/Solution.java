import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
            int maxLen = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<Character>();
        int left = 0;
        for(int right = 0; right < input.length();right++){
            if(set.contains(input.charAt(right))){
                while(left<right && set.contains(input.charAt(right))){
                    set.remove(input.charAt(left));
                    left++;
                }
            }
            set.add(input.charAt(right));
            maxLen = Math.max(maxLen, right - left +1);
        }
        return maxLen;
	}
}

