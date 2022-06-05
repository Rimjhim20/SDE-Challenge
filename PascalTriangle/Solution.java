package PascalTriangle;

import java.util.* ;
import java.util.ArrayList;
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
			res.add(row);
		}
		return res;
    
    }
}



//codeStudio 

// public class Solution {
// 	public static ArrayList<ArrayList<Long>> printPascal(int n) {
//                  // Write your code here.
//          ArrayList<ArrayList<Long>> res = new ArrayList<ArrayList<Long>>();
//         ArrayList<Long> row, pre = null;
//        for(int i=0;i<n;i++){
//          row = new ArrayList<>();
//     for(int j=0;j<=i;j++){
//                  if(j==0|| j==i)
//                       row.add(1L);
//                      else
//                       row.add(pre.get(j-1)+pre.get(j));
//                 }
//            pre = row;
//             res.add(row);
//        }
//        return res;
// 	}
// }
