
/*Given an integer array A containing N integers.

You can perform a certain type of operation on this array A i.e you can select any number of elements from the array A and change it to whatever value you want.

Initially the Product of elements of the array A is ODD you need to find the total number of distinct operations (modulo 109 + 7) you can perform to make the product of array EVEN.

Two operations are said to be different if there exist atleast one element which is not selected in the other operation.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 106



Input Format
First and only argument is an integer array A.



Output Format
Return a single integer denoting the total number of distinct operations (modulo 109 + 7) you can perform to make the product of array A as EVEN.



Example Input
Input 1:

 A = [1, 3]
Input 2:

 A = [3]


Example Output
Output 1:

 3
Output 2:

 1 */

import java.util.ArrayList;

public class EvenProduct {


public int solve(ArrayList<Integer> A) {
        
    int req=1;
        
       for(int i=0; i<A.size(); i++)
       {
            req = req*2;    //System.out.print(req*2 + " ");
            req %= 1000000007; 
       }
        
        return req-1;
    }

    
}
