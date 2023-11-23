//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int start = 0;
        int end = arr.length - 1;
        return binarySearchHelper(arr, start, end , k);
    }
    
    // 1 2 3 4
    // k = 5
    // s = 0, e = 3, mid = 1
    // s = 2, e = 3 , mid = 2
    // s = 3, e = 3, mid = 3
    // s = 4, e = 3
    
    private int binarySearchHelper(int [] arr, int start, int end, int k) {
        while(start <= end){
            int midIndex = (start + end)/2;
            int midEl = arr[midIndex];
            
            if(midEl < k){
                start = midIndex + 1;
            }else if(midEl > k){
                end = midIndex - 1;
            }else{
                return midIndex;
            }
        }
        
        return -1;
    }
}