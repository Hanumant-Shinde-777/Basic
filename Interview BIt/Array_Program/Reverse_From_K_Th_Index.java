package Array_Program;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_From_K_Th_Index {
    public static void reverseArray(ArrayList<Integer> arr, int m)
	{
		Collections.reverse(arr.subList(m + 1, arr.size()));
	}
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		Collections.addAll(list, 1, 2 ,3, 4, 5,6, 6);
		System.out.println(list);
		int m = 3;
		reverseArray(list, m);
		System.out.println(list);

	}
}
