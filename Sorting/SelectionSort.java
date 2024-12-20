package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int minIndex;
		int[] arr = {6,9,8,7,5,4,2};
		
		for(int i=0;i<=arr.length-1;i++) {
			minIndex=i;
			for(int j=i+1; j<=arr.length-1;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		
		Arrays.stream(arr).forEach(System.out::print);

	}

}
