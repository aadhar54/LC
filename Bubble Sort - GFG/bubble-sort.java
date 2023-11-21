//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

/*
// 6 3 7 1 0
3 6 7 1 0
3 6 1 7 0
3 6 1 0 7

// 3 6 1 0 7
3 1 6 0 7
3 1 0 6 7
*/

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        for(int i = 0; i < n - 1; i++ ){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    
    private static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

//{ Driver Code Starts.

class Sorting
{
    //method to print the Elements of the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //taking total elements
			int n = sc.nextInt();
			
			//creating a new array of length n
			int arr[] = new int[n];
			
			//inserting elements to the array
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt(); 
			}
			
			
			//calling bubbleSort() method
			new Solution().bubbleSort(arr,n);
			
			//calling printArray() method
			printArray(arr);
			
		t--;	
		}
	}

}
// } Driver Code Ends