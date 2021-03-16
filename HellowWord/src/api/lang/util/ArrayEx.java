package api.lang.util;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,3,2,1};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		;
		System.out.println(Arrays.binarySearch(arr, 6) );
	
		 int[]a = Arrays.copyOf(arr,arr.length);
		 int[]b = Arrays.copyOfRange(arr,2,3);
		 
	
		 System.out.println(Arrays.toString(a));

		 System.out.println(Arrays.toString(b));

	}

}
