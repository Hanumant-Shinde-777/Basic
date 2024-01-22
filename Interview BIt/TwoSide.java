/*Given an integer array A of size N.

You have to pick exactly B elements from either left or right end of the array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4 and array A contains 10 elements then

You can pick the first four elements or can pick the last four elements or can pick 1 from the front and 3 from the back etc. you need to return the maximum possible sum of elements you can pick.


Problem Constraints
1 <= N <= 105

1 <= B <= N

-103 <= A[i] <= 103



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the maximum possible sum of elements you picked.



Example Input
Input 1:

 A = [5, -2, 3 , 1, 2]
 B = 3
Input 2:

 A = [1, 2]
 B = 1

import java.util.ArrayList;

public class Solution {
    
    public int solve(ArrayList<Integer> A, int B) {
        int size = A.size();
        int maxSum = 0;
        for(int i=0; i<B; i++) {
            maxSum += A.get(i);
        }
        if(B == size) {
            return maxSum;
        }
        
        int localSum = maxSum;
        int startPointer = B - 1;   
        int endPointer = size - 1;  
        
        for(int i=startPointer; i>=0; i--) {
            localSum -= A.get(i);
            localSum += A.get(endPointer);
            
            maxSum = Math.max(localSum, maxSum);
            endPointer--;
        }
        
        
        return maxSum;
    }
}

*/



