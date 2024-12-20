import java.util.ArrayList;
import java.util.List;

class GFG
{
	static int search(int ar[],int size){
		    int a = 0, b = size - 1;
		    int mid = 0;
		    while ((b - a) > 1)
		    {
		        mid = (a + b) / 2;
		        if ((ar[a] - a) != (ar[mid] - mid))
		            b = mid;
		        else if ((ar[b] - b) != (ar[mid] - mid))
		            a = mid;
		    }
		    return (ar[a] + 1);
	}
	
	public static void printMissingElements(int arr[], int N)
	  {
	    int cnt = 0;
	    for (int i = arr[0]; i <= arr[N - 1]; i++)
	    {
	 
	      // Check if number is equal to the first element in
	      // given array if array element match skip it increment for next element
	      if (arr[cnt] == i)
	      {
	    	// Increment the count to check next element
	        cnt++;
	      }
	      else
	      {
	 
	        // Print missing number
	        System.out.print(i + " ");
	      }
	    }
	  } 
	
	
	static void missingNum(int[] arr) {
		int size = arr.length;
		int count=0;
		
		for(int i=arr[0]; i<=arr[size-1];i++) {
			if(arr[count]==i) {
				count++;
				
			}else {
				System.out.print(i+" ");
			}
		}
		
	}
	
	static void x(int n) {
		if(n>=0) {
			x(n-1);
		}
		
		System.out.print(n);
	}
	// Driver Code
	public static void main (String[] args)
	{
	   /* int ar[] = {1,2,4,7,8,9};
	    int size = ar.length;
	    System.out.println("Missing number: " +
	                        search(ar, size));
	    printMissingElements(ar, size);
	    System.out.println("+++++++++++");
	    missingNum(ar);*/
		x(2);
	}
}
 