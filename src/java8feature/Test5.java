package java8feature;

import java.util.Arrays;

public class Test5 {
	
	public static boolean checkEquality(int arr1[],int arr2[]) {
		
		int a1 = arr1.length;
		int a2 = arr2.length;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(a1!=a2)
			return false;
		
		for(int i=0;i<a1;i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,2,5,6};
		int[] arr2 = {1,2,3,5,6};
		
		boolean b = Test5.checkEquality(arr1, arr2);
		System.out.println(b);
	}

}
