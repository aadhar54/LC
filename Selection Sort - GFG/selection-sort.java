//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends

/*

4 5 3 1 9
1 5 3 4 9
1 3 5 4 9
*/
class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        return 0;
	}
	
	 void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0; i < n - 1; i++){
	        int minIndex = i;
	        for(int j = i; j < arr.length; j++){
	            if(arr[j] < arr[minIndex]){
	                minIndex = j;
	            }
	        }
	        swap(arr, i , minIndex);
	    }
	}
	private void swap(int [] arr, int index1, int index2){
	    int temp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = temp;
	}
	
}