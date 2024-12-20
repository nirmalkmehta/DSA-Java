package Sorting;

import java.util.Arrays;

public class InsertionSort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		int current;
		
		int[] arr = {6,9,8,7,5,4,2};
		
		for(int i=0;i<=arr.length-1;i++) {
			current=arr[i];
			j = i-1;
			while(j>=0 && arr[j]>current) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=current;
		}

		Arrays.stream(arr).forEach(System.out::print);
	}

}
