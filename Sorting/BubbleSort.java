package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6,9,8,7,5,4,2};
		boolean swapped;
		for(int i=0;i<arr.length-1; i++) {
			swapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped=true;
				}
			}			
			if(!swapped) {
				break;
			}
		}
		
		Arrays.stream(arr).forEach(System.out::print);

	}

}
